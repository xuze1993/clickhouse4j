package cc.blynk.clickhouse.integration;

import cc.blynk.clickhouse.ClickHouseArray;
import cc.blynk.clickhouse.ClickHouseDataSource;
import cc.blynk.clickhouse.domain.ClickHouseDataType;
import cc.blynk.clickhouse.settings.ClickHouseProperties;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.math.BigInteger;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

/**
 * Here it is assumed the connection to a ClickHouse instance with flights example data it available at localhost:8123
 * For ClickHouse quickstart and example dataset see
 * <a href="https://clickhouse.yandex/tutorial.html">https://clickhouse.yandex/tutorial.html</a>
 */
public class ArrayTest {

    private Connection connection;

    @BeforeTest
    public void setUp() throws Exception {
        ClickHouseProperties properties = new ClickHouseProperties();
        ClickHouseDataSource dataSource = new ClickHouseDataSource("jdbc:clickhouse://localhost:8123", properties);
        connection = dataSource.getConnection();
    }

    @Test
    public void testStringArray() throws SQLException {
        String[] array = {"a'','sadf',aa", "", ",", "юникод,'юникод'", ",2134,saldfk"};
        String arrayString = "'" + Stream.of(array)
                .map(s -> s.replace("'", "\\'"))
                .collect(Collectors.joining("','")) + "'";

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select array(" + arrayString + ")");
        while (rs.next()) {
            assertEquals(rs.getArray(1).getBaseType(), Types.VARCHAR);
            String[] stringArray = (String[]) rs.getArray(1).getArray();
            assertEquals(stringArray.length, array.length);
            for (int i = 0; i < stringArray.length; i++) {
                assertEquals(stringArray[i], array[i]);
            }
        }
        statement.close();
    }

    @Test
    public void testLongArray() throws SQLException {
        List<Long> list = Arrays.asList(-12345678987654321L, 23325235235L, -12321342L);
        String arrayString = "toInt64(" + list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("),toInt64(")) + ")";

        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select array(" + arrayString + ")");
        while (rs.next()) {
            assertEquals(rs.getArray(1).getBaseType(), Types.BIGINT);
            long[] longArray = (long[]) rs.getArray(1).getArray();
            assertEquals(longArray.length, list.size());
            for (int i = 0; i < longArray.length; i++) {
                assertEquals(longArray[i], list.get(i).longValue());
            }
        }
        statement.close();
    }

    @Test
    public void testInsertUIntArray() throws SQLException {
        connection.createStatement().execute("DROP TABLE IF EXISTS test.unsigned_array");
        connection.createStatement().execute(
                "CREATE TABLE IF NOT EXISTS test.unsigned_array"
                        + " (ua32 Array(UInt32), ua64 Array(UInt64), f64 Array(Float64)) ENGINE = TinyLog"
        );

        String insertSql = "INSERT INTO test.unsigned_array (ua32, ua64, f64) VALUES (?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(insertSql);

        statement.setArray(1, new ClickHouseArray(ClickHouseDataType.UInt64, new long[]{4294967286L, 4294967287L}));
        statement.setArray(2,
                           new ClickHouseArray(ClickHouseDataType.UInt64,
                                               new BigInteger[]{new BigInteger("18446744073709551606"), new BigInteger(
                                                       "18446744073709551607")}));
        statement.setArray(3, new ClickHouseArray(ClickHouseDataType.Float64, new double[]{1.23, 4.56}));
        statement.execute();

        statement = connection.prepareStatement(insertSql);

        statement.setObject(1, new Long[]{4294967286L, 4294967287L});
        statement.setObject(2, new BigInteger[]{
                new BigInteger("18446744073709551606"),
                new BigInteger("18446744073709551607")});
        statement.setObject(3, new Double[]{1.23, 4.56});
        statement.execute();

        Statement select = connection.createStatement();
        ResultSet rs = select.executeQuery("select ua32, ua64, f64 from test.unsigned_array");
        for (int i = 0; i < 2; ++i) {
            rs.next();
            Array bigUInt32 = rs.getArray(1);
            Assert.assertEquals(bigUInt32.getBaseType(), Types.INTEGER);
            Assert.assertEquals(bigUInt32.getArray().getClass(), long[].class);
            Assert.assertEquals(((long[]) bigUInt32.getArray())[0], 4294967286L);
            Assert.assertEquals(((long[]) bigUInt32.getArray())[1], 4294967287L);
            Array bigUInt64 = rs.getArray(2);
            Assert.assertEquals(bigUInt64.getBaseType(), Types.BIGINT);
            Assert.assertEquals(bigUInt64.getArray().getClass(), BigInteger[].class);
            Assert.assertEquals(((BigInteger[]) bigUInt64.getArray())[0], new BigInteger("18446744073709551606"));
            Assert.assertEquals(((BigInteger[]) bigUInt64.getArray())[1], new BigInteger("18446744073709551607"));
            Array float64 = rs.getArray(3);
            Assert.assertEquals(float64.getBaseType(), Types.DOUBLE);
            Assert.assertEquals(float64.getArray().getClass(), double[].class);
            Assert.assertEquals(((double[]) float64.getArray())[0], 1.23, 0.0000001);
            Assert.assertEquals(((double[]) float64.getArray())[1], 4.56, 0.0000001);
        }
    }

    @Test
    public void testInsertStringArray() throws SQLException {
        connection.createStatement().execute("DROP TABLE IF EXISTS test.string_array");
        connection.createStatement().execute(
                "CREATE TABLE IF NOT EXISTS test.string_array"
                        + " (sa Array(String)) ENGINE = TinyLog"
        );

        String insertSql = "INSERT INTO test.string_array (sa) VALUES (?)";

        PreparedStatement statement = connection.prepareStatement(insertSql);

        statement.setArray(1, new ClickHouseArray(ClickHouseDataType.String, new String[] {"a1", "b1"}));
        statement.execute();

        statement = connection.prepareStatement(insertSql);

        statement.setObject(1, new String[] {"a2", "b2"});
        statement.execute();

        Statement select = connection.createStatement();
        ResultSet rs = select.executeQuery("select sa from test.string_array");
        for (int i = 1; i <= 2; ++i) {
            rs.next();
            Array stringArray = rs.getArray(1);
            Assert.assertEquals(stringArray.getBaseType(), Types.VARCHAR);
            Assert.assertEquals(stringArray.getArray().getClass(), String[].class);
            Assert.assertEquals(((String[]) stringArray.getArray())[0], "a" + i);
            Assert.assertEquals(((String[]) stringArray.getArray())[1], "b" + i);
        }
    }
}

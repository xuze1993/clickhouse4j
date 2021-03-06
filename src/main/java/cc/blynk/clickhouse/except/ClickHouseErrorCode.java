package cc.blynk.clickhouse.except;

public final class ClickHouseErrorCode {

    public static final int OK = 0;
    public static final int UNSUPPORTED_METHOD = 1;
    public static final int UNSUPPORTED_PARAMETER = 2;
    public static final int UNEXPECTED_END_OF_FILE = 3;
    public static final int EXPECTED_END_OF_FILE = 4;
    public static final int CANNOT_PARSE_TEXT = 6;
    public static final int INCORRECT_NUMBER_OF_COLUMNS = 7;
    public static final int THERE_IS_NO_COLUMN = 8;
    public static final int SIZES_OF_COLUMNS_DOESNT_MATCH = 9;
    public static final int NOT_FOUND_COLUMN_IN_BLOCK = 10;
    public static final int POSITION_OUT_OF_BOUND = 11;
    public static final int PARAMETER_OUT_OF_BOUND = 12;
    public static final int SIZES_OF_COLUMNS_IN_TUPLE_DOESNT_MATCH = 13;
    public static final int DUPLICATE_COLUMN = 15;
    public static final int NO_SUCH_COLUMN_IN_TABLE = 16;
    public static final int DELIMITER_IN_STRING_LITERAL_DOESNT_MATCH = 17;
    public static final int CANNOT_INSERT_ELEMENT_INTO_CONSTANT_COLUMN = 18;
    public static final int SIZE_OF_FIXED_STRING_DOESNT_MATCH = 19;
    public static final int NUMBER_OF_COLUMNS_DOESNT_MATCH = 20;
    public static final int CANNOT_READ_ALL_DATA_FROM_TAB_SEPARATED_INPUT = 21;
    public static final int CANNOT_PARSE_ALL_VALUE_FROM_TAB_SEPARATED_INPUT = 22;
    public static final int CANNOT_READ_FROM_ISTREAM = 23;
    public static final int CANNOT_WRITE_TO_OSTREAM = 24;
    public static final int CANNOT_PARSE_ESCAPE_SEQUENCE = 25;
    public static final int CANNOT_PARSE_QUOTED_STRING = 26;
    public static final int CANNOT_PARSE_INPUT_ASSERTION_FAILED = 27;
    public static final int CANNOT_PRINT_FLOAT_OR_DOUBLE_NUMBER = 28;
    public static final int CANNOT_PRINT_INTEGER = 29;
    public static final int CANNOT_READ_SIZE_OF_COMPRESSED_CHUNK = 30;
    public static final int CANNOT_READ_COMPRESSED_CHUNK = 31;
    public static final int ATTEMPT_TO_READ_AFTER_EOF = 32;
    public static final int CANNOT_READ_ALL_DATA = 33;
    public static final int TOO_MUCH_ARGUMENTS_FOR_FUNCTION = 34;
    public static final int TOO_LESS_ARGUMENTS_FOR_FUNCTION = 35;
    public static final int BAD_ARGUMENTS = 36;
    public static final int UNKNOWN_ELEMENT_IN_AST = 37;
    public static final int CANNOT_PARSE_DATE = 38;
    public static final int TOO_LARGE_SIZE_COMPRESSED = 39;
    public static final int CHECKSUM_DOESNT_MATCH = 40;
    public static final int CANNOT_PARSE_DATETIME = 41;
    public static final int NUMBER_OF_ARGUMENTS_DOESNT_MATCH = 42;
    public static final int ILLEGAL_TYPE_OF_ARGUMENT = 43;
    public static final int ILLEGAL_COLUMN = 44;
    public static final int ILLEGAL_NUMBER_OF_RESULT_COLUMNS = 45;
    public static final int UNKNOWN_FUNCTION = 46;
    public static final int UNKNOWN_IDENTIFIER = 47;
    public static final int NOT_IMPLEMENTED = 48;
    public static final int LOGICAL_ERROR = 49;
    public static final int UNKNOWN_TYPE = 50;
    public static final int EMPTY_LIST_OF_COLUMNS_QUERIED = 51;
    public static final int COLUMN_QUERIED_MORE_THAN_ONCE = 52;
    public static final int TYPE_MISMATCH = 53;
    public static final int STORAGE_DOESNT_ALLOW_PARAMETERS = 54;
    public static final int STORAGE_REQUIRES_PARAMETER = 55;
    public static final int UNKNOWN_STORAGE = 56;
    public static final int TABLE_ALREADY_EXISTS = 57;
    public static final int TABLE_METADATA_ALREADY_EXISTS = 58;
    public static final int ILLEGAL_TYPE_OF_COLUMN_FOR_FILTER = 59;
    public static final int UNKNOWN_TABLE = 60;
    public static final int ONLY_FILTER_COLUMN_IN_BLOCK = 61;
    public static final int SYNTAX_ERROR = 62;
    public static final int UNKNOWN_AGGREGATE_FUNCTION = 63;
    public static final int CANNOT_READ_AGGREGATE_FUNCTION_FROM_TEXT = 64;
    public static final int CANNOT_WRITE_AGGREGATE_FUNCTION_AS_TEXT = 65;
    public static final int NOT_A_COLUMN = 66;
    public static final int ILLEGAL_KEY_OF_AGGREGATION = 67;
    public static final int CANNOT_GET_SIZE_OF_FIELD = 68;
    public static final int ARGUMENT_OUT_OF_BOUND = 69;
    public static final int CANNOT_CONVERT_TYPE = 70;
    public static final int CANNOT_WRITE_AFTER_END_OF_BUFFER = 71;
    public static final int CANNOT_PARSE_NUMBER = 72;
    public static final int UNKNOWN_FORMAT = 73;
    public static final int CANNOT_READ_FROM_FILE_DESCRIPTOR = 74;
    public static final int CANNOT_WRITE_TO_FILE_DESCRIPTOR = 75;
    public static final int CANNOT_OPEN_FILE = 76;
    public static final int CANNOT_CLOSE_FILE = 77;
    public static final int UNKNOWN_TYPE_OF_QUERY = 78;
    public static final int INCORRECT_FILE_NAME = 79;
    public static final int INCORRECT_QUERY = 80;
    public static final int UNKNOWN_DATABASE = 81;
    public static final int DATABASE_ALREADY_EXISTS = 82;
    public static final int DIRECTORY_DOESNT_EXIST = 83;
    public static final int DIRECTORY_ALREADY_EXISTS = 84;
    public static final int FORMAT_IS_NOT_SUITABLE_FOR_INPUT = 85;
    public static final int RECEIVED_ERROR_FROM_REMOTE_IO_SERVER = 86;
    public static final int CANNOT_SEEK_THROUGH_FILE = 87;
    public static final int CANNOT_TRUNCATE_FILE = 88;
    public static final int UNKNOWN_COMPRESSION_METHOD = 89;
    public static final int EMPTY_LIST_OF_COLUMNS_PASSED = 90;
    public static final int SIZES_OF_MARKS_FILES_ARE_INCONSISTENT = 91;
    public static final int EMPTY_DATA_PASSED = 92;
    public static final int UNKNOWN_AGGREGATED_DATA_VARIANT = 93;
    public static final int CANNOT_MERGE_DIFFERENT_AGGREGATED_DATA_VARIANTS = 94;
    public static final int CANNOT_READ_FROM_SOCKET = 95;
    public static final int CANNOT_WRITE_TO_SOCKET = 96;
    public static final int CANNOT_READ_ALL_DATA_FROM_CHUNKED_INPUT = 97;
    public static final int CANNOT_WRITE_TO_EMPTY_BLOCK_OUTPUT_STREAM = 98;
    public static final int UNKNOWN_PACKET_FROM_CLIENT = 99;
    public static final int UNKNOWN_PACKET_FROM_SERVER = 100;
    public static final int UNEXPECTED_PACKET_FROM_CLIENT = 101;
    public static final int UNEXPECTED_PACKET_FROM_SERVER = 102;
    public static final int RECEIVED_DATA_FOR_WRONG_QUERY_ID = 103;
    public static final int TOO_SMALL_BUFFER_SIZE = 104;
    public static final int CANNOT_READ_HISTORY = 105;
    public static final int CANNOT_APPEND_HISTORY = 106;
    public static final int FILE_DOESNT_EXIST = 107;
    public static final int NO_DATA_TO_INSERT = 108;
    public static final int CANNOT_BLOCK_SIGNAL = 109;
    public static final int CANNOT_UNBLOCK_SIGNAL = 110;
    public static final int CANNOT_MANIPULATE_SIGSET = 111;
    public static final int CANNOT_WAIT_FOR_SIGNAL = 112;
    public static final int THERE_IS_NO_SESSION = 113;
    public static final int CANNOT_CLOCK_GETTIME = 114;
    public static final int UNKNOWN_SETTING = 115;
    public static final int THERE_IS_NO_DEFAULT_VALUE = 116;
    public static final int INCORRECT_DATA = 117;
    public static final int TABLE_METADATA_DOESNT_EXIST = 118;
    public static final int ENGINE_REQUIRED = 119;
    public static final int CANNOT_INSERT_VALUE_OF_DIFFERENT_SIZE_INTO_TUPLE = 120;
    public static final int UNKNOWN_SET_DATA_VARIANT = 121;
    public static final int INCOMPATIBLE_COLUMNS = 122;
    public static final int UNKNOWN_TYPE_OF_AST_NODE = 123;
    public static final int INCORRECT_ELEMENT_OF_SET = 124;
    public static final int INCORRECT_RESULT_OF_SCALAR_SUBQUERY = 125;
    public static final int CANNOT_GET_RETURN_TYPE = 126;
    public static final int ILLEGAL_INDEX = 127;
    public static final int TOO_LARGE_ARRAY_SIZE = 128;
    public static final int FUNCTION_IS_SPECIAL = 129;
    public static final int CANNOT_READ_ARRAY_FROM_TEXT = 130;
    public static final int TOO_LARGE_STRING_SIZE = 131;
    public static final int CANNOT_CREATE_TABLE_FROM_METADATA = 132;
    public static final int AGGREGATE_FUNCTION_DOESNT_ALLOW_PARAMETERS = 133;
    public static final int PARAMETERS_TO_AGGREGATE_FUNCTIONS_MUST_BE_LITERALS = 134;
    public static final int ZERO_ARRAY_OR_TUPLE_INDEX = 135;
    public static final int UNKNOWN_ELEMENT_IN_CONFIG = 137;
    public static final int EXCESSIVE_ELEMENT_IN_CONFIG = 138;
    public static final int NO_ELEMENTS_IN_CONFIG = 139;
    public static final int ALL_REQUESTED_COLUMNS_ARE_MISSING = 140;
    public static final int SAMPLING_NOT_SUPPORTED = 141;
    public static final int NOT_FOUND_NODE = 142;
    public static final int FOUND_MORE_THAN_ONE_NODE = 143;
    public static final int FIRST_DATE_IS_BIGGER_THAN_LAST_DATE = 144;
    public static final int UNKNOWN_OVERFLOW_MODE = 145;
    public static final int QUERY_SECTION_DOESNT_MAKE_SENSE = 146;
    public static final int NOT_FOUND_FUNCTION_ELEMENT_FOR_AGGREGATE = 147;
    public static final int NOT_FOUND_RELATION_ELEMENT_FOR_CONDITION = 148;
    public static final int NOT_FOUND_RHS_ELEMENT_FOR_CONDITION = 149;
    public static final int NO_ATTRIBUTES_LISTED = 150;
    public static final int INDEX_OF_COLUMN_IN_SORT_CLAUSE_IS_OUT_OF_RANGE = 151;
    public static final int UNKNOWN_DIRECTION_OF_SORTING = 152;
    public static final int ILLEGAL_DIVISION = 153;
    public static final int AGGREGATE_FUNCTION_NOT_APPLICABLE = 154;
    public static final int UNKNOWN_RELATION = 155;
    public static final int DICTIONARIES_WAS_NOT_LOADED = 156;
    public static final int ILLEGAL_OVERFLOW_MODE = 157;
    public static final int TOO_MUCH_ROWS = 158;
    public static final int TIMEOUT_EXCEEDED = 159;
    public static final int TOO_SLOW = 160;
    public static final int TOO_MUCH_COLUMNS = 161;
    public static final int TOO_DEEP_SUBQUERIES = 162;
    public static final int TOO_DEEP_PIPELINE = 163;
    public static final int READONLY = 164;
    public static final int TOO_MUCH_TEMPORARY_COLUMNS = 165;
    public static final int TOO_MUCH_TEMPORARY_NON_CONST_COLUMNS = 166;
    public static final int TOO_DEEP_AST = 167;
    public static final int TOO_BIG_AST = 168;
    public static final int BAD_TYPE_OF_FIELD = 169;
    public static final int BAD_GET = 170;
    public static final int BLOCKS_HAS_DIFFERENT_STRUCTURE = 171;
    public static final int CANNOT_CREATE_DIRECTORY = 172;
    public static final int CANNOT_ALLOCATE_MEMORY = 173;
    public static final int CYCLIC_ALIASES = 174;
    public static final int CHUNK_NOT_FOUND = 176;
    public static final int DUPLICATE_CHUNK_NAME = 177;
    public static final int MULTIPLE_ALIASES_FOR_EXPRESSION = 178;
    public static final int MULTIPLE_EXPRESSIONS_FOR_ALIAS = 179;
    public static final int THERE_IS_NO_PROFILE = 180;
    public static final int ILLEGAL_FINAL = 181;
    public static final int ILLEGAL_PREWHERE = 182;
    public static final int UNEXPECTED_EXPRESSION = 183;
    public static final int ILLEGAL_AGGREGATION = 184;
    public static final int UNSUPPORTED_MYISAM_BLOCK_TYPE = 185;
    public static final int UNSUPPORTED_COLLATION_LOCALE = 186;
    public static final int COLLATION_COMPARISON_FAILED = 187;
    public static final int UNKNOWN_ACTION = 188;
    public static final int TABLE_MUST_NOT_BE_CREATED_MANUALLY = 189;
    public static final int SIZES_OF_ARRAYS_DOESNT_MATCH = 190;
    public static final int SET_SIZE_LIMIT_EXCEEDED = 191;
    public static final int UNKNOWN_USER = 192;
    public static final int WRONG_PASSWORD = 193;
    public static final int REQUIRED_PASSWORD = 194;
    public static final int IP_ADDRESS_NOT_ALLOWED = 195;
    public static final int UNKNOWN_ADDRESS_PATTERN_TYPE = 196;
    public static final int SERVER_REVISION_IS_TOO_OLD = 197;
    public static final int DNS_ERROR = 198;
    public static final int UNKNOWN_QUOTA = 199;
    public static final int QUOTA_DOESNT_ALLOW_KEYS = 200;
    public static final int QUOTA_EXPIRED = 201;
    public static final int TOO_MUCH_SIMULTANEOUS_QUERIES = 202;
    public static final int NO_FREE_CONNECTION = 203;
    public static final int CANNOT_FSYNC = 204;
    public static final int NESTED_TYPE_TOO_DEEP = 205;
    public static final int ALIAS_REQUIRED = 206;
    public static final int AMBIGUOUS_IDENTIFIER = 207;
    public static final int EMPTY_NESTED_TABLE = 208;
    public static final int SOCKET_TIMEOUT = 209;
    public static final int NETWORK_ERROR = 210;
    public static final int EMPTY_QUERY = 211;
    public static final int UNKNOWN_LOAD_BALANCING = 212;
    public static final int UNKNOWN_TOTALS_MODE = 213;
    public static final int CANNOT_STATVFS = 214;
    public static final int NOT_AN_AGGREGATE = 215;
    public static final int QUERY_WITH_SAME_ID_IS_ALREADY_RUNNING = 216;
    public static final int CLIENT_HAS_CONNECTED_TO_WRONG_PORT = 217;
    public static final int TABLE_IS_DROPPED = 218;
    public static final int DATABASE_NOT_EMPTY = 219;
    public static final int DUPLICATE_INTERSERVER_IO_ENDPOINT = 220;
    public static final int NO_SUCH_INTERSERVER_IO_ENDPOINT = 221;
    public static final int ADDING_REPLICA_TO_NON_EMPTY_TABLE = 222;
    public static final int UNEXPECTED_AST_STRUCTURE = 223;
    public static final int REPLICA_IS_ALREADY_ACTIVE = 224;
    public static final int NO_ZOOKEEPER = 225;
    public static final int NO_FILE_IN_DATA_PART = 226;
    public static final int UNEXPECTED_FILE_IN_DATA_PART = 227;
    public static final int BAD_SIZE_OF_FILE_IN_DATA_PART = 228;
    public static final int QUERY_IS_TOO_LARGE = 229;
    public static final int NOT_FOUND_EXPECTED_DATA_PART = 230;
    public static final int TOO_MANY_UNEXPECTED_DATA_PARTS = 231;
    public static final int NO_SUCH_DATA_PART = 232;
    public static final int BAD_DATA_PART_NAME = 233;
    public static final int NO_REPLICA_HAS_PART = 234;
    public static final int DUPLICATE_DATA_PART = 235;
    public static final int ABORTED = 236;
    public static final int NO_REPLICA_NAME_GIVEN = 237;
    public static final int FORMAT_VERSION_TOO_OLD = 238;
    public static final int CANNOT_MUNMAP = 239;
    public static final int CANNOT_MREMAP = 240;
    public static final int MEMORY_LIMIT_EXCEEDED = 241;
    public static final int TABLE_IS_READ_ONLY = 242;
    public static final int NOT_ENOUGH_SPACE = 243;
    public static final int UNEXPECTED_ZOOKEEPER_ERROR = 244;
    public static final int INVALID_NESTED_NAME = 245;
    public static final int CORRUPTED_DATA = 246;
    public static final int INCORRECT_MARK = 247;
    public static final int INVALID_PARTITION_NAME = 248;
    public static final int NOT_ENOUGH_BLOCK_NUMBERS = 250;
    public static final int NO_SUCH_REPLICA = 251;
    public static final int TOO_MUCH_PARTS = 252;
    public static final int REPLICA_IS_ALREADY_EXIST = 253;
    public static final int NO_ACTIVE_REPLICAS = 254;
    public static final int TOO_MUCH_RETRIES_TO_FETCH_PARTS = 255;
    public static final int PARTITION_ALREADY_EXISTS = 256;
    public static final int PARTITION_DOESNT_EXIST = 257;
    public static final int UNION_ALL_RESULT_STRUCTURES_MISMATCH = 258;
    public static final int UNION_ALL_COLUMN_ALIAS_MISMATCH = 259;
    public static final int CLIENT_OUTPUT_FORMAT_SPECIFIED = 260;
    public static final int UNKNOWN_BLOCK_INFO_FIELD = 261;
    public static final int BAD_COLLATION = 262;
    public static final int CANNOT_COMPILE_CODE = 263;
    public static final int INCOMPATIBLE_TYPE_OF_JOIN = 264;
    public static final int NO_AVAILABLE_REPLICA = 265;
    public static final int MISMATCH_REPLICAS_DATA_SOURCES = 266;
    public static final int STORAGE_DOESNT_SUPPORT_PARALLEL_REPLICAS = 267;
    public static final int CPUID_ERROR = 268;
    public static final int INFINITE_LOOP = 269;
    public static final int CANNOT_COMPRESS = 270;
    public static final int CANNOT_DECOMPRESS = 271;
    public static final int AIO_SUBMIT_ERROR = 272;
    public static final int AIO_COMPLETION_ERROR = 273;
    public static final int AIO_READ_ERROR = 274;
    public static final int AIO_WRITE_ERROR = 275;
    public static final int INDEX_NOT_USED = 277;
    public static final int LEADERSHIP_LOST = 278;
    public static final int ALL_CONNECTION_TRIES_FAILED = 279;
    public static final int NO_AVAILABLE_DATA = 280;
    public static final int DICTIONARY_IS_EMPTY = 281;
    public static final int INCORRECT_INDEX = 282;
    public static final int UNKNOWN_DISTRIBUTED_PRODUCT_MODE = 283;
    public static final int UNKNOWN_GLOBAL_SUBQUERIES_METHOD = 284;
    public static final int TOO_LESS_LIVE_REPLICAS = 285;
    public static final int UNSATISFIED_QUORUM_FOR_PREVIOUS_WRITE = 286;
    public static final int UNKNOWN_FORMAT_VERSION = 287;
    public static final int DISTRIBUTED_IN_JOIN_SUBQUERY_DENIED = 288;
    public static final int REPLICA_IS_NOT_IN_QUORUM = 289;
    public static final int LIMIT_EXCEEDED = 290;
    public static final int DATABASE_ACCESS_DENIED = 291;
    public static final int LEADERSHIP_CHANGED = 292;
    public static final int MONGODB_INIT_FAILED = 293;
    public static final int INVALID_BLOCK_EXTRA_INFO = 294;
    public static final int RECEIVED_EMPTY_DATA = 295;
    public static final int NO_REMOTE_SHARD_FOUND = 296;
    public static final int SHARD_HAS_NO_CONNECTIONS = 297;
    public static final int CANNOT_PIPE = 298;
    public static final int CANNOT_FORK = 299;
    public static final int CANNOT_DLSYM = 300;
    public static final int CANNOT_CREATE_CHILD_PROCESS = 301;
    public static final int CHILD_WAS_NOT_EXITED_NORMALLY = 302;
    public static final int CANNOT_SELECT = 303;
    public static final int CANNOT_WAITPID = 304;
    public static final int TABLE_WAS_NOT_DROPPED = 305;
    public static final int TOO_DEEP_RECURSION = 306;
    public static final int TOO_MUCH_BYTES = 307;
    public static final int UNEXPECTED_NODE_IN_ZOOKEEPER = 308;
    public static final int FUNCTION_CANNOT_HAVE_PARAMETERS = 309;
    public static final int INCONSISTENT_TABLE_ACCROSS_SHARDS = 310;
    public static final int INSUFFICIENT_SPACE_FOR_RESHARDING = 311;
    public static final int PARTITION_COPY_FAILED = 312;
    public static final int PARTITION_ATTACH_FAILED = 313;
    public static final int RESHARDING_NO_WORKER = 314;
    public static final int INVALID_PARTITIONS_INTERVAL = 315;
    public static final int RESHARDING_INVALID_PARAMETERS = 316;
    public static final int INVALID_SHARD_WEIGHT = 317;
    public static final int INVALID_CONFIG_PARAMETER = 318;
    public static final int UNKNOWN_STATUS_OF_INSERT = 319;
    public static final int DUPLICATE_SHARD_PATHS = 320;
    public static final int VALUE_IS_OUT_OF_RANGE_OF_DATA_TYPE = 321;
    public static final int RESHARDING_BUSY_CLUSTER = 322;
    public static final int RESHARDING_BUSY_SHARD = 323;
    public static final int RESHARDING_NO_SUCH_COORDINATOR = 324;
    public static final int RESHARDING_NO_COORDINATOR_MEMBERSHIP = 325;
    public static final int RESHARDING_ALREADY_SUBSCRIBED = 326;
    public static final int RESHARDING_REMOTE_NODE_UNAVAILABLE = 327;
    public static final int RESHARDING_REMOTE_NODE_ERROR = 328;
    public static final int RESHARDING_COORDINATOR_DELETED = 329;
    public static final int RESHARDING_DISTRIBUTED_JOB_ON_HOLD = 330;
    public static final int RESHARDING_INVALID_QUERY = 331;
    public static final int RESHARDING_INITIATOR_CHECK_FAILED = 332;
    public static final int RWLOCK_ALREADY_HELD = 333;
    public static final int RWLOCK_NO_SUCH_LOCK = 334;
    public static final int BARRIER_TIMEOUT = 335;
    public static final int UNKNOWN_DATABASE_ENGINE = 336;
    public static final int DDL_GUARD_IS_ACTIVE = 337;
    public static final int UNFINISHED = 341;
    public static final int METADATA_MISMATCH = 342;
    public static final int SUPPORT_IS_DISABLED = 344;
    public static final int TABLE_DIFFERS_TOO_MUCH = 345;
    public static final int CANNOT_CONVERT_CHARSET = 346;
    public static final int CANNOT_LOAD_CONFIG = 347;
    public static final int CANNOT_INSERT_NULL_IN_ORDINARY_COLUMN = 349;
    public static final int INCOMPATIBLE_SOURCE_TABLES = 350;
    public static final int AMBIGUOUS_TABLE_NAME = 351;
    public static final int AMBIGUOUS_COLUMN_NAME = 352;
    public static final int INDEX_OF_POSITIONAL_ARGUMENT_IS_OUT_OF_RANGE = 353;
    public static final int ZLIB_INFLATE_FAILED = 354;
    public static final int ZLIB_DEFLATE_FAILED = 355;
    public static final int BAD_LAMBDA = 356;
    public static final int RESERVED_IDENTIFIER_NAME = 357;
    public static final int INTO_OUTFILE_NOT_ALLOWED = 358;
    public static final int TABLE_SIZE_EXCEEDS_MAX_DROP_SIZE_LIMIT = 359;
    public static final int CANNOT_CREATE_CHARSET_CONVERTER = 360;
    public static final int SEEK_POSITION_OUT_OF_BOUND = 361;
    public static final int CURRENT_WRITE_BUFFER_IS_EXHAUSTED = 362;
    public static final int CANNOT_CREATE_IO_BUFFER = 363;
    public static final int RECEIVED_ERROR_TOO_MANY_REQUESTS = 364;
    public static final int OUTPUT_IS_NOT_SORTED = 365;
    public static final int SIZES_OF_NESTED_COLUMNS_ARE_INCONSISTENT = 366;
    public static final int TOO_MANY_FETCHES = 367;
    public static final int BAD_CAST = 368;
    public static final int ALL_REPLICAS_ARE_STALE = 369;
    public static final int DATA_TYPE_CANNOT_BE_USED_IN_TABLES = 370;
    public static final int INCONSISTENT_CLUSTER_DEFINITION = 371;
    public static final int SESSION_NOT_FOUND = 372;
    public static final int SESSION_IS_LOCKED = 373;
    public static final int INVALID_SESSION_TIMEOUT = 374;
    public static final int CANNOT_DLOPEN = 375;
    public static final int CANNOT_PARSE_UUID = 376;
    public static final int ILLEGAL_SYNTAX_FOR_DATA_TYPE = 377;
    public static final int DATA_TYPE_CANNOT_HAVE_ARGUMENTS = 378;
    public static final int UNKNOWN_STATUS_OF_DISTRIBUTED_DDL_TASK = 379;
    public static final int CANNOT_KILL = 380;
    public static final int HTTP_LENGTH_REQUIRED = 381;
    public static final int CANNOT_LOAD_CATBOOST_MODEL = 382;
    public static final int CANNOT_APPLY_CATBOOST_MODEL = 383;
    public static final int PART_IS_TEMPORARILY_LOCKED = 384;
    public static final int MULTIPLE_STREAMS_REQUIRED = 385;
    public static final int NO_COMMON_TYPE = 386;
    public static final int EXTERNAL_LOADABLE_ALREADY_EXISTS = 387;
    public static final int CANNOT_ASSIGN_OPTIMIZE = 388;
    public static final int INSERT_WAS_DEDUPLICATED = 389;
    public static final int CANNOT_GET_CREATE_TABLE_QUERY = 390;
    public static final int EXTERNAL_LIBRARY_ERROR = 391;
    public static final int QUERY_IS_PROHIBITED = 392;
    public static final int THERE_IS_NO_QUERY = 393;
    public static final int QUERY_WAS_CANCELLED = 394;
    public static final int FUNCTION_THROW_IF_VALUE_IS_NON_ZERO = 395;
    public static final int TOO_MANY_ROWS_OR_BYTES = 396;
    public static final int QUERY_IS_NOT_SUPPORTED_IN_MATERIALIZED_VIEW = 397;
    public static final int UNKNOWN_MUTATION_COMMAND = 398;
    public static final int FORMAT_IS_NOT_SUITABLE_FOR_OUTPUT = 399;
    public static final int CANNOT_STAT = 400;
    public static final int FEATURE_IS_NOT_ENABLED_AT_BUILD_TIME = 401;
    public static final int CANNOT_IOSETUP = 402;
    public static final int INVALID_JOIN_ON_EXPRESSION = 403;
    public static final int BAD_ODBC_CONNECTION_STRING = 404;
    public static final int PARTITION_SIZE_EXCEEDS_MAX_DROP_SIZE_LIMIT = 405;
    public static final int TOP_AND_LIMIT_TOGETHER = 406;
    public static final int DECIMAL_OVERFLOW = 407;
    public static final int BAD_REQUEST_PARAMETER = 408;
    public static final int EXTERNAL_EXECUTABLE_NOT_FOUND = 409;
    public static final int EXTERNAL_SERVER_IS_NOT_RESPONDING = 410;
    public static final int PTHREAD_ERROR = 411;
    public static final int NETLINK_ERROR = 412;
    public static final int CANNOT_SET_SIGNAL_HANDLER = 413;
    public static final int CANNOT_READLINE = 414;
    public static final int ALL_REPLICAS_LOST = 415;
    public static final int REPLICA_STATUS_CHANGED = 416;
    public static final int EXPECTED_ALL_OR_ANY = 417;
    public static final int UNKNOWN_JOIN_STRICTNESS = 418;
    public static final int MULTIPLE_ASSIGNMENTS_TO_COLUMN = 419;
    public static final int CANNOT_UPDATE_COLUMN = 420;
    public static final int CANNOT_ADD_DIFFERENT_AGGREGATE_STATES = 421;
    public static final int UNSUPPORTED_URI_SCHEME = 422;
    public static final int CANNOT_GETTIMEOFDAY = 423;
    public static final int CANNOT_LINK = 424;
    public static final int SYSTEM_ERROR = 425;
    public static final int NULL_POINTER_DEREFERENCE = 426;
    public static final int CANNOT_COMPILE_REGEXP = 427;
    public static final int UNKNOWN_LOG_LEVEL = 428;
    public static final int FAILED_TO_GETPWUID = 429;
    public static final int MISMATCHING_USERS_FOR_PROCESS_AND_DATA = 430;
    public static final int ILLEGAL_SYNTAX_FOR_CODEC_TYPE = 431;
    public static final int UNKNOWN_CODEC = 432;
    public static final int ILLEGAL_CODEC_PARAMETER = 433;
    public static final int CANNOT_PARSE_PROTOBUF_SCHEMA = 434;
    public static final int NO_DATA_FOR_REQUIRED_PROTOBUF_FIELD = 435;
    public static final int PROTOBUF_BAD_CAST = 436;
    public static final int PROTOBUF_FIELD_NOT_REPEATED = 437;
    public static final int DATA_TYPE_CANNOT_BE_PROMOTED = 438;
    public static final int CANNOT_SCHEDULE_TASK = 439;
    public static final int INVALID_LIMIT_EXPRESSION = 440;
    public static final int CANNOT_PARSE_DOMAIN_VALUE_FROM_STRING = 441;
    public static final int BAD_DATABASE_FOR_TEMPORARY_TABLE = 442;
    public static final int NO_COMMON_COLUMNS_WITH_PROTOBUF_SCHEMA = 443;
    public static final int UNKNOWN_PROTOBUF_FORMAT = 444;
    public static final int CANNOT_MPROTECT = 445;
    public static final int FUNCTION_NOT_ALLOWED = 446;
    public static final int HYPERSCAN_CANNOT_SCAN_TEXT = 447;
    public static final int BROTLI_READ_FAILED = 448;
    public static final int BROTLI_WRITE_FAILED = 449;
    public static final int BAD_TTL_EXPRESSION = 450;
    public static final int BAD_TTL_FILE = 451;
    public static final int SETTING_CONSTRAINT_VIOLATION = 452;
    public static final int KEEPER_EXCEPTION = 999;
    public static final int POCO_EXCEPTION = 1000;
    public static final int STD_EXCEPTION = 1001;
    public static final int UNKNOWN_EXCEPTION = 1002;
    private ClickHouseErrorCode() {
    }

}

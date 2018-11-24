package homework;


public enum HomeworkNames {
    INTRO(1, "Intro"),
    CONTROL_FLOWS(2, "Control Flows"),
    ARRAYS(3, "Arrays"),
    CLASS(4, "Class"),
    INTERFACE(5, "Interface"),
    STRING_IOSTREAM(6, "String+IOStream"),
    EXCEPTIONS(7, "Exceptions"),
    COLLECTIONS(8, "Collections"),
    THREAD(9, "Thread"),
    STREAM_API_AND_LAMBDAS(10, "Stream API & Lambdas"),
    DATAFORMATS(11, "Data Formats"),
    JAVA_MODULES(12, "Java Modules"),
    JDBC(13, "JDBC");

    private static final int amount = JDBC.number;
    private final int number;
    private final String name;

    HomeworkNames(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public static int getAmount() {
        return amount;
    }
}

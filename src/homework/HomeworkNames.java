package homework;

/**
 * Enum, содержащий имена и номера всех ДЗ.
 *
 * @author Gnitko Andei
 */
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

    /**
     * Количество ДЗ, определяетс по номеру последнего элемента HomeworkNames.
     */
    private static final int amount = JDBC.number;
    /**
     * Номер ДЗ.
     */
    private final int number;
    /**
     * Тема занятия.
     */
    private final String name;

    /**
     * Конструктор задающий имя и номер ДЗ.
     *
     * @param number номер дз
     * @param name   имя дз
     * @see HomeworkNames#number
     * @see HomeworkNames#name
     */
    HomeworkNames(int number, String name) {
        this.number = number;
        this.name = name;
    }

    /**
     * Геттер для номера ДЗ.
     *
     * @return номер ДЗ
     * @see HomeworkNames#number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Геттер для имени ДЗ.
     *
     * @return номер ДЗ
     * @see HomeworkNames#name
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер для количества ДЗ.
     *
     * @return количество ДЗ
     * @see HomeworkNames#amount
     */
    public static int getAmount() {
        return amount;
    }
}

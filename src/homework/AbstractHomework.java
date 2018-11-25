package homework;

/**
 * Абстрактный класс ДЗ реализующий общие для всех ДЗ поля и методы.
 *
 * @author Gnitko Andrei
 */
public abstract class AbstractHomework {
    /**
     * Номер ДЗ
     */
    public int number;
    /**
     * Имя ДЗ
     */
    public String name;

    /**
     * Вывод стандартного приветственного сообщения.
     */
    public void printWelcomeMessage() {
        System.out.printf("Задания занятия №%d %s\n", number, name);
        System.out.printf("Оно имеет не исполняемую реализацию и находится в пакете homework.hw%d\n", number);
    }

    /**
     * Метод для инициализации ДЗ по номеру.
     *
     * @param number - номер ДЗ
     * @throws InvalidHomeworkNumberException
     * @see AbstractHomework#number
     * @see AbstractHomework#name
     */
    protected void initialize(int number) throws InvalidHomeworkNumberException {
        setNumber(number);
        setName(number);
    }

    /**
     * Метод, задающий номер ДЗ.
     *
     * @param number номер ДЗ
     * @see AbstractHomework#number
     */
    private void setNumber(int number) {
        this.number = number;
    }

    /**
     * Метод, задающий имя ДЗ по номеру.
     *
     * @param number номер ДЗ
     * @throws InvalidHomeworkNumberException
     * @see AbstractHomework#name
     */
    private void setName(int number) throws InvalidHomeworkNumberException {
        for (HomeworkNames value : HomeworkNames.values()) {
            if (value.getNumber() == number) {
                this.name = value.getName();
                return;
            }
        }
        throw new InvalidHomeworkNumberException("ДЗ с таким номером не существует");
    }

    /**
     * Геттер для номера ДЗ.
     *
     * @return номер ДЗ
     * @see AbstractHomework#number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Геттер для имени ДЗ.
     *
     * @return номер ДЗ
     * @see AbstractHomework#name
     */
    public String getName() {
        return name;
    }
}

package homework;

public abstract class AbstractHomework {
    public int number;
    public String name;

    public void printWelcomeMessage() {
        System.out.printf("Задания занятия №%d %s\n", number, name);
        System.out.printf("Оно имеет не исполняемую реализацию и находится в пакете homework.hw%d\n", number);
    }

    public void initialize(int number) throws InvalidHomeworkNumberException {
        setNumber(number);
        setName(number);
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private void setName(int number) throws InvalidHomeworkNumberException {
        for (HomeworkNames value : HomeworkNames.values()) {
            if (value.getNumber() == number) {
                this.name = value.getName();
                return;
            }
        }
        throw new InvalidHomeworkNumberException("ДЗ с таким номером не существует");
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

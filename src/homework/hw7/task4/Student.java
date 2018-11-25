package homework.hw7.task4;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Класс студента.
 *
 * @author Gnitko Andrei
 */
public class Student implements Comparable<Student> {
    /**
     * Идентифтикационный номер
     */
    private int id;
    /**
     * Имя
     */
    private String name;
    /**
     * Возраст
     */
    private int age;
    /**
     * Список оценок
     */
    private ArrayList<Integer> marks = new ArrayList<>();

    /**
     * Конструктор, задающий значения идентифтикационного номера, имени, возраста и списка оценок студента
     *
     * @param id    идентифтикационный номер
     * @param name  имя
     * @param age   возраст
     * @param marks список оценок
     */
    public Student(int id, String name, int age, ArrayList<Integer> marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    /**
     * Конструктор, задающий значения идентифтикационного номера, имени, возраста и списка оценок студента
     *
     * @param id    идентифтикационный номер
     * @param name  имя
     * @param age   возраст
     * @param marks список оценок
     */
    public Student(int id, String name, int age, String[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        setMarks(marks);
    }

    /**
     * Конструктор, задающий значения идентифтикационного номера, имени, возраста и списка оценок студента
     *
     * @param id    идентифтикационный номер
     * @param name  имя
     * @param age   возраст
     * @param marks список оценок
     */
    public Student(int id, String name, int age, int[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        setMarks(marks);
    }

    /**
     * Метод, добавляющий оценку в список оценок студента
     *
     * @param mark
     */
    public void addMark(int mark) {
        marks.add(mark);
    }

    /**
     * Метод расчёта среднего балла студента
     *
     * @return средний балл
     */
    double getAverageMark() {
        int count = 0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
            count++;
        }
        return (double) sum / count;
    }

    /**
     * Геттер идентифтикационного номера
     *
     * @return идентифтикационный номер
     */
    public int getId() {
        return id;
    }

    /**
     * Сеттер идентифтикационного номера
     *
     * @param id идентифтикационный номер
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Геттер имени
     *
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер имени
     *
     * @param name имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер возраста
     *
     * @return возраст
     */
    int getAge() {
        return age;
    }

    /**
     * Сеттер возраста
     *
     * @param age возраст
     */
    void setAge(int age) {
        this.age = age;
    }

    /**
     * Геттер списка оценок
     *
     * @return список оценок
     */
    private ArrayList<Integer> getMarks() {
        return marks;
    }

    /**
     * Сеттер списка оценок
     *
     * @param marks массив оценок текстового формата
     */
    void setMarks(String[] marks) {
        int[] marksInt = new int[marks.length];
        for (int i = 0; i < marksInt.length; i++) {
            marksInt[i] = Integer.parseInt(marks[i]);
        }
        for (int mark : marksInt) {
            this.marks.add(mark);
        }
    }

    /**
     * Сеттер списка оценок
     *
     * @param marks массив оценок целочисленного формата
     */
    void setMarks(int[] marks) {
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    /**
     * Сеттер списка оценок
     *
     * @param marks список оценок формата
     */
    void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "id = " + getId() + ", name = " + getName() + ", age = " + getAge() + ", marks = " + getMarks().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, marks);
    }

    @Override
    public int compareTo(Student o) {
        if (this.id == o.getId()) return 0;
        return this.id > o.getId() ? 1 : -1;
    }
}

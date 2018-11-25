package homework.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Класс студента.
 *
 * @author Gnitko Andrei
 */
public class Student {
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
    private List<Integer> marks = new ArrayList<>();

    /**
     * Конструктор, задающий значения идентифтикационного номера, имени, возраста и списка оценок студента
     *
     * @param id    идентифтикационный номер
     * @param name  имя
     * @param age   возраст
     * @param marks список оценок
     */
    public Student(int id, String name, int age, List<Integer> marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
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
    public List<Integer> getMarks() {
        return marks;
    }

    /**
     * Сеттер списка оценок
     *
     * @param marks список оценок формата
     */
    void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}

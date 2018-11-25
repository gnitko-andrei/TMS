package homework.hw7.task4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс школы.
 *
 * @author Gnitko Andrei
 */
public class School {
    /**
     * Название школы
     */
    private String name;
    /**
     * Список студентов школы
     */
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Конструктор, задающий значения названия школы и списка студентов школы
     *
     * @param name     название школы
     * @param students список студентов школы
     */
    public School(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    /**
     * Конструктор, задающий значения названия школы и списка студентов школы
     *
     * @param name     название школы
     * @param students список студентов школы
     */
    public School(String name, Student[] students) {
        this.name = name;
        setStudents(students);
    }

    /**
     * Метод, принимающий нового студента в школу
     *
     * @param student добавляемый студент
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Метод исключающий студента из школы
     *
     * @param id идентификационный номер исключаемого студента
     */
    public void removeStudent(int id) {
        int index = findStudentByID(id);
        students.remove(index);
    }

    /**
     * Метод, редактирующий все данные по идентифтикационному номеру студента
     *
     * @param id    идентифтикационный номер
     * @param name  имя
     * @param age   возраст
     * @param marks список оценок
     */
    public void editStudent(int id, String name, int age, int[] marks) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setName(name);
            students.get(index).setAge(age);
            students.get(index).setMarks(marks);
        }
    }

    /**
     * Метод, редактирующий имя по идентифтикационному номеру студента
     *
     * @param id   идентифтикационный номер
     * @param name имя
     */
    public void editStudent(int id, String name) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setName(name);
        } else {
            printNoStudentMessage();
        }
    }

    /**
     * Метод, редактирующий возраст по идентифтикационному номеру студента
     *
     * @param id  идентифтикационный номер
     * @param age возраст
     */
    public void editStudent(int id, int age) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setAge(age);
        } else {
            printNoStudentMessage();
        }
    }

    /**
     * Метод, редактирующий список оценок по идентифтикационному номеру студента
     *
     * @param id    идентифтикационный номер
     * @param marks список оценок
     */
    public void editStudent(int id, int[] marks) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setMarks(marks);
        } else {
            printNoStudentMessage();
        }
    }

    /**
     * Метод, редактирующий список оценок по идентифтикационному номеру студента
     *
     * @param id    идентифтикационный номер
     * @param marks список оценок
     */
    public void editStudent(int id, String[] marks) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setMarks(marks);
        } else {
            printNoStudentMessage();
        }
    }

    /**
     * Метод, редактирующий список оценок по идентифтикационному номеру студента
     *
     * @param id    идентифтикационный номер
     * @param marks список оценок
     */
    public void editStudent(int id, ArrayList<Integer> marks) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setMarks(marks);
        } else {
            printNoStudentMessage();
        }
    }

    /**
     * Метод поиска студента по идентифтикационному номеру
     *
     * @param id идентифтикационный номер
     * @return студент
     */
    private int findStudentByID(int id) {
        int index = -1;
        int count = 0;
        for (Student student : students) {
            count++;
            if (student.getId() == id) {
                index = count;
            }
        }
        return index;
    }

    /**
     * Метод поиска студента по имени
     *
     * @param name имя
     * @return студент
     */
    public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Метод поиска самого взрослого студента
     * @return студент
     */
    public Student findOldestStudent() {
        Student oldestStudent = null;
        int maxAge = 0;
        for (Student student : students) {
            if (student.getAge() > maxAge) {
                maxAge = student.getAge();
                oldestStudent = student;
            }
        }
        return oldestStudent;
    }

    /**
     * Метод поиска самого умного студента
     * @return студент
     */
    public Student findCleverestStudent() {
        Student cleverestStudent = null;
        double maxAverageMark = 0;
        for (Student student : students) {
            if (student.getAverageMark() > maxAverageMark) {
                maxAverageMark = student.getAverageMark();
                cleverestStudent = student;
            }
        }
        return cleverestStudent;
    }

    /**
     * Вывод данных всех студентов
     */
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    /**
     * Вывод собщения об отстутсвии студента с таким ID в этй школе
     */
    private void printNoStudentMessage() {
        System.out.println("Студента с таким ID в этй школе нет");
    }

    /**
     * Геттер для названия школы
     * @return название школы
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер для названияя школы
     * @param name название школы
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер для списка студентов школы
     * @return спискок студентов школы
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Сеттер для списка студентов школы
     * @param students спискок студентов школы
     */
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * Сеттер для списка студентов школы
     * @param students спискок студентов школы
     */
    public void setStudents(Student[] students) {
        this.students.addAll(Arrays.asList(students));
    }

}

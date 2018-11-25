package homework.hw10;

import functions.ArrayFunctions;
import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;
import homework.hw10.loading.Loader;
import homework.hw10.loading.Loading;

import java.time.LocalTime;
import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * Класс содержащий ДЗ №10.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW10 extends AbstractRunnableHomework {
    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @see InvalidHomeworkNumberException
     */
    public HW10() throws InvalidHomeworkNumberException {
        setTasksAmount(4);
        initialize(10);
    }

    /**
     * @param number - номер задания
     * @throws InvalidTaskNumberException исключение выбрасывается в случае несовпаденя номера задания с перечисленными в блоке switch
     */
    @Override
    public void chooseTask(int number) throws InvalidTaskNumberException {
        switch (number) {
            case 1: {
                this.task1();
                break;
            }
            case 2: {
                this.task2();
                break;
            }
            case 3: {
                this.task3();
                break;
            }
            case 4: {
                this.task4();
                break;
            }
            default: {
                throw new InvalidTaskNumberException(number + " неправильный номер задания");
            }
        }
        System.out.println();
    }

    /**
     * Task 1
     * Создать массив элементов [20]. Найти максимальное, минимальное значение в интервале [10, 15].
     */
    private void task1() {
        Integer[] array = {12, 34, 4, 32, 13, 12, 16, 14, 345, 23, 15, 45, 546, 54, 13, 67, 84, 56, 13, 45};
        ArrayFunctions.printArray(array);
        System.out.println("max");
        System.out.println(getMaxFromArray(array, 10, 15));
        System.out.println("min");
        System.out.println(getMinFromArray(array, 10, 15));
    }

    /**
     * Метод, находящий минимальное значение элемента целочисленного массива в заданном интервале
     *
     * @param array       массив
     * @param intervalMin левая граница интервала
     * @param intervalMax правая граница интервала
     * @return минимальный элемент в интервале
     */
    private int getMinFromArray(Integer[] array, int intervalMin, int intervalMax) {
        return Arrays.stream(array)
                .skip(intervalMin)
                .limit(intervalMax)
                .min(Integer::compareTo)
                .get();
    }

    /**
     * Метод, находящий минимальное значение элемента целочисленного массива
     *
     * @param array массив
     * @return минимальный элемент
     */
    private int getMinFromArray(Integer[] array) {
        return getMinFromArray(array, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Метод, находящий максимальное значение элемента целочисленного массива в заданном интервале
     *
     * @param array       массив
     * @param intervalMin левая граница интервала
     * @param intervalMax правая граница интервала
     * @return максимальный элемент в интервале
     */
    private int getMaxFromArray(Integer[] array, int intervalMin, int intervalMax) {
        return Arrays.stream(array)
                .skip(intervalMin)
                .limit(intervalMax)
                .max(Integer::compareTo)
                .get();
    }

    /**
     * Метод, находящий максисмальное значение элемента целочисленного массива
     *
     * @param array массив
     * @return максимальный элемент
     */
    private int getMaxFromArray(Integer[] array) {
        return getMaxFromArray(array, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Task 2
     * Создать список студентов (id, name, age, List<>marks).
     * Найти a) самого старшего, b) младшего с именем Bob, c) вывести студента и его средний балл.
     * Далее
     * а)* найти студента со средним баллом 7.7. Если найден - вывести имя, иначе “Student not found”.
     * б)* со средним баллом от 6 до 7.
     * в)* трех лучших студентов,
     */
    private void task2() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nick", 18, Arrays.asList(5, 10, 4, 7, 8)));
        students.add(new Student(2, "Bob", 19, Arrays.asList(7, 4, 7, 3, 8)));
        students.add(new Student(3, "Donald", 22, Arrays.asList(5, 4, 4, 9, 8)));
        students.add(new Student(4, "John", 17, Arrays.asList(7, 9, 8, 7, 6, 5)));
        students.add(new Student(5, "Bob", 16, Arrays.asList(7, 7, 7, 7, 7, 8, 10, 7, 7, 10)));
        students.add(new Student(6, "Bill", 18, Arrays.asList(6, 7, 6, 7)));
        students.add(new Student(7, "Matt", 21, Arrays.asList(10, 10 ,10, 10)));

        System.out.println("task 2a");
        System.out.println(findOldest(students));
        System.out.println("task 2b");
        System.out.println(findYoungestWithName(students, "Bob"));
        System.out.println("task 2c");
        System.out.println("Введите id студанта ");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        printStudentAndAverageMarks(students, id);

        System.out.println("task 2a*");
        Student student2a = findStudentWithAverageMark(students, 7.7);
        if (student2a == null) {
            System.out.println("Student not found");
        } else {
            System.out.println(student2a);
        }
        System.out.println("task 2b*");
        printStudentsWithAverageMark(students, 6, 7);
        System.out.println("task 2c*");
        printThreeBestStudents(students);
    }

    /**
     * Метод поиска самого старшего студента
     *
     * @param studentList список студентов
     * @return самый старший студент
     */
    private Student findOldest(List<Student> studentList) {
        return studentList.stream()
                .max(Comparator.comparingInt(Student::getAge))
                .get();
    }

    /**
     * Метод поиска самого младшего студента с заданным именем
     *
     * @param studentList список студентов
     * @param name        имя
     * @return самый старший студент с заданным именем
     */
    private Student findYoungestWithName(List<Student> studentList, String name) {
        return studentList.stream()
                .filter(student -> student.getName().equals(name))
                .min(Comparator.comparingInt(Student::getAge))
                .get();
    }

    /**
     * Метод вывода студента и среднего балла по идентификационному номеру
     *
     * @param students список всех студентов
     * @param id       идентификационный номер
     */
    private void printStudentAndAverageMarks(List<Student> students, int id) {
        Student student = students.stream()
                .filter(p -> p.getId() == id)
                .findAny()
                .get();
        System.out.println(student + " " + getAverageMark(student.getMarks()));
    }

    /**
     * Метод подсчёта среднего балла студента
     *
     * @param marks
     * @return средний балл
     */
    private double getAverageMark(List<Integer> marks) {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    /**
     * Метод находит студента с заданным среднис баллом
     *
     * @param studentList список всех студентов
     * @param averageMark средний балл
     * @return студент с заданным средним баллои, либо null
     */
    private Student findStudentWithAverageMark(List<Student> studentList, double averageMark) {
        Student student;
        try {
            student = studentList.stream()
                    .filter(p -> getAverageMark(p.getMarks()) == averageMark)
                    .findAny()
                    .get();
        } catch (NoSuchElementException e) {
            return null;
        }
        return student;
    }

    /**
     * Метод выводит студентов со средним баллом входящим в заданный промежуток
     * @param studentList список всех студентов
     * @param minAverageMark минимум промежутка
     * @param maxAverageMark максимум промежутка
     */
    private void printStudentsWithAverageMark(List<Student> studentList, double minAverageMark, double maxAverageMark) {
        studentList.stream()
                .filter(p -> (getAverageMark(p.getMarks()) > minAverageMark) &&
                        (getAverageMark(p.getMarks()) < maxAverageMark))
                .forEach(System.out::println);
    }

    /**
     * Метод выводит трёх студентов с высшим средним баллом
     * @param students список всех студентов
     */
    private void printThreeBestStudents(List<Student> students) {
        students.stream()
                .sorted((s1, s2) -> Double.compare(getAverageMark(s1.getMarks()), getAverageMark(s1.getMarks())))
                .skip(students.size() - 3)
                .forEach(System.out::println);
    }

    /**
     * Task 3
     * Реализовать вариант из прошлой домашки с грузчиками, используя wait/notify, либо join. (не знаю, кто как делал).
     */
    private void task3() {
        Loading loading = new Loading(50, 3);
        Loader loader1 = new Loader("loader1", 100, loading);
        Loader loader2 = new Loader("loader2", 150, loading);
        Loader loader3 = new Loader("loader3", 50, loading);
        loader1.start();
        loader2.start();
        loader3.start();
    }

    /**
     * Task 4
     * Создать массив с 10000 значениями. Отсортировать используя stream и parallelStream и сравнить, какой вариант быстрее.
     */
    private void task4() {
        Integer[] array1 = ArrayFunctions.arrayIntegerRandomGeneration(10000);
        Integer[] array2 = ArrayFunctions.arrayIntegerRandomGeneration(10000);
        int start = LocalTime.now().getNano();
        Arrays.stream(array1).sorted(Integer::compareTo);
        int end = LocalTime.now().getNano();
        int arr1Resulr = end - start;
        start = LocalTime.now().getNano();
        Arrays.stream(array2).parallel().sorted(Integer::compareTo);
        end = LocalTime.now().getNano();
        int arr2Resulr = end - start;
        System.out.println("stream " + arr1Resulr);
        System.out.println("parallelStream " + arr2Resulr);
        if(arr1Resulr < arr2Resulr) {
            System.out.println("stream быстрее");
        } else {
            System.out.println("parallelStream быстрее");
        }

    }

}

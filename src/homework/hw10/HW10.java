package homework.hw10;

import functions.ArrayFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class HW10 {
    public static void main(String[] args) {
        HW10 hw = new HW10();
        hw.task2();
    }

    private void task1() {
        Integer[] array = {12, 34, 4, 32, 13, 12, 16, 14, 345, 23, 15, 45, 546, 54, 13, 67, 84, 56, 13, 45};
        ArrayFunctions.printArray(array);
        System.out.println("max");
        System.out.println(getMaxFromArray(array, 10, 15));
        System.out.println("min");
        System.out.println(getMinFromArray(array, 10, 15));
    }

    private int getMinFromArray(Integer[] array, int intervalMin, int intervalMax) {
        return Arrays.asList(array).stream()
                .skip(intervalMin)
                .limit(intervalMax)
                .min(Integer::compareTo)
                .get();
    }

    private int getMinFromArray(Integer[] array) {
        return getMinFromArray(array, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private int getMaxFromArray(Integer[] array, int intervalMin, int intervalMax) {
        return Arrays.asList(array).stream()
                .skip(intervalMin)
                .limit(intervalMax)
                .max(Integer::compareTo)
                .get();
    }

    private int getMaxFromArray(Integer[] array) {
        return getMaxFromArray(array, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private void task2() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nick", 18, Arrays.asList(5, 10, 4, 7, 8)));
        students.add(new Student(2, "Bob", 19, Arrays.asList(7, 4, 7, 3, 8)));
        students.add(new Student(3, "Donald", 22, Arrays.asList(5, 4, 4, 9, 8)));
        students.add(new Student(4, "John", 17, Arrays.asList(7, 9, 8, 7, 6, 5)));
        students.add(new Student(5, "Bob", 16, Arrays.asList(7, 8, 5, 4, 6, 7, 9)));

        System.out.println("task 2a");
        System.out.println(findOldest(students));
        System.out.println("task 2b");
        System.out.println(findYoungestWithName(students, "Bob"));
        System.out.println("task 2c");
        System.out.println("Введите id студанта ");
        Scanner sc = new Scanner(System.in);
        int id = Integer.parseInt(sc.nextLine());
        printStudentAndAverageMarks(students, id);
    }

    private Student findOldest(List<Student> studentList) {
        return studentList.stream()
                .max((a, b) -> Integer.compare(a.getAge(), b.getAge()))
                .get();
    }

    private Student findYoungestWithName(List<Student> studentList, String name) {
        return studentList.stream()
                .filter(student -> student.getName().equals(name))
                .min((a, b) -> Integer.compare(a.getAge(), b.getAge()))
                .get();
    }

    private void printStudentAndAverageMarks(List<Student> students, int id) {
//        students.stream()
//                .filter(p -> p.getId() == id)
//                .collect(toMap(
//                        Student::getId,
//                        st -> st.getMarks()
//                );
        double average = 0;
        for (Student student : students) {
            average = getAverageMark(student.getMarks());
            System.out.println(student + " " + average);
        }
    }

    private double getAverageMark(List<Integer> marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    private void task4() {
        Integer[] array1 = ArrayFunctions.arrayIntegerRandomGeneration(1000);
        Integer[] array2 = ArrayFunctions.arrayIntegerRandomGeneration(1000);


    }

}

package homework.hw8;

import java.time.LocalTime;
import java.util.*;

import homework.hw7.task4.Student;

public class hw8 {
    public static void main(String[] args) {
        hw8 hw = new hw8();
        hw.task2();
    }

    /**
     * Task 1
     * Продолжение того, что делали в классе.
     * Доделать пример с TreeSet, попробовать HashMap, TreeMap.
     * Сделать “плохую” версию хэшкода и проверить, что внутри будет.
     */

    private void task1() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student(5, "A", 20, new ArrayList<>());
        Student student2 = new Student(2, "B", 21, new ArrayList<>());
        Student student3 = new Student(8, "y", 19, new ArrayList<>());
        Student student4 = new Student(1, "D", 19, new ArrayList<>());
        Student student5 = new Student(5, "E", 20, new ArrayList<>());

        //treeSet
        Set<Student> treeSet = new TreeSet<>();
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        System.out.println("treeSet" + treeSet.toString());

        //hashMap
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
        studentMap.put(student4.getId(), student4);
        studentMap.put(student5.getId(), student5);
        System.out.println("hashMap" + studentMap.toString());

        //treeMap
        Map<Integer, Student> studentTreeMap = new TreeMap<>();
        studentTreeMap.put(student1.getId(), student1);
        studentTreeMap.put(student2.getId(), student2);
        studentTreeMap.put(student3.getId(), student3);
        studentTreeMap.put(student4.getId(), student4);
        studentTreeMap.put(student5.getId(), student5);
        System.out.println("treeMap" + studentTreeMap.toString());
    }

    /**
     * Task 2
     * Провести исследование, в каких случаях LinkedList будет работать быстрее, чем ArrayList.
     * Исследовать варианты вставки в начало списка, середину и конец.
     * Результатом должно быть значение, равное размеру коллекции (примерно), при котором LinkedList окажется быстрее.
     */

    private void task2() {
        System.out.println("В начало");
        System.out.println(compareListsStart(10));
        System.out.println(compareListsStart(100));
        System.out.println(compareListsStart(1000));
        System.out.println(compareListsStart(10000));
        System.out.println(compareListsStart(100000));
        System.out.println("В середину");
        System.out.println(compareListsMiddle(10));
        System.out.println(compareListsMiddle(100));
        System.out.println(compareListsMiddle(1000));
        System.out.println(compareListsMiddle(10000));
        System.out.println(compareListsMiddle(100000));
        System.out.println("В конец");
        System.out.println(compareListsEnd(10));
        System.out.println(compareListsEnd(100));
        System.out.println(compareListsEnd(1000));
        System.out.println(compareListsEnd(10000));
        System.out.println(compareListsEnd(100000));

    }

    private String compareListsEnd(int numberOfElements) {
        int n = getArrayListTimeEnd(numberOfElements) - getLinkedListTimeEnd(numberOfElements);
        if (n == 0) {
            return "Скорость равна при " + numberOfElements + " элементов";
        } else if (n < 0) {
            return "LinkedList быстрее при " + numberOfElements + " элементов разница " + Math.abs(n);
        } else return "ArrayList быстрее при " + numberOfElements + " элементов разница " + Math.abs(n);
    }

    private int getArrayListTimeEnd(int numberOfElements) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int start = LocalTime.now().getNano();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        int end = LocalTime.now().getNano();
        return end - start;
    }

    private int getLinkedListTimeEnd(int numberOfElements) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int start = LocalTime.now().getNano();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        int end = LocalTime.now().getNano();
        return end - start;
    }

    private String compareListsStart(int numberOfElements) {
        int n = getArrayListTimeStart(numberOfElements) - getLinkedListTimeStart(numberOfElements);
        if (n == 0) {
            return "Скорость равна при " + numberOfElements + " элементов";
        } else if (n < 0) {
            return "LinkedList быстрее при " + numberOfElements + " элементов разница " + Math.abs(n);
        } else return "ArrayList быстрее при " + numberOfElements + " элементов разница " + Math.abs(n);
    }

    private int getArrayListTimeStart(int numberOfElements) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int start = LocalTime.now().getNano();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(0, i);
        }
        int end = LocalTime.now().getNano();
        return end - start;
    }

    private int getLinkedListTimeStart(int numberOfElements) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int start = LocalTime.now().getNano();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(0, i);
        }
        int end = LocalTime.now().getNano();
        return end - start;
    }

    private String compareListsMiddle(int numberOfElements) {
        int n = getArrayListTimeMiddle(numberOfElements) - getLinkedListTimeMiddle(numberOfElements);
        if (n == 0) {
            return "Скорость равна при " + numberOfElements + " элементов";
        } else if (n < 0) {
            return "LinkedList быстрее при " + numberOfElements + " элементов разница " + Math.abs(n);
        } else return "ArrayList быстрее при " + numberOfElements + " элементов разница " + Math.abs(n);
    }

    private int getArrayListTimeMiddle(int numberOfElements) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int start = LocalTime.now().getNano();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(arrayList.size()/2 ,i);
        }
        int end = LocalTime.now().getNano();
        return end - start;
    }

    private int getLinkedListTimeMiddle(int numberOfElements) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int start = LocalTime.now().getNano();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(linkedList.size()/2 ,i);
        }
        int end = LocalTime.now().getNano();
        return end - start;
    }

    /**
     * Task 3
     * Сохранить информацию о студентах в Map (ключ - id студента, value - объект студента).
     * Попробовать разные реализации. Вывести всех студентов с нечетными id.
     */
    private void task3() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student(5, "A", 20, new ArrayList<>());
        Student student2 = new Student(2, "B", 21, new ArrayList<>());
        Student student3 = new Student(8, "y", 19, new ArrayList<>());
        Student student4 = new Student(1, "D", 19, new ArrayList<>());
        Student student5 = new Student(5, "E", 20, new ArrayList<>());

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
        studentMap.put(student4.getId(), student4);
        studentMap.put(student5.getId(), student5);
        for (int id : studentMap.keySet()) {
            if (id % 2 != 0) {
                System.out.println(studentMap.get(id));
            }
        }
        System.out.println("hashMap" + studentMap.toString());
    }

    /**
     * Task 4
     * Отрефакторить предыдущие домашки :)
     */
}

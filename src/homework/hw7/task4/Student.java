package homework.hw7.task4;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private int age;
    private ArrayList<Integer> marks = new ArrayList<>();


    public Student(int id, String name, int age, ArrayList<Integer> marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public Student(int id, String name, int age, String[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        setMarks(marks);
    }

    public Student(int id, String name, int age, int[] marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        setMarks(marks);
    }

    public void addMark(int mark) {
        marks.add(mark);
    }

    public double getAverageMark() {
        int count = 0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
            count++;
        }
        return (double) sum / count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(String[] marks) {
        int[] marksInt = new int[marks.length];
        for (int i = 0; i < marksInt.length; i++) {
            marksInt[i] = Integer.parseInt(marks[i]);
        }
        for (int mark : marksInt) {
            this.marks.add(mark);
        }
    }

    public void setMarks(int[] marks) {
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }
}

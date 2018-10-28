package homework.hw7.task4;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public School(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public School(String name, Student[] students) {
        this.name = name;
        setStudents(students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        int index = findStudentByID(id);
        students.remove(index);
    }

    public void editStudent(int id, String name, int age, int[] marks) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setName(name);
            students.get(index).setAge(age);
            students.get(index).setMarks(marks);
        }
    }

    public void editStudent(int id, String name) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setName(name);
        } else {
            printNoStudentMessage();
        }
    }

    public void editStudent(int id, int age) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setAge(age);
        } else {
            printNoStudentMessage();
        }
    }

    public void editStudent(int id, int[] marks) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setMarks(marks);
        } else {
            printNoStudentMessage();
        }
    }

    public void editStudent(int id, String[] marks) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setMarks(marks);
        } else {
            printNoStudentMessage();
        }
    }

    public void editStudent(int id, ArrayList<Integer> marks) {
        int index = findStudentByID(id);
        if (index > 0) {
            students.get(index).setMarks(marks);
        } else {
            printNoStudentMessage();
        }
    }

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

    private Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

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
    public void printAllStudents() {
        for (Student student : students) {
            student.toString();
        }
    }

    private void printNoStudentMessage() {
        System.out.println("Студента с таким ID в этй школе нет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setStudents(Student[] students) {
        for (Student student : students) {
            this.students.add(student);
        }
    }

}

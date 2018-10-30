package classwork.сw8;

import java.util.*;

public class Lesson8 {
    public static void main(String[] args) {
        List<Lesson8Student> list = new ArrayList<>();
        Lesson8Student student1 = new Lesson8Student(1, "A", 20, new ArrayList<>());
        Lesson8Student student2 = new Lesson8Student(2, "B", 21, new ArrayList<>());
        Lesson8Student student3 = new Lesson8Student(3, "y", 19, new ArrayList<>());
        Lesson8Student student4 = new Lesson8Student(4, "D", 19, new ArrayList<>());
        Lesson8Student student5 = new Lesson8Student(5, "E", 20, new ArrayList<>());

        //arrayList
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        System.out.println("arrayList" + list.toString());
        Collections .sort(list, new Comparator<Lesson8Student>() {
            @Override
            public int compare(Lesson8Student o1, Lesson8Student o2) {
                if(o1.getName().equals(o2.getName())) return 0;
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sorted arrayList" + list.toString());

        //hashSet
        Set<Lesson8Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        System.out.println("hashSet" + set.toString());

        //treeSet
        Set<Lesson8Student> treeSet = new TreeSet<>();
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        System.out.println("treeSet" + treeSet.toString());

        //hashMap
        Map<Integer, Lesson8Student> studentMap = new HashMap<>();
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student1);
        studentMap.put(student3.getId(), student1);
        studentMap.put(student4.getId(), student1);
        studentMap.put(student5.getId(), student1);
        System.out.println("hashMap" + studentMap.toString());
    }
}

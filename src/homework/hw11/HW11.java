package homework.hw11;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;
import homework.hw11.students.Student;
import homework.hw5.transport.IllegalArgumentException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Класс содержащий ДЗ №11.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW11 extends AbstractRunnableHomework {

    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW11() throws InvalidHomeworkNumberException {
        setTasksAmount(5);
        initialize(11);
    }


    /**
     * @param number - номер задания
     * @throws InvalidTaskNumberException исключение выбрасывается в случае несовпаденя номера задания с перечисленными в блоке switch
     */
    @Override
    public void chooseTask(int number) throws InvalidTaskNumberException {
        switch (number) {
            case 1: {
                try {
                    this.task1234();
                } catch (JAXBException | IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                try {
                    this.task1234();
                } catch (JAXBException | IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                try {
                    this.task1234();
                } catch (JAXBException | IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                try {
                    this.task1234();
                } catch (JAXBException | IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 5: {
                try {
                    this.task5();
                } catch (JAXBException | IOException | IllegalArgumentException e) {
                    e.printStackTrace();
                }
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
     * Сохранить id студента в атрибуте.
     * Task 2
     * Сериализовать name как first_name.
     * Task 3
     * Сериализовать age как age + “ years”.
     * Task 4
     * Не сериализовать поле marks.
     */
    private void task1234() throws JAXBException, IOException {
        Student student = new Student(1, "Bob", 22, Arrays.asList(10, 9, 6, 8, 9));

        System.out.println("XML");
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(student, System.out);
        System.out.println();

        System.out.println("JSON");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(System.out, student);
    }

    /**
     * Task 5
     * Реализовать систему хранения студентов из разных источников (XMl, JSON, in-memory).
     * При запуске программа должна спросить, с каким форматом работаем,
     * выводит всех ранее сохраненных студентов и позволяет добавить еще.
     * Упор делайте именно на реализацию логики хранения, а не менюшку.
     */
    private void task5() throws JAXBException, IOException, IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        System.out.println("Введите систему хранения XMl - 1, JSON - 2, in-memory - 3");
        int i = Integer.valueOf(sc.next());
        while (true) {
            System.out.println("Хотите добавить нового студента? (yes/no)");
            String s = sc.next();
            if (s.equalsIgnoreCase("yes")) {
                studentList.add(new Student(1, "Bob", 22, Arrays.asList(10, 9, 6, 8, 9)));
            } else {
                break;
            }
        }
        switch (i) {
            case 1: {
                XMLStudentSerialization(studentList);
                return;
            }
            case 2: {
                JSONStudentSerialization(studentList);
                return;
            }
            case 3: {
                InMemoryStudentSerialization(studentList);
            }
        }


    }

    /**
     * Метод, сериализующий список студентов в JSON формате в файл
     * @param students лист студентов
     * @throws IOException
     */
    private void JSONStudentSerialization(List<Student> students) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new FileOutputStream("src/homework/hw11/JSON"), students);

    }

    /**
     * Метод, сериализующий список студентов в XML формате в файл
     * @param students лист студентов
     * @throws JAXBException
     * @throws IOException
     */
    private void XMLStudentSerialization(List<Student> students) throws JAXBException, IOException {
        StringBuilder sb = new StringBuilder();
        ;
        for (Student student : students) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(student, new FileWriter("src/homework/hw11/XML", true));
            System.out.println();
        }
    }

    /**
     * Метод, сериализующий список студентов в файл
     * @param students лист студентов
     * @throws IOException
     */
    private void InMemoryStudentSerialization(List<Student> students) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/homework/hw11/InMemoryStudentSerialization"))) {
            oos.writeObject(students);
            oos.flush();
        }

    }

}

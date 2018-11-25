package homework.hw7;

import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;
import homework.hw7.task4.School;
import homework.hw7.task4.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс содержащий ДЗ №7.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW7 extends AbstractRunnableHomework {
    public static void main(String[] args) {
        Student student1 = new Student(1, "student1", 18, "4 8 9 4 5 5".split("%s"));
        Student student2 = new Student(2, "student2", 12, "5 4 8 5 8 9 5".split("%s"));
        Student student3 = new Student(3, "student3", 18, "6 8 9 8 10 5".split("%s"));
        Student student4 = new Student(4, "student4", 20, "9 8 5 6 7 8".split("%s"));
        Student student5 = new Student(5, "student5", 19, "5 7 9 4 10".split("%s"));
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        School school = new School("School№1", students);
        school.printAllStudents();
        school.editStudent(2, "10 9 9 4 8".split("%s"));
        school.removeStudent(3);
        Student findingStudent = school.findStudentByName("student5");
        Student oldestStudent = school.findOldestStudent();
        Student cleverestStudent = school.findCleverestStudent();
    }

    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @see InvalidHomeworkNumberException
     */
    public HW7() throws InvalidHomeworkNumberException {
        setTasksAmount(5);
        initialize(7);
    }

    /**
     * @param number - номер задания
     * @throws InvalidTaskNumberException исключение выбрасывается в случае несовпаденя номера задания с перечисленными в блоке switch
     */
    @Override
    public void chooseTask(int number) throws InvalidTaskNumberException {
        switch (number) {
            case 1: {
                System.out.println("Добавление исключений в ДЗ5");
                System.out.println("находятся в пакете src/homework/hw5/transport");
                break;
            }
            case 2: {
                System.out.println("Добавление логирования");
                break;
            }
            case 3: {
                try {
                    this.task3();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                System.out.println("Создание классов School и Student");
                System.out.println("находятся в пакете src/homework/hw7/task4");
                break;
            }
            case 5: {
                System.out.println("Добавление javadocs к домашкам.");
                break;
            }
            default: {
                throw new InvalidTaskNumberException(number + " неправильный номер задания");
            }
        }
        System.out.println();
    }

    /**
     * Tasks 3
     * Проверка на цензуру:
     * Создаете 2 файла.
     * 1й. Содержит исходный текст.
     * 2й. Содержит слова недопустимые в тексте(black list).
     * Структура файла определите сами, хотите каждое слово на новой строке,
     * хотите через запятую разделяйте, ваша программа делайте как считаете нужным.
     * Задача: необходимо проверить, проходит ли текст цензуру.
     * Если в тексте не встретилось ни одного недопустимого слова,
     * то выводите сообщение о том что текст прошёл проверку на цензуру.
     * Если нет, то выведите соответствующее сообщение,
     * кол-во предложений не прошедших проверку и сами предложения подлежащие исправлению.
     */

    private void task3() throws IOException {
        String firstFile = "src/homework/hw7/testFile1";
        String secondFile = "src/homework/hw7/testFile2";
        String fileContent = readText(firstFile);
        String[] blackList = readBlackList(secondFile);
        checkContent(fileContent, blackList);
    }

    /**
     * Метод для чтения текста из файла
     * @param path путь к файлу
     * @return текст в форме строки
     * @throws IOException
     */
    private String readText(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }
            System.out.println(content);
            return content.toString();
        }
    }

    /**
     * метод для чтения чёрного списка из файла, с преобразованием его в массив строк
     * @param path путь файла с чёрным списком
     * @return массив строк с элементами чёрного списка
     * @throws IOException
     */
    private String[] readBlackList(String path) throws IOException {
        String content = readText(path);
        String[] blackList = content.split("[\\s, \\n]");
        System.out.println(Arrays.deepToString(blackList));
        return blackList;
    }

    /**
     * Метод для проверки строки на содержание элементов массива строк,
     * с выводом соответствующего сообщения о прохождении проверки.
     * @param content строка для провери
     * @param blackList массив элементов чёрного списка
     */
    private void checkContent(String content, String[] blackList) {
        String[] sentences = content.split("[.!?]");
        StringBuilder message = new StringBuilder();
        int count = 0;
        for (String censWord : blackList) {
            for (String sentence : sentences) {
                if ((sentence.toLowerCase()).contains(censWord.toLowerCase())) {
                    message.append(sentence);
                    count++;
                }
            }
        }
        if (count != 0) {
            System.out.println("Предложений не прошли проверку: " + count);
            System.out.println(message);
        } else {
            System.out.println("Текст прошёл проверку на цензуру");
        }

    }

}

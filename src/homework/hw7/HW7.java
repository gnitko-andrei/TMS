package homework.hw7;

import homework.hw7.task4.Student;

import java.io.*;
import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) throws IOException {
        HW7 hw = new HW7();
        String[] arr = {"1", "10", "8", "5"};
        Student student = new Student(1, "Andrei", 21, arr);
        System.out.println(student.getAverageMark());
        student.addMark(3);
        System.out.println(student.getAverageMark());

    }
    /**
     * Tasks 1
     * Добавить собственные исключения к домашке с транспортом.
     * В качестве примера это может быть проверка на валидные значения (IllegalArgumentException).
     */

    /**
     * Tasks 2
     * Добавить логирование. (заменить sout на logger).
     */

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

    private String readText(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String line;
        String content = "";
        while ((line = br.readLine()) != null) {
            content += line + " ";
        }
        System.out.println(content);
        return content;
    }

    private String[] readBlackList(String path) throws IOException {
        String content = readText(path);
        String[] blackList = content.split("[\\s, \\n]");
        System.out.println(Arrays.deepToString(blackList));
        return blackList;
    }

    private void checkContent(String content, String[] blackList) {
        String[] sentences = content.split("[.!?]");
        String message = "";
        int count = 0;
        for (String censWord : blackList) {
            for (String sentence : sentences) {
                if ((sentence.toLowerCase()).contains(censWord.toLowerCase())) {
                    message += sentence;
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

    /**
     * Tasks 4
     * Создать класс Student(id, имя, возраст, список оценок).
     * В классе Student реализовать след. методы:
     * - добавить оценку.
     * - получить средний балл.
     * Создать класс School(название, список студентов).
     * В классе School реализовать след. методы:
     * - добавить студента.
     * - редактировать студента.
     * - удалить студента.
     * - вывод всех студентов.
     * - поиск студента по имени.
     * - поиск самого взрослого студента.
     * - поиск самого умного студента.
     */

    /**
     * Tasks 5
     * Добавить javadocs к домашкам. В качестве примера смотрите в JDK.
     */
}

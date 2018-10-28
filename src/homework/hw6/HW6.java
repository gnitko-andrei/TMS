package homework.hw6;

import java.io.*;
import java.util.Arrays;

import static functions.TextFormater.countWords;
import static functions.TextFormater.isContainsPalindrome;

public class HW6 {
    /**
     * Task 1
     * Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).
     */
    private void task1() {
        String s = "awddfjsadgjthlfjtrhwdar";
        char a = 'j';
        char b = 't';
        HW6 hw = new HW6();
        System.out.printf("Строка %s обрезается по первому вхождению символа %s и последнему вхождению символа %s\n", s, a, b);
        System.out.println("результат " + hw.cutSubstring(s, a, b));

    }

    private String cutSubstring(String s, char a, char b) {
        int indexOfA = s.indexOf(a);
        int indexOfB = s.lastIndexOf(b);
        return s.substring(indexOfA, indexOfB + 1);
    }

    /**
     * Task 2
     * Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0.
     */
    private void task2() {
        String s = "lddsfwesrgjyksdsfskkdfssrkjkh";
        HW6 hw = new HW6();
        System.out.println("Исходная строка " + s);
        System.out.println("Результат " + hw.changer(s));
        ;

    }

    private String changer(String s) {
        if (s.length() > 4) {
            String symbol3 = Character.toString(s.charAt(3));
            String symbol0 = Character.toString(s.charAt(0));
            return s.replaceAll(symbol3, symbol0);
        } else {
            System.out.println("Слишком короткая строка");
            return null;
        }
    }

    /**
     * Task 3
     * В исходном файле находятся слова, каждое слово на новой строке.
     * После запуска программы должен создаться файл, который будет содержать в себе только палиндромы.
     */

    private void task3() throws IOException {
        String pathToRead = "src/homework/hw6/testFile1.1";
        String pathToWrite = "src/homework/hw6/testFile1.2";
        String fileContent = readStringsFromFile(pathToRead);
        writeOnlyPolyndroms(fileContent, pathToWrite);
    }

    private String readStringsFromFile(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        System.out.println("Исходный файл " + path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String s = "";
        String line;
        while ((line = br.readLine()) != null) {
            s += line + " ";
        }
        fis.close();
        return s;
    }

    private void writeOnlyPolyndroms(String content, String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        String[] words = content.split("\\s");
        StringBuilder sb;
        for (int i = 0; i < words.length; i++) {
            sb = new StringBuilder(words[i]);
            String s1 = sb.reverse().toString();
            if (words[i].equals(s1)) {
                writer.write(words[i] + "\n");
            }
        }
        writer.flush();
        System.out.println("Резльтат в файле " + path);
    }

    /**
     * Task 4
     * Текстовый файл содержит текст.
     * После запуска программы в другой файл должны записаться только те предложения в которых от 3-х до 5-ти слов.
     * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в новый файл.
     * Создаем вспомогательный класс TextFormatter, в котором два метода:
     * 1. Метод принимает строку и возвращает кол-во слов в строке.
     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false.
     */

    private void task4() throws IOException {
        String pathToRead = "src/homework/hw6/testFile4.1";
        String pathToWrite = "src/homework/hw6/testFile4.2";
        String fileContent = readStringsFromFile(pathToRead);
        task4Writer(fileContent, pathToWrite);

    }

    private void task4Writer(String content, String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        String[] sentences = content.split("[!.?]");
        for (String sentense : sentences) {
            if (countWords(sentense) <= 5 && countWords(sentense) >= 3) {
                writer.write(sentense.trim() + ".\n");
            } else if (isContainsPalindrome(sentense)) {
                writer.write(sentense.trim() + ".\n");
            }
        }
        writer.flush();
        System.out.println("Резльтат в файле " + path);
    }

}

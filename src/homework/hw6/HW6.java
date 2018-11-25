package homework.hw6;

import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;

import java.io.*;


import static functions.TextFormater.countWords;
import static functions.TextFormater.isContainsPalindrome;

/**
 * Класс содержащий ДЗ №6.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW6 extends AbstractRunnableHomework {

    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW6() throws InvalidHomeworkNumberException {
        setTasksAmount(6);
        initialize(6);
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
                try {
                    this.task3();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 4: {
                try {
                    this.task4();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 5: {
                try {
                    this.task5();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 6: {
                try {
                    this.task6();
                } catch (IOException e) {
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
     * Tasks 1
     * Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).
     */
    private void task1() {
        String s = "awddfjsadgjthlfjtrhwdar";
        char a = 'j';
        char b = 't';
        System.out.printf("Строка %s обрезается по первому вхождению символа %s и последнему вхождению символа %s\n", s, a, b);
        System.out.println("результат " + cutSubstring(s, a, b));

    }

    /**
     * Метод для обрезки из исходной строки подстроки, начиная с первого вхождения первого символо
     * заканчивая последним вхождением второго символа
     *
     * @param s исходная строка
     * @param a первый символ
     * @param b второй символ
     * @return
     */
    private String cutSubstring(String s, char a, char b) {
        int indexOfA = s.indexOf(a);
        int indexOfB = s.lastIndexOf(b);
        return s.substring(indexOfA, indexOfB + 1);
    }

    /**
     * Tasks 2
     * Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0.
     */
    private void task2() {
        String s = "lddsfwesrgjyksdsfskkdfssrkjkh";
        System.out.println("Исходная строка " + s);
        System.out.println("Результат " + changeAll(s));

    }

    /**
     * Метод для замены в исходной строке всех вхождений символа стоящего в позиции 3 на символ стоящий в позиции 0.
     *
     * @param s исходная строка
     * @return строка с результатом замены
     */
    private String changeAll(String s) {
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
     * Tasks 3
     * В исходном файле находятся слова, каждое слово на новой строке.
     * После запуска программы должен создаться файл, который будет содержать в себе только палиндромы.
     * @throws IOException
     */
    private void task3() throws IOException {
        String pathToRead = "src/homework/hw6/testFile1.1";
        String pathToWrite = "src/homework/hw6/testFile1.2";
        String fileContent = readStringsFromFile(pathToRead);
        writeOnlyPalindromes(fileContent, pathToWrite);
    }

    /**
     * Метод для чтения содержимого файла в строку.
     *
     * @param path путь к файлу
     * @return строка с содержимым файла
     * @throws IOException
     */
    private String readStringsFromFile(String path) throws IOException {
        System.out.println("Исходный файл " + path);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            StringBuilder s = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                s.append(line).append(" ");
            }
            return s.toString();
        }
    }

    /**
     * Метод записывающий в файл только палиндромы из заданной строки.
     *
     * @param content заданная строка
     * @param path    путь к файлу для записи
     * @throws IOException
     */
    private void writeOnlyPalindromes(String content, String path) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            String[] words = content.split("\\s");
            StringBuilder sb;
            for (String word : words) {
                sb = new StringBuilder(word);
                String s1 = sb.reverse().toString();
                if (word.equals(s1)) {
                    writer.write(word + "\n");
                }
            }
            writer.flush();
        }
        System.out.println("Резльтат в файле " + path);
    }

    /**
     * Tasks 4
     * Текстовый файл содержит текст.
     * После запуска программы в другой файл должны записаться только те предложения в которых от 3-х до 5-ти слов.
     * Если в предложении присутствует слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в новый файл.
     * Создаем вспомогательный класс TextFormatter, в котором два метода:
     * 1. Метод принимает строку и возвращает кол-во слов в строке.
     * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false.
     * @throws IOException
     */

    private void task4() throws IOException {
        String pathToRead = "src/homework/hw6/testFile4.1";
        String pathToWrite = "src/homework/hw6/testFile4.2";
        String fileContent = readStringsFromFile(pathToRead);
        task4Writer(fileContent, pathToWrite);

    }

    /**
     * Метод записи в файл предложений от 3-х до 5-ти слов и предложений, содержащих палиндромы из заданной строки.
     *
     * @param content заданная строка
     * @param path    путь к файлу для записи
     * @throws IOException
     */
    private void task4Writer(String content, String path) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            String[] sentences = content.split("[!.?]");
            for (String sentence : sentences) {
                if (countWords(sentence) <= 5 && countWords(sentence) >= 3) {
                    writer.write(sentence.trim() + ".\n");
                } else if (isContainsPalindrome(sentence)) {
                    writer.write(sentence.trim() + ".\n");
                }
            }
            writer.flush();
        }
        System.out.println("Результат в файле " + path);
    }

    /**
     * Task 5*
     * Создать программно папку, в нее сериализовать экземпляр класса User (id, name, password).
     * Затем в другом методе десериализовать.
     * @throws IOException
     */
    private void task5() throws IOException {
        String folderPath = "src/homework/hw6/user";
        String filePath = "src/homework/hw6/user/user1";
        User1 user1 = new User1(1, "Andrei", "1111");
        task56Serialise(user1, folderPath, filePath);
        System.out.println("Резльтат в файле " + filePath);

    }

    /**
     * Метод сериализующий заданный объект в новую папку.
     *
     * @param object     сериализуемый объект
     * @param folderPath путь к новой папке
     * @param filePath   путь к файлу для сериализации
     * @throws IOException
     */
    private void task56Serialise(Object object, String folderPath, String filePath) throws IOException {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
        }
        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(filePath))) {
            ois.writeObject(object);
        }
    }

    /**
     * Task 6*
     * Продолжение 5. Поле password пометить transient.
     * @throws IOException
     */
    private void task6() throws IOException {
        String folderPath = "src/homework/hw6/user";
        String filePath = "src/homework/hw6/user/user2";
        User2 user2 = new User2(2, "John", "2211");
        task56Serialise(user2, folderPath, filePath);
        System.out.println("Резльтат в файле " + filePath);
    }
}

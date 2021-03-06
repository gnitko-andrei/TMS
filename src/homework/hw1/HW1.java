package homework.hw1;

import homework.AbstractRunnableHomework;
import homework.InvalidHomeworkNumberException;
import homework.InvalidTaskNumberException;

/**
 * Класс содержащий ДЗ №1.
 *
 * @author Gnitko Andrei
 * @see AbstractRunnableHomework
 */
public class HW1 extends AbstractRunnableHomework {

    /**
     * Контруктор, задающий имя, номер и количество заданий в ДЗ.
     *
     * @throws InvalidHomeworkNumberException
     */
    public HW1() throws InvalidHomeworkNumberException {
        setTasksAmount(14);
        initialize(1);
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
                this.task3();
                break;
            }
            case 4: {
                this.task4();
                break;
            }
            case 5: {
                this.task5();
                break;
            }
            case 6: {
                this.task6();
                break;
            }
            case 7: {
                this.task7();
                break;
            }
            case 8: {
                this.task8();
                break;
            }
            case 9: {
                System.out.println("Задание №9 не имеет вывода");
                break;
            }
            case 10: {
                this.task10();
                break;
            }
            case 11: {
                this.task11();
                break;
            }
            case 12:
                this.task12();
                break;
            case 13: {
                this.task13();
                break;
            }
            case 14: {
                this.task14();
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
     * есть переменные
     * byte b1 = 127;
     * byte b2 = 1;
     * задание:
     * a. вывести (System.out.println) "Sum=128" //написать все в sout не вариант ;)
     * b. вывести  -128
     * c. используя побитовый сдвиг получить из b2 2 4 8 16. Вывести сумму (без введения отдельной переменной).
     * d. Исходные данные из с. Использовать побитовый сдвиг с присвоением.
     */
    private void task1() {
        byte b1 = 127;
        byte b2 = 1;
        System.out.println("1a");
        int sum = b1 + b2;
        System.out.println("Sum = " + sum);
        System.out.println("1b");
        System.out.println((byte) (b1 + b2));
        System.out.println("1c");
        System.out.printf("%d %d %d %d \n", (b2 << 1), (b2 << 2), (b2 << 3), (b2 << 4));
        System.out.println(b1 + b2);
        System.out.println("1d");
        System.out.printf("%d << %d << %d << %d << %d \n", b2, (b2 <<= 1), (b2 <<= 1), (b2 <<= 1), (b2 <<= 1));

    }

    /**
     * Tasks 2
     * есть символ 'a'. выполнить инкремент. Проверить результат. Почему вывело именно это?
     */
    private void task2() {
        char a = 'a';
        System.out.println(a++ + " " + a);
    }

    /**
     * Tasks 3
     * Объявить 2 Integer и присвоить значение 127 обоим. Сравнить между собой.
     * Результат вывести в виде "Equal? <результат сравнения>"
     * 3а) теперь поменять значение на 128. Повторить.
     * 3b) поменять Integer на int оба. Сравнить. Результаты обсудим на занятии
     */
    private void task3() {
        Integer one = 127;
        Integer two = 127;
        System.out.println("Equal? " + (one == two));
        System.out.println(this.compareInt(one, two));
        System.out.println("task3a");
        Integer oneA = 128;
        Integer twoA = 128;
        System.out.println("Equal? " + (oneA == twoA));
        System.out.println(this.compareInt(oneA, twoA));
        System.out.println("task3b");
        int oneB = 128;
        int twoB = 128;
        System.out.println("Equal? " + (oneB == twoB));
        System.out.println(this.compareInt(oneB, twoB));
    }

    /**
     * Медтод для сравнения двух целых чисел по знчению.
     *
     * @param i1 первое целое число
     * @param i2 второе целое число
     * @return строка с соответствующим знаком >,< или =
     */
    private String compareInt(int i1, int i2) {
        String result = "";
        int i = Integer.compare(i1, i2);
        if (i == 0) {
            result = "=";
        } else if (i == 1) {
            result = ">";
        } else if (i == -1) {
            result = "<";
        }

        return result;
    }

    /**
     * Tasks 4
     * Есть
     * String s1 = "123";
     * String s2 = "12" + "3";
     * String s3 = new String("123");
     * String s4 = s3;
     * String s5 = s1+””;
     * Сравнить между собой s1 и s2, s2 и s3, s2 и s4, s3 и s4, s1 и s5. Обсудим на занятии результат.
     */
    private void task4() {
        String s1 = "123";
        String s2 = "12" + "3";
        String s3 = new String("123");
        String s4 = s3;
        String s5 = s1 + "";
        System.out.println("compare with ==");
        boolean one = s1 == s2;
        boolean two = s2 == s3;
        boolean three = s2 == s4;
        boolean four = s3 == s4;
        boolean five = s1 == s5;
        System.out.println(one + " " + two + " " + three + " " + four + " " + five);
        System.out.println("compare with .equals()");
        one = s1.equals(s2);
        two = s2.equals(s3);
        three = s2.equals(s4);
        four = s3.equals(s4);
        five = s1.equals(s5);
        System.out.println(one + " " + two + " " + three + " " + four + " " + five);
    }

    /**
     * Tasks 5
     * Вывести 0 используя 256 в качестве параметра (использовать приведение).
     */
    private void task5() {
        System.out.println((byte) 256);
    }

    /**
     * Tasks 6
     * Есть числа 14 и 4. Используя операции деления (/, %) вывести 3.5 3 2 2.0
     */
    private void task6() {
        int i1 = 14;
        int i2 = 4;
        System.out.println(14 / 4.);
        System.out.println(14 / 4);
        System.out.println(14 % 4);
        System.out.println(14 % 4.);
    }

    /**
     * Tasks 7
     * Есть символы ‘a’ и ‘b’. Вывести в консоль ab.
     */
    private void task7() {
        char a = 'a';
        char b = 'b';
        String ab = Character.toString(a) + Character.toString(b);
        System.out.println(ab);
        //2й способ
        System.out.println("" + a + b);
    }

    /**
     * Tasks 8
     * Записать в переменную типа long значение 12345678901.
     */
    private void task8() {
        long i = 12345678901L;
        System.out.println(i);
    }

    /**
     * Tasks 10
     * Есть 2 boolean переменные b1 == true, b2 == false.
     * Чему будет равен результат выражений (изначально попробовать вычислить без написания кода)
     * a) b1 ^ b2
     * b) b1 | (b2==true)
     * c) (b1 == true) & (b2 == false)
     */
    private void task10() {
        boolean b1 = true; //1
        boolean b2 = false; //0
        boolean b3;
        System.out.println("10a");
        //1^0=1 true
        b3 = b1 ^ b2;
        System.out.println(b3);
        System.out.println("10b");
        //1|0=1 true
        b3 = b1 | (b2 == true);
        System.out.println(b3);
        System.out.println("10c");
        //1&1=1 true
        b3 = (b1 == true) & (b2 == false);
        System.out.println(b3);

    }

    /**
     * Tasks 11
     * Есть 2 boolean переменные b1 == true, b2 == false.
     * Чему будет равно значение b2 и результат следующих операций (изначально попробовать вычислить без написания кода)
     * a) b1 | (b2=true)
     * b) b1 || (b2=true)
     */
    private void task11() {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3;
        System.out.println("11a");
        // b2 = true, b1|(b2 = true) = true
        b3 = b1 | (b2 = true);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("11b");
        //b2 = false, b1||(b2 = true) = true
        b2 = false;
        b3 = b1 || (b2 = true);
        System.out.println(b2);
        System.out.println(b3);
    }


    private static boolean B;
    private static int I;
    private static double D;
    private static String S;

    /**
     * Tasks 12
     * Объявить переменные класса (boolean, int, double, String) без присвоения им какого-либо значения.
     * Проверить, какая информация в них хранится. Затем перенести переменные в метод main и проверить значения.
     */
    private void task12() {
        System.out.println(B);
        System.out.println(I);
        System.out.println(D);
        System.out.println(S);
    }

    /**
     * Tasks 13
     * Есть byte b = 123. Объявить новую переменную Integer i и присвоить b. Реализовать разными способами.
     */
    private void task13() {
        byte b = 123;
        Integer i1 = new Integer(b);
        Integer i2 = (int) b;
        Integer i3 = b + 0;
        Integer i4 = (int) b++;
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
    }

    /**
     * Tasks 14
     * Есть Integer i = 123. Объявить переменные типа byte и Byte. Присвоить им значение переменной i.
     */
    private void task14() {
        Integer i = 123;
        byte b1 = i.byteValue();
        Byte b2 = i.byteValue();
        System.out.println(b1);
        System.out.println(b2);
    }
}

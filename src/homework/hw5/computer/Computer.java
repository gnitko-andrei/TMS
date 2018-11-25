package homework.hw5.computer;

import java.util.Random;
import java.util.Scanner;

/**
 * Класс компьютера.
 *
 * @author Gnitko Andrei
 */
public class Computer {
    /**
     * Процессор.
     */
    private String processor;
    /**
     * Оперативка.
     */
    private int ram;
    /**
     * Жесткий диск.
     */
    private int rom;
    /**
     * Ресурс полных циклов работы (включений/выключений).
     */
    private int resource;
    /**
     * Сгорел ли компьютер
     */
    private boolean isBurned = false;
    /**
     * Включён ли компьютер
     */
    private boolean isOn = false;

    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();

    /**
     * Конструктор по умолчанию, задающий стандартные значения процессора, оперативки, жесткого диска и
     * ресурса полных циклов работы (включений/выключений)
     */
    public Computer() {
        this.processor = "Intel";
        this.ram = 16;
        this.rom = 1000;
        this.resource = 3000;
    }

    /**
     * Конструктор, задающий значения процессора, оперативки, жесткого диска и
     * ресурса полных циклов работы (включений/выключений)
     *
     * @param processor процессор
     * @param ram       оперативка
     * @param rom       жесткий диск
     * @param resource  ресурс полных циклов работы (включений/выключений)
     */
    public Computer(String processor, int ram, int rom, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
        this.resource = resource;
    }

    /**
     * Конструктор, задающий стандартные значения процессора, оперативки, жесткого диска и
     * заданное значение ресурса полных циклов работы (включений/выключений)
     *
     * @param resource ресурс полных циклов работы (включений/выключений)
     */
    Computer(int resource) {
        this.processor = "Intel";
        this.ram = 16;
        this.rom = 1000;
        this.resource = resource;
    }

    /**
     * Метод описание(вывод всех полей)
     */
    void output() {
        System.out.printf("процессор %s, оперативка %d, жесткий диск %d, ресурс полных циклов работы (включений/выключений) %d\n", this.processor, this.ram, this.rom, this.resource);
    }

    /**
     * Метод включить, при включении может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1),
     * вы вводите число с клавиатуры, если угадали комп выключается, если нет сгорает.
     * Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
     */
    void on() {
        if (!this.isBurned) {
            if (!this.isOn) {
                System.out.println("Введите 1 или 0");
                String s = sc.next();
                if (Integer.parseInt(s) == this.r.nextInt(2)) {
                    System.out.println("Компьютер включился");
                    this.isOn = true;
                } else {
                    this.isBurned = true;
                    System.out.println("Компьютер сгорел");
                }
            } else {
                System.out.println("Компьютер уже включен");
            }
        } else {
            System.out.println("Компьютер сгорел, не включается");
        }

    }

    /**
     * Метод выключить, при выключении может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1),
     * вы вводите число с клавиатуры, если угадали комп выключается, если нет сгорает.
     */
    void off() {
        if (this.isOn) {
            System.out.println("Введите 1 или 0");
            String s = this.sc.next();
            if (Integer.parseInt(s) == this.r.nextInt(2)) {
                System.out.println("Компьютер выключился");
                this.isOn = false;
                --this.resource;
            } else {
                this.isBurned = true;
                System.out.println("Компьютер сгорел");
            }
        } else {
            System.out.println("Компьютер не включен");
        }

        if (this.resource <= 0) {
            this.isBurned = true;
            System.out.println("Компьютер сгорел (ресурс полных циклов работы кончился)");
        }

    }
}
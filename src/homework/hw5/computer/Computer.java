package homework.hw5.computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private int ram;
    private int rom;
    private int resource;
    private boolean isBurned = false;
    private boolean isOn = false;
    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();

    public Computer() {
        this.processor = "Intel";
        this.ram = 16;
        this.rom = 1000;
        this.resource = 3000;
    }

    public Computer(String processor, int ram, int rom, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
        this.resource = resource;
    }

    Computer(int resource) {
        this.processor = "Intel";
        this.ram = 16;
        this.rom = 1000;
        this.resource = resource;
    }

    void output() {
        System.out.printf("процессор %s, оперативка %d, жесткий диск %d, ресурс полных циклов работы (включений/выключений) %d\n", this.processor, this.ram, this.rom, this.resource);
    }

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
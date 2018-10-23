package homework.hw5.computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private int ram;
    private int rom;
    private int resours;
    private boolean isBurned = false;
    private boolean isOn = false;
    Scanner scanner = new Scanner(System.in);;
    Random r = new Random();

    public Computer() {
        this.processor = "Intel";
        this.ram = 16;
        this.rom = 1000;
        this.resours = 3000;
    }

    public Computer(String processor, int ram, int rom, int resours) {
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
        this.resours = resours;
    }

    public Computer(int resours) {
        this.processor = "Intel";
        this.ram = 16;
        this.rom = 1000;
        this.resours = resours;
    }

    public void output() {
        System.out.printf("процессор %s, оперативка %d, жесткий диск %d, ресурс полных циклов работы (включений/выключений) %d\n", this.processor, this.ram, this.rom, this.resours);
    }

    public void on() {
        if (!this.isBurned) {
            if (!this.isOn) {
                System.out.println("Введите 1 или 0");
                String s = scanner.next();
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

    public void off() {
        if (this.isOn) {
            System.out.println("Введите 1 или 0");
            String s = this.scanner.next();
            if (Integer.parseInt(s) == this.r.nextInt(2)) {
                System.out.println("Компьютер выключился");
                this.isOn = false;
                --this.resours;
            } else {
                this.isBurned = true;
                System.out.println("Компьютер сгорел");
            }
        } else {
            System.out.println("Компьютер не включен");
        }

        if (this.resours <= 0) {
            this.isBurned = true;
            System.out.println("Компьютер сгорел (ресурс полных циклов работы кончился)");
        }

    }
}
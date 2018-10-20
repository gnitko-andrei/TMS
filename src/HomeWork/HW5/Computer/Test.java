package HomeWork.HW5.Computer;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Computer computer = new Computer(5);
        computer.output();
        computer.on();
        computer.off();
        computer.on();
        computer.off();
        computer.on();
        computer.off();
        computer.on();
    }
}
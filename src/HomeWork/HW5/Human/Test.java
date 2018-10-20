package HomeWork.HW5.Human;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Human human = new Human("Andrei", "casual");
        human.dressed();
        human.dressed();
        human.undressed();
        human.undressed();
        Human human2 = new Human("Саша", "official");
        human2.dressed();
        human2.dressed();
        human2.undressed();
        human2.undressed();
    }
}
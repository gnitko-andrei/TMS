package homework.hw5.human;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Human human = new Human("Andrei", "casual");
        human.dress();
        human.dress();
        human.undress();
        human.undress();
        Human human1 = new Human("Igor");
        human1.dress();
        Human human2 = new Human("Саша", "official");
        human2.dress();
        human2.dress();
        human2.undress();
        human2.undress();
    }
}
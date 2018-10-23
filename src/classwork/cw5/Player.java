package classwork.cw5;

public interface Player {
    default void play() {
        System.out.println("Player play");
    }

    void stop();

    default void pause() {
        print();
    }

    static void print() {
        System.out.println("Player pause");
    }
}
package homework.hw5.human.clothes.outwear;

/**
 * Класс пальто.
 *
 * @author Gnitko Andrei
 * @see Outwear
 */
public class Coat implements Outwear {
    /**
     * Надета ли вещь
     */
    private boolean isDressed;

    @Override
    public void putOnJacket() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Надеваем пальто");
        } else {
            System.out.println("Пальто уже было надето");
        }
    }

    @Override
    public void takeOffJacket() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Снимаем пальто");
        } else {
            System.out.println("Пальто уже было снято");
        }
    }
}

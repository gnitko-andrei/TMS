package homework.hw5.human.clothes.pants;

/**
 * Класс брюк.
 *
 * @author Gnitko Andrei
 * @see Pants
 */
public class Trousers implements Pants {
    /**
     * Надета ли вещь
     */
    private boolean isDressed;

    @Override
    public void putOnPants() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Надеваем брюки");
        } else {
            System.out.println("Брюки уже были надеты");
        }
    }

    @Override
    public void takeOffPants() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Снимаем брюки");
        } else {
            System.out.println("Брюки уже были сняты");
        }
    }
}
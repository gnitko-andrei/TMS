package homework.hw5.human.clothes.pants;

/**
 * Класс джинс.
 *
 * @author Gnitko Andrei
 * @see Pants
 */
public class Jeans implements Pants {
    /**
     * Надета ли вещь
     */
    private boolean isDressed;

    @Override
    public void putOnPants() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Надеваем джинсы");
        } else {
            System.out.println("Джинсы уже были надеты");
        }
    }

    @Override
    public void takeOffPants() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Снимаем джинсы");
        } else {
            System.out.println("Джинсы уже были сняты");
        }
    }
}
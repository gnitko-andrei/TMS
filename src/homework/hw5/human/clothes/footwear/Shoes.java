package homework.hw5.human.clothes.footwear;

/**
 * Класс туфлей.
 *
 * @author Gnitko Andrei
 * @see Footwear
 */
public class Shoes implements Footwear {
    /**
     * Надета ли вещь
     */
    private boolean isDressed;

    @Override
    public void putOnShoes() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Обуваем туфли");
        } else {
            System.out.println("Туфли уже были надеты");
        }
    }

    @Override
    public void takeOffShoes() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Разуваемся");
        } else {
            System.out.println("Туфли уже были сняты");
        }
    }
}
package homework.hw5.human.clothes.footwear;

/**
 * Класс кросовок.
 *
 * @author Gnitko Andrei
 * @see Footwear
 */
public class Sneakers implements Footwear {
    /**
     * Надета ли вещь
     */
    private boolean isDressed;

    @Override
    public void putOnShoes() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Обуваем кроссовки");
        } else {
            System.out.println("Кроссовки уже были надеты");
        }
    }

    @Override
    public void takeOffShoes() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Разуваемся");
        } else {
            System.out.println("Кроссовки уже были сняты");
        }
    }
}
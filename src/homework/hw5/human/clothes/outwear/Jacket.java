package homework.hw5.human.clothes.outwear;

/**
 * Класс куртики.
 *
 * @author Gnitko Andrei
 * @see Outwear
 */
public class Jacket implements Outwear {
    /**
     * Надета ли вещь
     */
    private boolean isDressed;

    @Override
    public void putOnJacket() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Надеваем куртку");
        } else {
            System.out.println("Кутка уже была надета");
        }
    }

    @Override
    public void takeOffJacket() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Снимаем куртку");
        } else {
            System.out.println("Куртка уже была снята");
        }
    }
}
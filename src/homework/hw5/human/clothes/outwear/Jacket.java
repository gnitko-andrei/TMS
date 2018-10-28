package homework.hw5.human.clothes.outwear;

public class Jacket implements Outwear {
    private boolean isDressed;

    public void putOnJacket() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Надеваем куртку");
        } else {
            System.out.println("Кутка уже была надета");
        }
    }

    public void takeOffJacket() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Снимаем куртку");
        } else {
            System.out.println("Куртка уже была снята");
        }
    }
}
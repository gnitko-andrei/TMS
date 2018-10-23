package HomeWork.HW5.Human.Clothes.Outwear;

public class Jacket implements Outwear {
    boolean isDressed;

    public Jacket() {
    }

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
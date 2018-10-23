package homework.hw5.human.clothes.outwear;

public class Coat implements Outwear {
    boolean isDressed;

    public Coat() {
    }

    public void putOnJacket() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Надеваем пальто");
        } else {
            System.out.println("Пальто уже было надето");
        }
    }

    public void takeOffJacket() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Снимаем пальто");
        } else {
            System.out.println("Пальто уже было снято");
        }
    }
}

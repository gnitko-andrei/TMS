package HomeWork.HW5.Human.Clothes.Pants;

public class Trousers implements Pants {
    boolean isDressed;

    public Trousers() {
    }

    public void putOnPants() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Надеваем брюки");
        } else {
            System.out.println("Брюки уже были надеты");
        }
    }

    public void takeOffPants() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Снимаем брюки");
        } else {
            System.out.println("Брюки уже были сняты");
        }
    }
}
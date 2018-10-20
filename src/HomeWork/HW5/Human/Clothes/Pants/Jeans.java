package HomeWork.HW5.Human.Clothes.Pants;

public class Jeans implements Pants {
    boolean isDressed;

    public Jeans() {
    }

    public void putOnPants() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Надеваем джинсы");
        } else {
            System.out.println("Джинсы уже были надеты");
        }
    }

    public void takeOffPants() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Снимаем джинсы");
        } else {
            System.out.println("Джинсы уже были сняты");
        }
    }
}
package homework.hw5.human.clothes.pants;

public class Trousers implements Pants {
    private boolean isDressed;

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
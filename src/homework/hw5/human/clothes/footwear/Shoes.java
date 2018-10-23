package homework.hw5.human.clothes.footwear;

public class Shoes implements Footwear {
    boolean isDressed;

    public Shoes() {
    }

    public void putOnShoes() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Обуваем туфли");
        } else {
            System.out.println("Туфли уже были надеты");
        }
    }

    public void takeOffShoes() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Разуваемся");
        } else {
            System.out.println("Туфли уже были сняты");
        }
    }
}
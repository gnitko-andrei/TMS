package homework.hw5.human.clothes.footwear;

public class Sneakers implements Footwear {
    boolean isDressed;

    public Sneakers() {
    }

    public void putOnShoes() {
        if (!this.isDressed) {
            this.isDressed = true;
            System.out.println("Обуваем кроссовки");
        } else {
            System.out.println("Кроссовки уже были надеты");
        }
    }

    public void takeOffShoes() {
        if (this.isDressed) {
            this.isDressed = false;
            System.out.println("Разуваемся");
        } else {
            System.out.println("Кроссовки уже были сняты");
        }
    }
}
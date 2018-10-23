package homework.hw5.human;

import homework.hw5.human.clothes.footwear.Footwear;
import homework.hw5.human.clothes.footwear.Shoes;
import homework.hw5.human.clothes.footwear.Sneakers;
import homework.hw5.human.clothes.outwear.Coat;
import homework.hw5.human.clothes.outwear.Jacket;
import homework.hw5.human.clothes.outwear.Outwear;
import homework.hw5.human.clothes.pants.Jeans;
import homework.hw5.human.clothes.pants.Pants;
import homework.hw5.human.clothes.pants.Trousers;

class Human {
    private String name;
    private Outwear outwear;
    private Pants pants;
    private Footwear footwear;

    Human(String name) {
        this.name = name;
        chooseCasualStyle();
    }

    Human(String name, String style) {
        this.name = name;
        if (style.equalsIgnoreCase("casual")) {
            chooseCasualStyle();
        } else if (style.equalsIgnoreCase("official")) {
            chooseOfficialStyle();
        }
    }

    private void chooseCasualStyle() {
        this.outwear = new Jacket();
        this.pants = new Jeans();
        this.footwear = new Sneakers();
    }

    private void chooseOfficialStyle() {
        this.outwear = new Coat();
        this.pants = new Trousers();
        this.footwear = new Shoes();
    }

    void dress() {
        this.outwear.putOnJacket();
        this.pants.putOnPants();
        this.footwear.putOnShoes();
    }

    void undress() {
        this.outwear.takeOffJacket();
        this.pants.takeOffPants();
        this.footwear.takeOffShoes();
    }
}

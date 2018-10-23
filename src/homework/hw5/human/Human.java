package HomeWork.HW5.Human;

import HomeWork.HW5.Human.Clothes.Footwear.Footwear;
import HomeWork.HW5.Human.Clothes.Footwear.Shoes;
import HomeWork.HW5.Human.Clothes.Footwear.Sneakers;
import HomeWork.HW5.Human.Clothes.Outwear.Coat;
import HomeWork.HW5.Human.Clothes.Outwear.Jacket;
import HomeWork.HW5.Human.Clothes.Outwear.Outwear;
import HomeWork.HW5.Human.Clothes.Pants.Jeans;
import HomeWork.HW5.Human.Clothes.Pants.Pants;
import HomeWork.HW5.Human.Clothes.Pants.Trousers;

public class Human {
    private String name;
    private Outwear outwear;
    private Pants pants;
    private Footwear footwear;

    public Human(String name) {
        this.name = name;
        chooseCasualStyle();
    }

    public Human(String name, String style) {
        this.name = name;
        if (style.equalsIgnoreCase("casual")) {
            chooseCasualStyle();
        } else if(style.equalsIgnoreCase("official"));

    }

    public void chooseCasualStyle() {
        this.outwear = new Jacket();
        this.pants = new Jeans();
        this.footwear = new Sneakers();
    }

    public void chooseOfficialStyle() {
        this.outwear = new Coat();
        this.pants = new Trousers();
        this.footwear = new Shoes();
    }

    public void dressed() {
        this.outwear.putOnJacket();
        this.pants.putOnPants();
        this.footwear.putOnShoes();
    }

    public void undressed() {
        this.outwear.takeOffJacket();
        this.pants.takeOffPants();
        this.footwear.takeOffShoes();
    }
}

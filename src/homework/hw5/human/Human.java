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

/**
 * Класс человек.
 *
 * @author Gnitko Andrei
 */
class Human {
    /**
     * Имя
     */
    private String name;
    /**
     * Куртка
     */
    private Outwear outwear;
    /**
     * Штаны
     */
    private Pants pants;
    /**
     * Обувь
     */
    private Footwear footwear;

    /**
     * Конструктор задающий имя, силь одежды по умолчанию повседневный
     *
     * @param name
     */
    Human(String name) {
        this.name = name;
        chooseCasualStyle();
    }

    /**
     * Конструктор задающий имя и силь одежды
     *
     * @param name  имя
     * @param style стиль одежды casual - повседневный, official - официальный
     */
    Human(String name, String style) {
        this.name = name;
        if (style.equalsIgnoreCase("casual")) {
            chooseCasualStyle();
        } else if (style.equalsIgnoreCase("official")) {
            chooseOfficialStyle();
        }
    }

    /**
     * Метод задающий повседневный стиль
     * куртка, джинсы, кросовки.
     */
    private void chooseCasualStyle() {
        this.outwear = new Jacket();
        this.pants = new Jeans();
        this.footwear = new Sneakers();
    }

    /**
     * Метод задающий оффициальный стиль
     * пальто, брюки, туфли
     */
    private void chooseOfficialStyle() {
        this.outwear = new Coat();
        this.pants = new Trousers();
        this.footwear = new Shoes();
    }

    /**
     * Метод для надевания всей одежды
     */
    void dress() {
        this.outwear.putOnJacket();
        this.pants.putOnPants();
        this.footwear.putOnShoes();
    }

    /**
     * Метод для снятия всей одежды
     */
    void undress() {
        this.outwear.takeOffJacket();
        this.pants.takeOffPants();
        this.footwear.takeOffShoes();
    }
}

package concretedecorator;

import component.HotDrinks;
import decorator.Decorator;

public class Cream extends Decorator {

    private double price = 0.1;
    private String description = "Cream";
    private HotDrinks hotDrinks;

    public Cream(HotDrinks hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public double getPrice() {
        return hotDrinks.getPrice() + price;
    }

    public String getDescription() {
        return hotDrinks.getDescription() + " with " + description;
    }

}

package decorator;

import component.HotDrinks;

public abstract class Decorator extends HotDrinks {

    public abstract double getPrice();

    public abstract String getDescription();
}

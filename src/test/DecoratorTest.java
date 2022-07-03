package test;

import component.HotDrinks;
import concretecomponent.Coffee;
import concretecomponent.Tea;
import concretedecorator.Cream;
import concretedecorator.Sugar;

/**
 * Made by  Adib Ghassani Waluya, Rizki Pramadhan, Yosua Santoso
 * This pattern will decorate the base class component.HotDrinks with addition of
 * sugar and cream.
 */

public class DecoratorTest {

    public static void main(String[] args) {

        //No decorator.Decorator
        HotDrinks blackCoffee = new Coffee();
        HotDrinks tea = new Tea();

        System.out.println(blackCoffee.getDescription() + ": EUR " + blackCoffee.getPrice()
                            + "\n" + tea.getDescription() + ": EUR " + tea.getPrice());

        //With decorator.Decorator

        HotDrinks coffeeCream = new Cream(new Coffee());
        HotDrinks coffeeSugar = new Sugar(new Coffee());
        HotDrinks coffeeComplete = new Cream(new Cream(new Sugar(new Coffee())));

        System.out.println(coffeeCream.getDescription() + ": EUR " + coffeeCream.getPrice()
                + "\n" + coffeeSugar.getDescription() + ": EUR " + coffeeSugar.getPrice()
                + "\n" + coffeeComplete.getDescription() + ": EUR " + coffeeComplete.getPrice()

        );

    }
}

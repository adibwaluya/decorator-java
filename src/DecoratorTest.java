/**
 * Made by  Adib Ghassani Waluya, Rizki Pramadhan, Yosua Santoso
 * This pattern will decorate the base class HotDrinks with addition of
 * sugar and cream.
 */

public class DecoratorTest {

    public static void main(String[] args) {

        //No Decorator
        HotDrinks blackCoffee = new Coffee();
        HotDrinks tea = new Tea();

        System.out.println(blackCoffee.getDescription() + ": EUR " + blackCoffee.getPrice()
                            + "\n" + tea.getDescription() + ": EUR " + tea.getPrice());

        //With Decorator

        HotDrinks coffeeCream = new Cream(new Coffee());
        HotDrinks coffeeSugar = new Cream(new Coffee());
        HotDrinks coffeeComplete = new Cream(new Cream(new Sugar(new Coffee())));

        System.out.println(coffeeCream.getDescription() + ": EUR " + coffeeCream.getPrice()
                + "\n" + coffeeSugar.getDescription() + ": EUR " + coffeeSugar.getPrice()
                + "\n" + coffeeComplete.getDescription() + ": EUR " + coffeeComplete.getPrice()

        );

    }
}

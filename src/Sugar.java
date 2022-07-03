public class Sugar extends Decorator{



    private double price = 0.05;
    private String description = "Sugar";
    private HotDrinks hotDrinks;

    public Sugar(HotDrinks hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public double getPrice() {
        return hotDrinks.getPrice() + price;
    }

    public String getDescription() {
        return hotDrinks.getDescription() + " with " + description;
    }

}

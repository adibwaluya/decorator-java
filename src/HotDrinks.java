/**
 * Base abstract class for HotDrinks
 */
public abstract class HotDrinks {

    private String description = "Unknown";

    public String getDescription() {
        return description;
    }

    /**
     * Returns the description of the
     * @param description the name of the drink initialized
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double getPrice ();

}

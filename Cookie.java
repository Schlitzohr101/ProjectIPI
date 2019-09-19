import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cookie extends DessertItem {
    private int amount;
    private int calories;
    private double pricePerDozen;

    /**
     * Default Constructor
     * Initializes object with null values
     */
    public Cookie() {
        super();
        amount = 0;
        pricePerDozen = 0;
    }

    /**
     * Non-Default Constuctor
     * Intializes object with parameter values
     * @param name of cookie
     * @param amount of cookie(s)
     * @param calories of serving
     * @param pricePerDozen
     */
    public Cookie(String name, int amount, int calories, double pricePerDozen) {
        this.name = name;
        this.amount = amount;
        this.calories = calories;
        this.pricePerDozen = pricePerDozen;
    }

    /**
     * setCalories
     * changes the amount of calories per serving
     * @param calories the calories to set
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * getCalories
     * returns the amount of calories per
     * @return the calories
     */
    @Override
    public int getCalories() {
        return calories;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @return the pricePerDozen
     */
    public double getPricePerDozen() {
        return pricePerDozen;
    }


    @Override
    public double getCost() {
        return BigDecimal.valueOf((amount/12.0) * pricePerDozen).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override 
    /**
     * toString
     * returns string representation of this object
     * @return name + (Cookie)
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name + (this.name == "" ? "" : "(Cookie)"));
        return builder.toString();
    }

    @Override
    public String printAsReceipt() {
        StringBuilder builder = new StringBuilder();
        builder.append(amount+" @ "+pricePerDozen+" /dz.\n");
        builder.append( String.format("%-29s %5.2f\n", this.toString(), getCost() )  );
        return builder.toString();
    }
}
import java.math.BigDecimal;
/*  William Murray, Adrian Seth
    September 26th, 2019
    Purpose: Program is designed to be a POS for the company Dessert Shoppe
    Program will accept various Dessert Items and calulate the total cost of
    the items selected
*/
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
     * getAmount
     * retuns the amount of cookies to be purchased
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * getPricePerDozen 
     * returns the price per dozen of calling cookie
     * @return the pricePerDozen as double
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
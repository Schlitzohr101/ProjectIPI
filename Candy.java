/*  William Murray, Adrian Seth
    September 26th, 2019
    Purpose: Program is designed to be a POS for the company Dessert Shoppe
    Program will accept various Dessert Items and calulate the total cost of
    the items selected
*/
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Candy extends DessertItem {
    private double  weight;
    private double  pricePerPound;
    private int     calories;

    /**
     * Default Constructor
     * Intializes object with null values
     */
    public Candy() {
        super();
        this.weight = 0;
        this.pricePerPound = 0;
        this.calories = 0;
    }

    /**
     * Non-Default Constructor
     * Intializes object with parameter values
     * @param name
     * @param weight
     * @param pricePerPound
     * @param calories
     */
    public Candy(String name, double weight, double pricePerPound, int calories) {
        this.name = name;
        this.weight = weight;
        this.pricePerPound = pricePerPound;
        this.calories = calories;
    }

    /**
     * setCalories
     * sets the calories per serving
     * @param calories the calories to set
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }

    /**
     * getCalories
     * gets the calories per serving
     * @return the calories
     */
    @Override
    public int getCalories() {
        return calories;
    }

    /**
     * getWeight
     * returns weight of calling candy object
     * @return the weight as double
     */
    public double getWeight() {
        return weight;
    }

    /**
     * getPricePerPound
     * gives the price per pound of calling candy
     * @return the pricePerPound as double
     */
    public double getPricePerPound() {
        return pricePerPound;
    }

    @Override
    public double getCost() {
       return BigDecimal.valueOf( this.weight*this.pricePerPound ).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public String toString() {
        //adjusting to be proper display format
        StringBuilder builder = new StringBuilder();
        builder.append(this.name + (this.name == "" ? "" : "(Candy)"));
        return builder.toString();
    }

    @Override
    public String printAsReceipt() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.weight + " lbs. @ "+this.pricePerPound+ "/lb.\n");
        builder.append( String.format("%-29s %5.2f\n", this.toString(), getCost() )  );
        return builder.toString();
    }
}
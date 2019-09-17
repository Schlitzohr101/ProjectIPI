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
    public int getCalories() {
        return calories;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return the pricePerPound
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
        StringBuilder builder = new StringBuilder();
        builder.append(getName()+"(Candy)");
        return builder.toString();
    }
}
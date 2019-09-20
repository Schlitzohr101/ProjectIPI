/*  William Murray, Adrian Seth
    September 26th, 2019
    Purpose: Program is designed to be a POS for the company Dessert Shoppe
    Program will accept various Dessert Items and calulate the total cost of
    the items selected
*/
public class Topping extends DessertItem {
    private int calories;
    private double cost;

    /**
     * Default Constructor
     * builds object with default values
     */
    Topping() {
        super();
        calories = 0;
        cost = 0;
    }

    /**
     * Non-default Contstructor
     * builds object with passed in arguments
     * @param name of topping
     * @param cost of topping
     * @param calories of topping
     */
    Topping(String name, double cost, int calories) {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
    }

    /** 
     * getCalories
     * returns the calories of the topping
     * @return num of calories as an int
     */
    @Override
    public int getCalories() {
        return calories;
    }

    /**
     * getCost
     * returns the cost of the topping
     * @return cost as a double
     */
    @Override
    public double getCost() {
        return cost;
    }

    /**
     * printAsReceipt
     * returns string of topping
     * @return topping in receipt format
     */
    @Override
    public String printAsReceipt() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + (name == "" ? "" : "(Topping)"));
        return builder.toString();
    }
}
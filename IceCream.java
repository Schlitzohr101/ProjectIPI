/*  William Murray, Adrian Seth
    September 26th, 2019
    Purpose: Program is designed to be a POS for the company Dessert Shoppe
    Program will accept various Dessert Items and calulate the total cost of
    the items selected
*/
public class IceCream extends DessertItem{
    protected double cost;
    protected int calories;
    /**
     * Default constructor
     * Initializes object
     *
     */
    public IceCream(){
        super();
        cost = 0;
        calories = 0;
    }
    /**
     * Non-default constructor
     * Initializes object with parameter values
     * @param name
     * @param cost
     * @param calories
     */

    public IceCream(String name, double cost, int calories){
        this.name = name;
        this.cost = cost;
        this.calories = calories;
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
     * @return the cost per ice cream
     */

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    /**
     * toString
     * returns string representation of this object
     * @return name
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name + (this.name == "" ? "" : "(IceCream)"));
        return builder.toString();
    }
    
    @Override
    public String printAsReceipt() {
        StringBuilder builder = new StringBuilder();
        builder.append( String.format("%-29s %5.2f\n", this.toString(), getCost() )  );
        return builder.toString();
    }
}
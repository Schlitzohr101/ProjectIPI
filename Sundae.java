/*  William Murray, Adrian Seth
    September 26th, 2019
    Purpose: Program is designed to be a POS for the company Dessert Shoppe
    Program will accept various Dessert Items and calulate the total cost of
    the items selected
*/
public class Sundae extends IceCream{
    private Topping topping;

    /**
     * Default Constructor
     * builds Sundae object with default values;
     */
    public Sundae(){
        super();
        topping = new Topping();
    }

    /**
     * Non-default constructor
     * Initializes object with parameter values
     * sets the Topping to null as it isn't included
     * @param name
     * @param cost
     * @param calories
     */
    public Sundae(String name, double cost, int calories){
        this.name = name;
        this.cost = cost;
        this.calories = calories;
        topping = null;
    } 

    /**
     * Non-default constructor
     * Builds Sundae and topping with arguements passed in
     * @param name of Sundae
     * @param cost of Sundae
     * @param calories of Sundae
     * @param topName name of topping
     * @param topCost cost of topping
     * @param topCal calories of topping
     */
    public Sundae(String name, double cost, int calories, String topName, double topCost, int topCal) {
        this.name = name;
        this.calories = calories;
        this.cost = cost;
        topping = new Topping(topName, topCost, topCal);
    }

    /**
     * getTopping
     * returns the object topping of the Sundae
     * @return the topping
     */
    public Topping getTopping() {
        return topping;
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
     * returns the amount of calories per sundae (and topping)
     * @return the calories
     */
    public int getCalories() {
        return (topping == null ? calories : calories + topping.getCalories());
    }

    /**
     * getCost
     * @return the cost per ice cream
     */
    @Override
    public double getCost() {
        return (topping == null ? cost : cost + topping.getCost()) ;
    }

    
    /**
     * toString
     * returns string representation of this object
     * @return name
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + (name == "" ? "" : "(Sundae)"));
        return builder.toString();
    }

    /**
     * printAsReceipt
     * returns either oneline receipt with sudae and price
     * or returns multiline with sundae then topping and price
     */
    @Override
    public String printAsReceipt() {
        StringBuilder builder = new StringBuilder();
        if (topping != null) {
            builder.append(this.toString()+" with\n");
        }
        builder.append( String.format("%-29s %5.2f\n", (topping != null ? topping.printAsReceipt() : this.toString()), getCost() ));
        return builder.toString();
    }
}
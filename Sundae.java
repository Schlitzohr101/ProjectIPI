public class Sundae extends IceCream{
    private double cost;
    private int calories;
    private int amount;
    public Sundae(){
        super();
        double cost = 0;
        int amount = 0;
        int calories = 0;
    }
    /**
     * Non-default constructor
     * Initializes object with parameter values
     * @param name
     * @param cost
     * @param calories
     * @param amount
     */
    public Sundae(String name, double cost, int calories, int amount){
        this.name = name;
        this.cost = cost;
        this.calories = calories;
        this.amount = amount;
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
        builder.append(getName()+" (Sundae)");
        return builder.toString();
    }
}
public abstract class DessertItem implements Comparable<DessertItem> {
    protected String name;

    /**
     * Default Constuctor
     * Intializes object with null values
     */
    public DessertItem() {
        this("");
    }

    /**
     * Non-default Constructor
     * Intializes object with passed in name
     */
    public DessertItem(String name) {
        this.name = name;
    }

    /**
     * getName
     * return the name of the desert item
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * getCost
     * returns cost of the inheriting object
     * @return cost of item with percision 2 rounded up
     */
    public abstract double getCost();

    /**
     * getCalories
     * returns the calories of the calling object
     * @return calories of item
     */
    public abstract int getCalories();

    /**
     * printAsReceipt
     * returns string of calling object
     * @return string in format for a receipt
     */
    public abstract String printAsReceipt();

    /**
     * compareTo
     * compares the calories of the calling object with those of the argument obj
     * @return 1 if greater, -1 if less, and 0 if equal
     */
    @Override
    public int compareTo(DessertItem arg0) {
        return getCalories() - arg0.getCalories();
    }
}
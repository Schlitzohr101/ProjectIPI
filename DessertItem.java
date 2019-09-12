package github.com.Schlitzohr101.ProjectIPI;
public abstract class DessertItem {
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
}
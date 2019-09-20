/*  William Murray, Adrian Seth
    September 26th, 2019
    Purpose: Program is designed to be a POS for the company Dessert Shoppe
    Program will accept various Dessert Items and calulate the total cost of
    the items selected
*/
import java.util.ArrayList;
import java.util.Collections;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Checkout {
    private ArrayList<DessertItem> items;
    private double taxRate;

    /**
     * Default Constructor
     * builds object with default values
     */
    Checkout() {
        items = new ArrayList<DessertItem>();
        taxRate = 0;
    }

    /**
     * clear
     * sets the reference to list to new memory
     */
    void clear() {
        items = new ArrayList<DessertItem>();
    }

    /**
     * enterItem
     * adds the argument item to list of items
     * @param newItem item to be added
     */
    void enterItem(DessertItem newItem) {
        items.add(newItem);
    }

    /**
     * numOfItems
     * returns the size of the list of items
     * @return list size
     */
    int numOfItems() {
        return items.size();
    }

    /**
     * toString
     * returns the Checkout object's state in receipt form
     * @return string of output receipt
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Output Receipt:\n");
        builder.append("Number of Items: "+numOfItems()+"\n");
        builder.append("Total cost: "+totalCost()+"\n");
        builder.append("Total tax: "+totalTax()+"\n");
        builder.append("Cost + Tax: "+(totalCost()+totalTax()) + "\n\n");
        builder.append("        A&S Dessert Shop\n");
        builder.append("        ----------------\n");

        for (DessertItem item : items) {
            builder.append(item.printAsReceipt());
        }

        builder.append( String.format("\n%-28s %6.2f\n", "Tax:",(double) totalTax()/100));
        builder.append( String.format("%-27s %7.2f\n", "Total Cost:",((double) totalTax() + (double) totalCost())/100));
        return builder.toString();
    }

    /**
     * totaltCost
     * returns the total cost of all items in list
     * @return int of cost of all items
     */
    int totalCost() {
        int cost = 0;
        for (DessertItem item : items) {
            cost += (int) (item.getCost()*100);
        }
        return cost;
    }

    /**
     * totalTax
     * returns the total tax applied to all items in checkout
     * @return tax as integer
     */
    int totalTax() {
        //multiplies int total cost with the tax rate which is a double, rounds the value and returns an int value
        int tax = BigDecimal.valueOf( totalCost() *taxRate ).setScale(0, RoundingMode.HALF_UP).intValue();
        return tax;
    }

    /**
     * getTaxRate
     * returns taxrate as double
     * @return the taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * setTaxRate
     * sets taxRate to arguements value
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * displayList
     * formal text display of all items in list with calories
     */
    public void displayList() {
        for (DessertItem var : items) {
            if (var instanceof Sundae) {
                Sundae s = (Sundae) var;
                System.out.println(s.toString() + (s.getTopping() == null ? " " : " with " + s.getTopping().printAsReceipt())+" has "+s.getCalories()+" calories.");
            } else {
                System.out.println(var.toString() + " has "+var.getCalories()+" calories.");
            }
        }
    }

    /**
     * sortList
     * calls the collections sort method to sort items in list based
     * on calories
     */
    public void sortList() {
        Collections.sort(items);
    }
}
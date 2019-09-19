import java.util.ArrayList;
import java.util.Collections;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Checkout {
    private ArrayList<DessertItem> items;
    private double taxRate;

    Checkout() {
        items = new ArrayList<DessertItem>();
        taxRate = 0;
    }

    void clear() {
        items = new ArrayList<DessertItem>();
    }

    void enterItem(DessertItem newItem) {
        items.add(newItem);
    }

    int numOfItems() {
        return items.size();
    }

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
        // builder.append(String.format(format, args))

        for (DessertItem item : items) {
            builder.append(item.printAsReceipt());
        }

        builder.append( String.format("\n%-28s %6.2f\n", "Tax:",(double) totalTax()/100));
        builder.append( String.format("%-27s %7.2f\n", "Total Cost:",((double) totalTax() + (double) totalCost())/100));
        return builder.toString();
    }

    int totalCost() {
        int cost = 0;
        for (DessertItem item : items) {
            cost += (int) (item.getCost()*100);
        }
        return cost;
    }

    int totalTax() {
        int tax = BigDecimal.valueOf( totalCost() *taxRate ).setScale(0, RoundingMode.HALF_UP).intValue();
        return tax;
    }

    /**
     * @return the taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void displayList() {
        for (DessertItem var : items) {
            System.out.println(var.toString() + " has "+var.getCalories()+" calories.");
        }
    }

    public void sortList() {
        Collections.sort(items);
    }
}
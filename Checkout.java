import java.util.ArrayList;

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
        //needs to be what is defined in the java doc in terms of formatting and printing of specific variables
        /*
        A&S Dessert Shop
        ----------------
2.5 lbs. @ 8.25 /lb.
Lolipop(Candy)              20.63
        */
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
            builder.append(item.toString());
        }

        builder.append( String.format("\n%-29s %5.2f\n", "Tax:",(double) totalTax()/100));
        builder.append( String.format("%-29s %5.2f\n", "Total Cost:",((double) totalTax() + (double) totalCost())/100));
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
}
import java.util.ArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Checkout {
    protected ArrayList<DessertItem> items;
    protected double taxRate;

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
        StringBuilder builder = new StringBuilder();
        for (DessertItem item : items) {
            builder.append(item.toString() + "\n\n");
        }
        return builder.toString();
    }

    int totalCost() {
        int cost = 0;
        for (DessertItem item : items) {
            cost += (int) item.getCost()*100;
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
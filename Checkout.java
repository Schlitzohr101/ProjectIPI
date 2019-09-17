import java.util.ArrayList;

import com.sun.tools.javac.jvm.Items;

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

    
}
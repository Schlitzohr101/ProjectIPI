public class ProjectIPI {
    public static void main(String[] args) {
        Checkout tester = new Checkout();
        tester.setTaxRate(0.085);
        System.out.println("Tester class\nCurrent tax rate:" + tester.getTaxRate());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("CANDY TESTER");
        Candy toffee = new Candy("Toffee", 1.21, 0.5, 330);
        Candy c = new Candy();
        Candy lolipopCandy = new Candy("Lolipop", 0.5, 5.00, 150);
        Candy candyCorCandy = new Candy("Candy Corn", 0.25, 6.25, 350);
        Candy chocolateBarCandy = new Candy("Chocolate Bar", 1, 12.25, 600);
        System.out.println( c.printAsReceipt()+"\n"+
                            toffee.printAsReceipt()+"\n"+
                            lolipopCandy.printAsReceipt()+"\n"+
                            candyCorCandy.printAsReceipt()+"\n"+
                            chocolateBarCandy.printAsReceipt()+"\n");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("COOKIE TESTER");
        Cookie ck = new Cookie();
        Cookie chocolateChipCookie = new Cookie("Chocolate Chip", 22, 650, 9.95);
        Cookie sugarCookie = new Cookie("Sugar", 9, 330, 13.40);
        Cookie peanutButterCookie = new Cookie("Peanut Butter", 4, 350, 9.99);
        Cookie SnickerDoodleCookie = new Cookie("Snicker Doodle", 10, 500, 14.65);
        System.out.println( ck.printAsReceipt()+"\n"+
                            chocolateChipCookie.printAsReceipt()+"\n"+
                            sugarCookie.printAsReceipt()+"\n"+
                            peanutButterCookie.printAsReceipt()+"\n"+
                            SnickerDoodleCookie.printAsReceipt()+"\n");
        System.out.println("-----------------------------------------------------------------------");    
        System.out.println("ICE CREAM TESTER");
        IceCream i = new IceCream();
        IceCream vanillaIceCream = new IceCream("Vanilla", 10.05, 500);
        IceCream chocolateIceCream = new IceCream("Chocolate", 12.25, 700);
        IceCream strawberryIceCream = new IceCream("Strawberry", 11.35, 640);
        IceCream cookiesnCreamIceCream = new IceCream("Cookies n\' Cream", 15.25, 750);
        System.out.println( i.printAsReceipt()+"\n"+
                            vanillaIceCream.printAsReceipt()+"\n"+
                            chocolateIceCream.printAsReceipt()+"\n"+
                            strawberryIceCream.printAsReceipt()+"\n"+
                            cookiesnCreamIceCream.printAsReceipt()+"\n");
        System.out.println("-----------------------------------------------------------------------");
        tester.enterItem(lolipopCandy);
        tester.enterItem(toffee);
        tester.enterItem(candyCorCandy);
        tester.enterItem(chocolateBarCandy);
        tester.enterItem(chocolateChipCookie);
        tester.enterItem(sugarCookie);
        tester.enterItem(peanutButterCookie);
        tester.enterItem(SnickerDoodleCookie);
        tester.enterItem(chocolateIceCream);
        tester.enterItem(vanillaIceCream);
        tester.enterItem(strawberryIceCream);
        tester.enterItem(cookiesnCreamIceCream);
        //Cookie ck = new Cookie("Choclate", 4, 150, 5.45);
        //tester.enterItem(ck);
        System.out.println(tester.toString() + "\n"); 
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("MAX TEST (SAME TYPES)");
        MaxOf(lolipopCandy, toffee);
        MaxOf(chocolateChipCookie, SnickerDoodleCookie);
        MaxOf(vanillaIceCream, cookiesnCreamIceCream);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("MAX TEST (DIFFERENT TYPES)"); 
        MaxOf(toffee, sugarCookie);
        MaxOf(peanutButterCookie, cookiesnCreamIceCream);
        MaxOf(chocolateBarCandy, vanillaIceCream);
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("UNSORTED LIST");
        tester.displayList();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("SORTED LIST");
        tester.sortList();
        tester.displayList(); 

    }

    public static void MaxOf(DessertItem item1, DessertItem item2) {
        int result = item1.compareTo(item2);
        StringBuilder builder = new StringBuilder();
        switch (result) {
            case 0:
            builder.append(item1.toString()+" with "+item1.getCalories()+" calories is equal to "+item2.toString()+" with "+item2.getCalories()+" calories.");
                break;
            default:
                if (result > 1) {
                    builder.append(item1.toString()+" with "+item1.getCalories()+" calories is bigger than "+item2.toString()+" with "+item2.getCalories()+" calories.");
                } else {
                    builder.append(item2.toString()+" with "+item2.getCalories()+" calories is bigger than "+item1.toString()+" with "+item1.getCalories()+" calories.");
                }
            break;
        }
        System.out.println(builder.toString());
    }
}



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
        System.out.println( c.toString()+"\n"+
                            toffee.toString()+"\n"+
                            lolipopCandy.toString()+"\n"+
                            candyCorCandy.toString()+"\n"+
                            chocolateBarCandy.toString()+"\n");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("COOKIE TESTER");
        Cookie ck = new Cookie();
        Cookie chocolateChipCookie = new Cookie("Chocolate Chip", 22, 650, 9.95);
        Cookie sugarCookie = new Cookie("Sugar", 9, 330, 13.40);
        Cookie peanutButterCookie = new Cookie("Peanut Butter", 4, 350, 9.99);
        Cookie SnickerDoodleCookie = new Cookie("Snicker Doodle", 10, 500, 14.65);
        System.out.println( ck.toString()+"\n"+
                            chocolateChipCookie.toString()+"\n"+
                            sugarCookie.toString()+"\n"+
                            peanutButterCookie.toString()+"\n"+
                            SnickerDoodleCookie.toString()+"\n");
        tester.enterItem(c);
        tester.enterItem(lolipopCandy);
        tester.enterItem(toffee);
        tester.enterItem(candyCorCandy);
        tester.enterItem(chocolateBarCandy);
        tester.enterItem(ck);
        tester.enterItem(chocolateChipCookie);
        tester.enterItem(sugarCookie);
        tester.enterItem(peanutButterCookie);
        tester.enterItem(SnickerDoodleCookie);
        //Cookie ck = new Cookie("Choclate", 4, 150, 5.45);
        //tester.enterItem(ck);
        System.out.println(tester.toString());     
    }
}



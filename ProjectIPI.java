public class ProjectIPI {
    public static void main(String[] args) {
        Checkout tester = new Checkout();
        Candy c1 = new Candy("toffee", 1.21, 0.5, 330);
        tester.enterItem(c1);
        Cookie ck = new Cookie("Choclate", 4, 150, 5.45);
        tester.enterItem(ck);
        System.out.println(tester.toString());     
    }
}



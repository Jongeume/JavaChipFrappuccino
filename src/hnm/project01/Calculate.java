package hnm.project01;

public class Calculate {
    public static int calcTotal(Customer cu) {
        int total = 0;
        for (Menu menu : cu.getCart()) {
            total += menu.getPrice();
        }
        return total;
    }
}

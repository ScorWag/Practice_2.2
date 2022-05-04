public class Main {
    public static void main(String[] args) {
        int balanceBefore = 500;
        int refill = 582;
        int balanceAfter;
        if (refill > 1000) {
            balanceAfter = balanceBefore + refill + refill/ 100;
            } else {
            balanceAfter = balanceBefore + refill;
        }
        System.out.println(balanceAfter);
    }
}

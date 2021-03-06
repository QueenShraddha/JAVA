public class forStatement {
    public static void main(String[] args) {
        // System.out.println("10,000 at 2% interest = "+ calculateInterest(10000.0, 2.0));
        for(int i=8;i>1;i--) {
            System.out.println("10,000 at " + i +" % interest = "+ String.format("%.3f",calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount*(interestRate/100));
    }
}

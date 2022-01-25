public class ifelse {
    public static void main(String[] args) {
        int number = 12;
        if(number > 0) {
            System.out.println("Positive Number");
        }
        System.out.println("Code outside the if Statement");
        number = -12;
        if(number > 0) {
            System.out.println("Positive Number");
        }
        else{
        System.out.println("Negative Number");
        }
    }
}

import java.util.Scanner;
public class doubleInput {
    public static void main(String[] args) {
        Scanner input = new
        Scanner(System.in);
        System.out.println("Enter a number: ");
        double data = input.nextDouble();
        System.out.println("Input Data: "+ data);
        input.close();
    }
}

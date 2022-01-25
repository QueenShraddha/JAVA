import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner input = new
        Scanner (System.in);

        System.out.println("Enter an integer:");

        int data = input.nextInt();

        System.out.print("Input Data: "+ data);

        input.close();
    }
}

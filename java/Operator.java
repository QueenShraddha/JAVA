public class Operator {
    public static void main(String[] args) {
        int age = 24, salary = 950;
        boolean result;
        result = (age >= 18 && salary > 600);
        System.out.println(result);

        result = (age >= 18 && salary > 1000);
        System.out.println(result);
        
        result = (age >= 18 || salary > 600);
        System.out.println(result);

        result = (age >= 30 || salary > 1000);
        System.out.println(result);

        result = !(age >= 24);
        System.out.println(result);

        result = !(age == 25);
        System.out.println(result);
    }
}

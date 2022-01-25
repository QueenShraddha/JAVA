public class challenge1 {
    public static void main(String[] args) {
        double a = 20.00d;
        double b = 80.00;
        double c = (a + b) * 100.00;
        System.out.println(c);
        double d = c%40.00;
        System.out.println(d);
        boolean f = true;
        f =(d == 0)  ? true : false;
        System.out.println(f);
        if (f == false)
        {
            System.out.println("Got some remainder");
        }

    }
}

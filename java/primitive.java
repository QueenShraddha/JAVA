public class primitive {
    public static void main(String[] args) {
        byte r = 10;
        short s = 30;
        int c = 50;
        long d = 50000L + 10L * (r + s + c);
        System.out.println(d);


        short f = (short) (1000 + 10 * (r + s + c));

        int a = 5;
        float l = (float) 5.25;
        float m = 6f / 2f;
        double g = 5.25d;
        System.out.println("a =" + a);
        System.out.println("l =" + l);


    }
    
}

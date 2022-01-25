public class recapString {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String r = "this is a string";
        System.out.println(r);
        String myString = r + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        String g = myString + "\u00A9 2019";
        System.out.println("myString equal to " + g);
        String s = "250.55";
        r = s + "49.95";
        System.out.println(r);
        String lastString = "10";
        int myInt = 50;
        String h = lastString + myInt;
        System.out.println("LastString is equal to " + h);
        
    }
}

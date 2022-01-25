public class operatorANDoperatand {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        result = result - 1;
        System.out.println(result);
        boolean d = false;
        if (d == false)
        System.out.println("It is not a alian.");
        
        int topScore = 120;
        if (topScore >= 100) {
            System.out.println("you got the high score");
        }
        int second = 60;
        if((topScore>second) && (topScore==120))
        {
            System.out.println("good");
        }

        if ((topScore>90) ||(topScore<80))
        {
            System.out.println("bad");
        }
        
    }
}

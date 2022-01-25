public class keywordsEXpression {
    public static void main(String[] args) {
        
        
        calculateScore(true, 5000, 5, 100);

        calculateScore(true,10000 , 8, 200);
    //   if(score < 5000 && score > 1000) {
    //       System.out.println("Your score was less than 5000 but greater than 1000");
    //   } else if (score < 1000) {
    //       System.out.println("Your score was less than 1000");
    //   } else {
    //       System.out.println("got here");
    //   }
         
        
        }
   
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        
        if(gameOver) {
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 1000;
            System.out.println("your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}

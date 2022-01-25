public class display {
    public static void main(String[] args) {
        String playerName = "shraddha";
        int playerScore = 1500;
        int position = calculateHighScorePosition(playerScore);
        displayHighScorePostion(playerName, position);

        playerName = "shreya";
        playerScore = 900;
        position = calculateHighScorePosition(playerScore);
        displayHighScorePostion(playerName, position);


    }
    public static void displayHighScorePostion (String playerName, int position) {
        System.out.println(playerName +" managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 & playerScore < 1000) {
            return 2;
        }else if (playerScore >100 & playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
        

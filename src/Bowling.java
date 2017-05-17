import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Tobias on 2017-05-16.
 */
public class Bowling {

    // Makes two throws, returns frame array with result
    public int[] makeThrow() {

        int frame[] = new int[2];

        for (int i = 0; i < 2; i++) {
            frame[i] = ThreadLocalRandom.current().nextInt(0, 10 + 1);

            if (frame[0] == 10) {
                frame[1] = 0;
                i++;
            }
        }
        return frame;
    }

    // Calculates and returns the combined frame score
    public int calculateFrameScore(int frame[]) {

        return frame[0] + frame[1];
    }

    // Creates a game array and fills it with frames.
    public int[][] makeGame() {

        int game[][] = new int[10][2];

        for (int i = 0; i < 10; i++) {
            game[i] = makeThrow();
        }
        return game;
    }

    // Calculates the score for the game
    public int calculateGameScore(int game[][]) {

        int scoreToReturn = 0;
        int strikeCounter = 0;

        for (int i = 0; i < 10; i++) {
            scoreToReturn += calculateFrameScore(game[i]);


            if (game[i][0] == 10) {
                strikeCounter++;

                if(i < 9) {
                    scoreToReturn += game[i + 1][0];

                    if (game[i + 1][0] == 10) {
                        scoreToReturn += game[i + 2][0];
                    } else {
                        scoreToReturn += game[i + 1][1];
                    }
                }
            } else {
                if (strikeCounter > 0) {
                    announceStrike(strikeCounter);
                }
                strikeCounter = 0;
            }

            if ((game[i][0] + game[i][1]) == 10 && game[i][0] != 10) {
                scoreToReturn += game[i + 1][0];
                System.out.println("Spare!");
            }

        }
        return scoreToReturn;
    }

    // Announces who da boss in this round
    public void announceStrike(int strikeCounter) {
        switch (strikeCounter){
            case 1:
                System.out.println("STRIKE!");
                break;
            case 2:
                System.out.println("DOUBLE STRIKE!");
                break;
            case 3:
                System.out.println("TURKEY!");
                break;
            case 4:
                System.out.println("HAMBONE!");
                break;
            case 5:
                System.out.println("QUINTIPLE STRIKE!");
                break;
            case 6:
                System.out.println("WILD TURKEY!");
                break;
        }

    }


}

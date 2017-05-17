/**
 * Created by Tobias on 2017-05-16.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    Bowling yesWeBowl = new Bowling();

    /* User story 1
    ** Motivation: Not really needed because you can't write the code any simpler.
    */
    // Checks if makeThrow returns an int array(frame)
    @Test
    public void testCaseUno(){

        Assertions.assertTrue(yesWeBowl.makeThrow() instanceof int[]);
    }

    /* User story 2
    ** Motivation: Calculate frame score adds the first throw of the frame with the second and returns the result. It can't get any simpler than this.
    */
    // Checks if calculateFrameScore calculates the frame score correctly.
    @Test
    public void testCaseTwo() {

        int testArr1[] = {1,2};
        int testArr2[] = {9,0};
        int testArr3[] = {0,0};
        int testArr4[] = {-1,-7};
        int testArr5[] = {11,11};

        int resultArr[] = {3, 9, 0, -8, 22};

        Assertions.assertEquals(yesWeBowl.calculateFrameScore(testArr1), resultArr[0]);
        Assertions.assertEquals(yesWeBowl.calculateFrameScore(testArr2), resultArr[1]);
        Assertions.assertEquals(yesWeBowl.calculateFrameScore(testArr3), resultArr[2]);
        Assertions.assertEquals(yesWeBowl.calculateFrameScore(testArr4), resultArr[3]);
        Assertions.assertEquals(yesWeBowl.calculateFrameScore(testArr5), resultArr[4]);
    }

    /* User story 3
    ** Movitivation: We create a 2d array and fill it with 10 frames. It is efficient.
    */
    // Check if a game consists of 10 frames
    @Test
    public void testCaseThree() {

        Assertions.assertEquals(yesWeBowl.makeGame().length, 10);
    }

    /* User story 4
    ** Motivation: We iterate through a loop 10 times and make throws then loop to calculate the game score. Simple and easy.
    */
    // Checks if the sum score of a full game is correct
    @Test
    public void testCaseFour() {

        int expectedResult = 81;

        // Own calculation
        int tempGame[][] = {{1, 5},{3, 6},{7, 2},{3, 6},{4, 4},{5, 3},{3, 3},{4, 5},{8, 1},{2, 6}};

        // Assert comparison
        Assertions.assertEquals(expectedResult, yesWeBowl.calculateGameScore(tempGame));
    }

    /* User story 5
    ** Motivation: Took example game and injected strike. Simple as that.
    */
    // Checks the sum total for a game with a strike.
    @Test
    public void testCaseFive() {

        int tempGame[][] = {{1, 5},{3, 6},{7, 2},{3, 6},{4, 4},{5, 3},{3, 3},{4, 5},{8, 1},{2, 6}};

        tempGame[0][0] = 10;
        tempGame[0][1] = 0;

        int expectedResult = 94;

        Assertions.assertEquals(expectedResult, yesWeBowl.calculateGameScore(tempGame));

    }

    /* User story 6
    ** Motivation: Workable solution. Can't figure out how to make it better. See testCaseFive.
    */
    // Checks the sum total for a game with a spare.
    @Test
    public void testCaseSix() {

        int tempGame[][] = {{1, 9},{3, 6},{7, 2},{3, 6},{4, 4},{5, 3},{3, 3},{4, 5},{8, 1},{2, 6}};

        int expectedResult = 88;

        Assertions.assertEquals(expectedResult, yesWeBowl.calculateGameScore(tempGame));

    }

    /* User story 7
    ** Motivation: Previous implementation(5 & 6)  (accidentally) fullfilled both user stories.
    */
    // Checks the sum total for a game with a strike followed by a spare.
    @Test
    public void testCaseSeven() {

        int tempGame[][] = {{10, 0},{3, 7},{7, 2},{3, 6},{4, 4},{5, 3},{3, 3},{4, 5},{8, 1},{2, 6}};

        int expectedResult = 103;

        Assertions.assertEquals(expectedResult, yesWeBowl.calculateGameScore(tempGame));

    }

    /* User story 8
    ** Motivation: Probably not the simplest solution, but the simplest we could come up with for now.
    **
    ** Sidenote: Another viable and interesting option could have been to frames objects instead. Proceeding with current route for now.
    */
    // Checks the sum total for a game with two strikes in a row.
    @Test
    public void testCaseEight() {

        int tempGame[][] = {{10, 0},{10, 0},{7, 2},{3, 6},{4, 4},{5, 3},{3, 3},{4, 5},{8, 1},{2, 6}};

        int expectedResult = 112;

        Assertions.assertEquals(expectedResult, yesWeBowl.calculateGameScore(tempGame));

    }

    /* User story 9
    ** Motivation: Spare function already handled 2 spares in a row. This was done by checking if the frame score was 10(but not a strike) prior to the spare calculation. Found error if spare was on last frame. Solved by adding exception for spare on last frame.
    **
    */
    // Checks the sum total for a game with two spares in a row.
    @Test
    public void testCaseNine() {

        int tempGame[][] = {{8, 2},{5, 5},{7, 2},{3, 6},{4, 4},{5, 3},{3, 3},{4, 5},{8, 1},{4, 6}};

        int expectedResult = 100;

        Assertions.assertEquals(expectedResult, yesWeBowl.calculateGameScore(tempGame));

    }

}


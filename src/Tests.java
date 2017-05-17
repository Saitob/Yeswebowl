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
        int testArr2[] = {10,0};
        int testArr3[] = {0,0};
        int testArr4[] = {-1,-7};
        int testArr5[] = {11,11};

        int resultArr[] = {3, 10, 0, -8, 22};

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
    **
    */
    // Checks if the sum score of a full game is correct
    @Test
    public void testCaseFour() {

        int expectedResult = 0;

        // Own calculation
        int tempGame[][] = yesWeBowl.makeGame();

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 2; j++) {

                expectedResult += tempGame[i][j];

            }

        }

        // Assert comparison
        Assertions.assertEquals(expectedResult, yesWeBowl.calculateGameScore(tempGame));

    }

}


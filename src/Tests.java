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

}


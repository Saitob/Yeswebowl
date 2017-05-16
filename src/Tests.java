/**
 * Created by Tobias on 2017-05-16.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    /* User story 1
    ** Motivation: Not really needed because you can't write the code any simpler.
    */
    // Checks if makeThrow returns an int array(frame)
    @Test
    public void testCaseUno(){

        Bowling yesWeBowl = new Bowling();
        
        Assertions.assertTrue(yesWeBowl.makeThrow() instanceof int[]);
    }

    // User story 2


}


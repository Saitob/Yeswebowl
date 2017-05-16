/**
 * Created by Tobias on 2017-05-16.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void testcaseuno(){

        Bowling yesWeBowl = new Bowling();
        
        Assertions.assertTrue(makeThrow() instanceof int[]);
    }


}

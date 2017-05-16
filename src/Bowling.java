import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Tobias on 2017-05-16.
 */
public class Bowling {

    // Makes two throws, returns frame array with result
    public int[] makeThrow(){

        int frame[] = new int[2];

        for (int i = 0; i < 2; i++) {

            frame[i] = ThreadLocalRandom.current().nextInt(0, 10 + 1);
            System.out.println(frame[i]);
        }


        return frame;
    }


}

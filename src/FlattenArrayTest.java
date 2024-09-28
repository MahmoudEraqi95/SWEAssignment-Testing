import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class FlattenArrayTest {




    Main main;
    @Before
    public void setUp(){
        main = new Main();
    }

    @Test
    public void testFlattenArrayWithValidInput(){
        int[][] testArr =  new int[5][2];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(testArr[i], 2);
        }
        int[] result = main.flattenArray(testArr);
        Assert.assertArrayEquals(result, new int[]{2,2,2,2,2,2,2,2,2,2});

    }
    @Test
    public void testFlattenArrayWithNull(){
        int[] result = main.flattenArray(null);
        Assert.assertArrayEquals(result, new int[]{-1});
    }

}

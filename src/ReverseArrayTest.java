import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class ReverseArrayTest {
    Main main;
    ArrayReverser arrayReverser;
    @Before
    public void setUp(){
        main = Mockito.mock(Main.class);
        arrayReverser = new ArrayReverser();
    }


    @Test
    public void testReversedArrayWithValidInput(){
        when(main.flattenArray(any()))
                .thenReturn(new int[]{2,2,1,1});
        when(main.flattenArray(null))
                .thenReturn(new int[]{-1});
        int[] flattenedArray =  main.flattenArray(new int[4][2]);
        int[] reversedArray = arrayReverser.reverseArray(flattenedArray);
        Assert.assertArrayEquals(reversedArray, new int[]{1,1,2,2});
    }
    @Test
    public void testReversedArrayWithNull(){

        when(main.flattenArray(null))
                .thenReturn(new int[]{-1});
        int[] flattenedArray =  main.flattenArray(new int[4][2]);
        int[] reversedArray = arrayReverser.reverseArray(flattenedArray);
        Assert.assertArrayEquals(reversedArray, new int[]{-1});
    }

}

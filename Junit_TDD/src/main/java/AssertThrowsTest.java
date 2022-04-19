import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AssertThrowsTest {
    @Test
    public void testArrays(){
        int actual[] = {1,2,3,4};
        int expected[] ={2,1,3,4};
        Arrays.sort(expected);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testException(){
        Assertions.assertThrows(NullPointerException.class,()->{
            int numbers[] = null;
            Arrays.sort(numbers);
        });
    }
}

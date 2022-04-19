import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShapeTest {
    @Test
    public void testArea(){
        //arrange
        ShapeDemo shape = new ShapeDemo() ;

        //act
        double expected = 12.566370614359172;
        double actual = shape.area(2);

        //assert
        assertEquals(expected,actual,0.001);
    }
}

/*
delta to avoid problems with round-off errors while doing floating point comparisons.
 */
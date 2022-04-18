import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest1
{
    @Test
    public void testAdd(){
        Calculator addition = new Calculator();
        assertEquals(10,addition.add(5,5));
    }
    @Test
    public void testDiv(){
        Calculator division = new Calculator();
        assertEquals("Success",5,division.div(18,2));
    }
    @Test
    public void testMultiplication(){
        Calculator multiplication = new Calculator();
        assertEquals("Success",20,multiplication.multiplication(10,2));
    }
    @Test
    public void testSubtraction(){
        Calculator subtraction = new Calculator();
        assertEquals("Success",-8,subtraction.subtraction(2,10));
    }
}


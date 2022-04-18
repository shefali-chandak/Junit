import org.junit.After;
import org.junit.Before;

/*
@Before -> Method runs before each Test case method
@After ->  Method runs after each Test case method

@Ignore -> It ignore the test method and write in Test class
 */

class Calculator {

//    @Before
    public int add(int a,int b) {
        System.out.println("Addition");
        return a + b;
    }

//    @Before
    public int div(int a,int b){
        System.out.println("Division");
        if(b==0)
            throw new ArithmeticException("B value should be non-zero number==>"+b);
        return (a/b);
    }

    @Before
    public int multiplication(int a,int b) throws InterruptedException {
        System.out.println("Multiplication");
        Thread.sleep(1000);
        return a*b;
    }

    @After
    public int subtraction(int a,int b){
        System.out.println("Subtraction");
        return a-b;
    }
}

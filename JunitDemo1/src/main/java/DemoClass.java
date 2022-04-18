import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class DemoClass {
    public static void main(String[] args) {

        /*
        Result result = JUnitCore.runClasses(CalculatorTest1.class);
         */

        Result result = JUnitCore.runClasses(AssertTest.class);
        for( Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("Result was: " + result.wasSuccessful());
    }
}

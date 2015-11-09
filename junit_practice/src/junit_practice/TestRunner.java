package junit_practice;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String args[]){
		Result result = JUnitCore.runClasses(testcase1.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}

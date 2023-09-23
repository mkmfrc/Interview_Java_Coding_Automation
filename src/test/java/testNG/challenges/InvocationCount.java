package testNG.challenges;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	public void getBeforeClass() {
		System.out.println("Run BeforeClass");
	
	}
	
}

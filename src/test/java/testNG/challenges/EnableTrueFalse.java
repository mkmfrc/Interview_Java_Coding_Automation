package testNG.challenges;

import org.testng.annotations.Test;

public class EnableTrueFalse {
	@Test
	public void getBeforeClass1() {
		System.out.println("Run BeforeClass1");
	}
	@Test (enabled= false) 
	public void getBeforeClass2() {
		System.out.println("Run BeforeClass2");
	}
	@Test
	public void getBeforeClass3() {
		System.out.println("Run BeforeClass3");
	}
}

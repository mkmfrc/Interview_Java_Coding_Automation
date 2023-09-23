package testNG.challenges;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups = "Smoke")
	public void groupTest1() {
		System.out.println("Run BeforeClass1");
	}
	@Test(groups = "Smoke")
	public void groupTest2() {
		System.out.println("Run BeforeClass2");
	}
	@Test(groups = "Smoke")
	public void groupTest3() {
		System.out.println("Run BeforeClass3");
	}
}

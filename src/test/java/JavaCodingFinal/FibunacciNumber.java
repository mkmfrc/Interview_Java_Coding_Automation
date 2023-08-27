package JavaCodingFinal;

import org.testng.annotations.Test;

public class FibunacciNumber {

	//What is Fibunacci number?
	// '0' & '1' itself fibunacci numbers
	// 0+1 = 1 , 
	//1+1= 2,
	//1+2= 3, 
	//2+3 = 5
	//3+5= 8
	//5+8= 13
	
	//Q: How to find the Fibunacci number?
	@Test
	public void fibunacciNumber() {
		
		int num = 10; 
		int first = 0;
		int sec = 1;
		
		for(int  i= 1; i<=num; i++ ) {
			System.out.println(first + ", " );
			int third = first + sec;
			first = sec;
			sec = third;
		}	
	}
}

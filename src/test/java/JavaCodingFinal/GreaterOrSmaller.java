package JavaCodingFinal;

public class GreaterOrSmaller {

	//Create one return method which returns either true or false if number is greater or less?
	
	
	public static boolean greaterNumber(int num) {
		
		if(num > 10) {
			return true;
		}else {
			return false;
		}
	}
		
	public static void main(String[] args) {
		
		System.out.println(greaterNumber(10));
		
	}
	
}

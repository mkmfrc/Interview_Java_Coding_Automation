package JavaCodingFinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import cucumber.api.cli.Main;

public class PracticeA {

	
	//How to merge arrays?
	//@Test
	void mergeArray(){
		
		
		String [] winter = {"W", "I", "N", "T", "E", "R"};
		
		String [] spring = {"S", "P", "R", "I", "N", "G"};
		
		
		ArrayList <String> season = new ArrayList<>(Arrays.asList(winter));
		
		season.addAll(Arrays.asList(spring));
		
		Object[] mergeValue = season.toArray();
		
		System.out.println(Arrays.toString(mergeValue));
		
	}
	
	//Create one return method which returns either true or false if number is greater or less?
	
	
		public static boolean evenOdd(int num) {
			
			if(num%2==0) {
				return true;
			}else {
				
				return false;
			}
		}
			
		public static void main(String[] args) {
			
			System.out.println(evenOdd(10));
			
		}
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//@Test
	void swapValue() {
		
		// i need to declare two separate variable x and y and pass my value there
		int x=20;
		int y =30;
		
		x=x+y; 		//first i am going to add x and y value and storing into x variable 
		
		y=x-y; 		//now i am going to subtract x to y and storing it into y variable
		
		x=x-y; 		//at the end again i am going to subtract x to y again and store the value into x
					//thats how i swap the value
	} 
	
	
	void breakLoop() {
		
		int value = 10;
		
		for (int i=0; i<value; i++) {
			if(i==5) {
				break;
				
			}
		}
		
		for(int i = 0; i<value; i++) {
			if(i==5){
				break;
			}
		}	
	}
	
	void continueLoop() {
		int value = 10;
		
		for(int i = 0; i<value; i++) {
			if(i==5){
				continue;
			}
		}
	}
}

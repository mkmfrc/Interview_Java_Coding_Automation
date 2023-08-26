package automation.challengesFinal;

public class GarbageCollector {

	//Q: What is Garbage Collector? How to use it? or what is finalize()?
	
	
	//Garbage is nothing but some random string, number or characters which holds the memory 
		//so we need to clean them by using finalize() method
	
	// First we have to create the finalize() method
	//Inside the method we have to call the necessary methods to collect the garbage
	public void finalize() {
	
		System.out.println("Grabage collector call"); 
		System.out.println("Object garbage collect" + this);
	}
	
	public static void main(String[] args) {
	
		//Inside the execution method i have to create an object
		GarbageCollector gc1 = new GarbageCollector();
		GarbageCollector gc2 = new GarbageCollector();
		
		// than i have to initialize "object = null" which is called Nullify garbage collection
		gc1 = null; 
		
		//Now from the System class i can call the gc() method 
		//which collects all the garbage
		System.gc();
		
		//Finally with the help of Runtime class i call getRuntime().gc() method 
		// this will remove all the garbage internally
		Runtime.getRuntime().gc();
		
	}

}

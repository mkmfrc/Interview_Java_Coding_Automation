package JavaCodingFinal;

public class StringImmutable {

public void stringImmutable(){
	
		//String is immutable, so when you use concat or other operations, 
		//a new String is created, and the original remains unchanged.

			String str = "Hello";
			str = str.concat(" World"); 
		// New String "Hello World", original "Hello" is unchanged


		//StringBuilder is mutable, so when you use append, 
		//it modifies the existing StringBuilder without creating a new object:

			StringBuilder sb = new StringBuilder("Hello");
				sb.append(" World"); 
		// Modifies the original StringBuilder, no new object created
	

		//The key difference is that String operations create new objects, 
				//while StringBuilder operations modify the existing object directly.
}	
	
}

package JavaCodingFinal;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ContainStringOrValue {

	// Question : How can you check existence of a value in Array?
	
	 @Test
	public void getSortedData() {

		List<String> list = Arrays.asList("Mahin", "Kaniz", "Rakib", "Emran", "Fatema", "Dolly");

		if (list.contains("Emran")) {
			 System.out.println("Emran is present");
		} else {
			 System.out.println("Fakibaz");
		}
	 }
}

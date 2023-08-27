package JavaCodingFinal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class SortDataFromArrayList {

	// Question 10: How to sort the data from Array?
	// Sub Question : How can you check existence of a value in Array?
	 @Test
	public void getSortedData() {

		List<String> list = Arrays.asList("Mahin", "Kaniz", "Rakib", "Emran", "Fatema", "Dolly");

		Collections.sort(list);
		
		System.out.println(list);
		
//		for (String sortedValue : list) {
//			System.out.println("After data sorting : " + sortedValue);
//		}
	}
}

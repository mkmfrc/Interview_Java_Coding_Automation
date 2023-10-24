package JavaCodingFinal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateValue {

	// Question 8: How to remove duplicate value from Array or ArrayList?
	// @Test
	// Using LIST

	static Integer[] value = { 1, 2, 3, 2, 1, 4, 5, 4 };

	public void getRemoveDuplicateList() {
		

		List<Integer> removeDup = Arrays.asList(value);

		List<Integer> newDup = removeDup.stream().distinct().collect(Collectors.toList());
		System.out.println("Duplicate Value is : " + newDup);
	}

	// Using SET
	public static void removeDuplicateUsingSet() {
		
		// Step 1: Convert the array to a Set and store the array
		// set will store and automatically remove the duplicate

		Set<Integer> uniqueSet = new HashSet<>(Arrays.asList(value));

		// Step 2: Convert back to Array
		Object[] fast = uniqueSet.toArray();

		// Print the unique list
		System.out.println(Arrays.toString(fast));

	}

}

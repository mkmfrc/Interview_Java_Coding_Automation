package JavaCodingFinal;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecondHighQWithoutSort {

	public static void main(String[] args) {

		// 1st we need to create an Array to declare the values
		Integer[] value = { 100, 300, 50, 600, 800 };
		
			// then i can create the object of TreeSet class from Java Collection
			// because of TreeSet auto organize the data.
		TreeSet<Integer> treeSet = new TreeSet<>();
		
			// now with the help of Arrays class i can call the stream() method from java 8+
			// then pass the argument as Array variable. 
			//after i can call the forEach method to loop the values
		Arrays.stream(value).forEach(treeSet::add);
		
			// with the help of TreeSet object i can call the last method
			// which is remove the highest value
		treeSet.remove(treeSet.last());
		
			// after removing the highest value i can find the second highest num.then
			// printout
		System.out.println(treeSet.last());

	}

}

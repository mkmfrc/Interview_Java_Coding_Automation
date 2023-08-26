package JavaCodingFinal;

public class DuplicateCharacterFromString {

	// How to find duplicate character from String?

	//In order to find the duplicate character we have to use the nested loop
	public static void duplicateCharacter(String value) {

		
		for (int i = 0; i < value.length(); i++) {

			for (int j = i + 1; i < value.length(); j++) {

				if (value.charAt(i) == value.charAt(j)) {
					System.out.println("Duplicate Character is: " + value.charAt(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		duplicateCharacter("MKMFAHIMUR");
	}
	
}

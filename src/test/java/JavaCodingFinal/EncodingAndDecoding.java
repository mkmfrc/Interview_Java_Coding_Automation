package JavaCodingFinal;

import java.util.Base64;

import org.testng.annotations.Test;

public class EncodingAndDecoding {

	// How to pass the credentials in website?
	// or How to pass secure information in website?
	// or How do you hide any information and pass in the framework?

	static String password = "M@hin2007";

	public static String encoding(String text) {
		byte[] encoded = Base64.getEncoder().encode(text.getBytes());
		String randomString = new String(encoded);
		System.out.println("Encoded String : " + randomString);
		return randomString;
	}

	@Test
	public static void getPasswordEncodedDecoded() {

		// Encoding
		byte[] encoded = Base64.getEncoder().encode(password.getBytes());
		String randomString = new String(encoded);
		System.out.println("Encoded String : " + randomString);

		byte[] decoded = Base64.getDecoder().decode(encoded);
		String decodedString = new String(decoded);
		System.out.println("Decoded String : " + decodedString);
	}

	public static void main(String[] args) {

		encoding(password);
	}

}

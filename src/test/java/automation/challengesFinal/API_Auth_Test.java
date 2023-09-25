package automation.challengesFinal;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
// import static org.hamcrest.Matcher.*;

public class API_Auth_Test {
	// How many way do you can pass the Authticantion?
	// There many way i can pass the Authticantion example:
	// basic Authticantion
	// bearer token
	// auth 0.2 and many more
	// In my project i am used the bearer token

	// How to pass the basic Authticantion?
	// basic Authticantion = username & password

	// How to pass bearer token?
	// it means API token

	String basicsAuth = "https://postman-echo.com/basic-auth";
	String apiToken = "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";
	String url = "https://api.github.com";

	// https://api.github.com/user/repos
	// @Test
	public void authTwoAndToken() {
		String getUrl = url + "/user/repos";
		given().auth().oauth2(apiToken).when().get(getUrl).then().log().body();
	}

	// If authicantication is failed i get the error message
	// 401 Unauthorized
	@Test
	public void basicPreemptiveAuthticantion() {
		given().auth().preemptive().basic("postman", "password").when().get(basicsAuth). //
				then().log().body();
	}

	// @Test
	public void basicChlangesAuthticantion() {
		given().auth().basic("postman", "password").when().get(basicsAuth).then().log().body();
	}
}

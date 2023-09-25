package automation.challengesFinal;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

	public class ApiClass {
		
		//Q: How to implement the RestAssured?
		
		//Ans: We don't maintain separate framework for API testing in our current automation project. 
		//but we are using the RestAssured API Testing within our existing framework as a second Layer. 

		//1st we have to add RestAssured , JSON Sample, GSON 
		//and many more dependencies in pom.xml as per requirements
		
		//Inside the ParentClass we initialize all the prerequisites
		//Inside separate API Utility class We create all the CURD operation functions
		//Then we call all the API(End Points/URL)one by one for execute the CURD operations
		
		//Also we have reusable functions to validate all the response
		//Example: Status Code, Status Line, Body, Contain Type, Response Time, Response Size and many more functions
		//In order to perform  API testing I have to validate every single point as there is no UI.
		
		
		//Q: How do you implement the CURD operations?
		
		//Ans: There are many ways in oder to to implement the CURD Operation :
		//1. JAVA coding
		//2. Cucumber BDD format 
		//In my current framework I am using the BDD format as its more easy, more clear 
		
		//Implementation:
		//1. First we have to import few static imports which are related with BDD format
		
		//domain- Company website 
		public String domain = "https://jsonplaceholder.typicode.com";
		
		//URI = specific page
		public String URI = "/posts/";
		
		//queryString = specific user/requirement "2";
		public String queryString = "2";
		
		@Test
		public void getReadTheDataFromServer() {
			
			//2. Given() method is prerequisites to pass the param() to check the Content Type  which is JSON or XML
			given().param("Content-Type", "application/json; charset=utf-8")
			 
			 //3. When() method to provide the action where I select the CURD operation method 
			 //and pass(domain+URI+queryString)as parameter
			.when().get(domain+URI+queryString)
			
			//4. Then() method is to validate all the required validation point
			//Example: Status Code, Status Line, Body, Contain Type, Response Time, Response Size and many more 
			.then()
			 .statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.time(lessThan(900l) )
			.body("body", Matchers.equalTo("est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"))
			.body("id", Matchers.equalTo(2))
			.body("userId", Matchers.equalTo(1))
			.body("title", Matchers.equalTo("qui est esse"))
			
			//5. In oder to print the value in console i have to use the .log().all() method 
			.log().all();
		}
	}

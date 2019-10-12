package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FirstClass{

	
	@Test
	public void test23()
	{
		given()
		  .when()
     	     .get("https://jsonplaceholder.typicode.com/todos/1")
		.then()
		.assertThat().statusCode(200);
		
		
		
	}


}


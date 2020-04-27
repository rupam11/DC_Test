package API_TC_1;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dc.base.DC_Base_Test;
import com.dc.data.Activity;
import com.dc.data.Task;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_03_Audit extends DC_Base_Test{
	
	public Response response;
	public RequestSpecification request;
		
	@BeforeClass
	public void setup() throws IOException {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI= baseServer+prop.getProperty("Audit");	
		request=RestAssured.given().header("user", prop.getProperty("user"));
	}
	
	@Test
	public void test_getAllAudits() {
		
		response =	request.when()
								.get("getAllAudits")
							.then()	
								//.log().all().and()
							.assertThat()									
								.statusCode(200)								
							.extract().response();
	                
		List<String> jsonResponse = response.jsonPath().getList("$");
        System.out.println("Total nuber of Audits: "+jsonResponse.size());       
	}
	
	@Test
	public void test_createAuditInfo() {
	}
	
}

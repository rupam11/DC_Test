package API_TC_1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

public class Test_01_Sectors {
	
	
	@BeforeClass
	void setup() {
		RestAssured.useRelaxedHTTPSValidation();
		
	}
	
	@Test
	public void test_getAllSector()
	{
		given().header("user", "ew0KICAidXNlckFjY291bnRTdGF0dXMiOiBudWxsLA0KICAidXNlckNyZWF0ZWRBdCI6ICIyMDIwLTA0LTA5IDAwOjMzOjQ4IiwNCiAgInVzZXJDcmVhdGVkQnkiOiAiZGNoZWxwIiwNCiAgInVzZXJFbWFpbCI6ICJza3ZhcmdoZUBpbi5pYm0uY29tIiwNCiAgInVzZXJJZCI6IDMsDQogICJ1c2VyTmFtZSI6ICJza3ZhcmdoZSIsDQogICJ1c2VyUm9sZSI6ICJFdmFsIEFkbWluIiwNCiAgInVzZXJTZXNzaW9uVG9rZW4iOiAiSW5hY3RpdmUiLA0KICAidXNlclN0YXR1cyI6ICJBY3RpdmUiLA0KICAidXNlclR5cGUiOiAiSUJNIiwNCiAgInVzZXJVcGRhdGVkQXQiOiAiMjAyMC0wNC0xMyAwNjoxODowOCIsDQogICJ1c2VyVXBkYXRlZEJ5IjogInNrdmFyZ2hlIg0KfQ0K")
		.when()
			.get("https://9.51.193.190:9080/sector-service/getAllSectors")
			//.get("http://9.51.193.190:10016/getAllSectors") //URL shared by Vibhor
		.then()
			.assertThat()
			.statusCode(200)
			.and()
			.body("sectorId", hasSize(8))
			.and()
			.body("sectorName",hasItems("Communication","Distribution","Diversified","Financial Services","Industrial","Public","All"))
			.log().all();		
	}
	
	@Test
	public void test_getAllActivities() {
//		given().header("user", "ew0KICAidXNlckFjY291bnRTdGF0dXMiOiBudWxsLA0KICAidXNlckNyZWF0ZWRBdCI6ICIyMDIwLTA0LTA5IDAwOjMzOjQ4IiwNCiAgInVzZXJDcmVhdGVkQnkiOiAiZGNoZWxwIiwNCiAgInVzZXJFbWFpbCI6ICJza3ZhcmdoZUBpbi5pYm0uY29tIiwNCiAgInVzZXJJZCI6IDMsDQogICJ1c2VyTmFtZSI6ICJza3ZhcmdoZSIsDQogICJ1c2VyUm9sZSI6ICJFdmFsIEFkbWluIiwNCiAgInVzZXJTZXNzaW9uVG9rZW4iOiAiSW5hY3RpdmUiLA0KICAidXNlclN0YXR1cyI6ICJBY3RpdmUiLA0KICAidXNlclR5cGUiOiAiSUJNIiwNCiAgInVzZXJVcGRhdGVkQXQiOiAiMjAyMC0wNC0xMyAwNjoxODowOCIsDQogICJ1c2VyVXBkYXRlZEJ5IjogInNrdmFyZ2hlIg0KfQ0K")
//		.when()
//			.get("http://9.51.192.136:10001/getAllActivities")			
//		.then()
//			.assertThat()
//			.statusCode(200);
//			//.log().all();
		
		RestAssured.baseURI = "http://9.51.192.136:10001";
        Response response = null;
 
        try {
            response = RestAssured.given().header("user", "ew0KICAidXNlckFjY291bnRTdGF0dXMiOiBudWxsLA0KICAidXNlckNyZWF0ZWRBdCI6ICIyMDIwLTA0LTA5IDAwOjMzOjQ4IiwNCiAgInVzZXJDcmVhdGVkQnkiOiAiZGNoZWxwIiwNCiAgInVzZXJFbWFpbCI6ICJza3ZhcmdoZUBpbi5pYm0uY29tIiwNCiAgInVzZXJJZCI6IDMsDQogICJ1c2VyTmFtZSI6ICJza3ZhcmdoZSIsDQogICJ1c2VyUm9sZSI6ICJFdmFsIEFkbWluIiwNCiAgInVzZXJTZXNzaW9uVG9rZW4iOiAiSW5hY3RpdmUiLA0KICAidXNlclN0YXR1cyI6ICJBY3RpdmUiLA0KICAidXNlclR5cGUiOiAiSUJNIiwNCiAgInVzZXJVcGRhdGVkQXQiOiAiMjAyMC0wNC0xMyAwNjoxODowOCIsDQogICJ1c2VyVXBkYXRlZEJ5IjogInNrdmFyZ2hlIg0KfQ0K")
                .when()
                .get("/getAllActivities");
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        System.out.println("Response :" + response.asString());
        System.out.println("Status Code :" + response.getStatusCode());
	}
	
	//@Test
	public void test_getActivityCount() {
		
	}
	
	//@Test
	public void test_getAactivityBySearchCriteria() {
		
	}
	
	//@Test
	public void test_createActivity() {
		
	}
	
	//@Test
	public void test_updateActivity() {
		
	}
	
	//@Test
	public void test_deleteActivity() {
		
	}
}

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
import com.dc.data.payload;

import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.hasSize;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public class Test_02_Activity2_Put extends DC_Base_Test{
	
	public Response response;
	public RequestSpecification request;
		
	@BeforeClass
	public void setup() throws IOException {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI= baseServer+prop.getProperty("Activity");	
		request=RestAssured.given().header("user", prop.getProperty("user"));
	}
	
	@Test
	public void post_createActivity() {
	
		Response response=request.contentType("application/json")
								.body(payload.Activity())
							.when()
								.post("/createActivity")
							.then()
								.assertThat()
									.log().all()
									.statusCode(200)
									.extract().response();
		
		JsonPath Act_jp=new JsonPath(response.asString());
		System.out.println();
		
		int actCount=Integer.parseInt(request.when().get("getActivityCount").asString());
		
		Assert.assertEquals(Act_jp.getInt("activityId"), actCount,"ActivityId didnt get generated properly");
		Assert.assertEquals(Act_jp.getString("activityCode"), "ACT_"+actCount,"ActivityCode didnt get generated properly");
		Assert.assertEquals(Act_jp.getString("activityName"), "");
		Assert.assertEquals(Act_jp.getString("activityState"), "Not Started");
		Assert.assertEquals(Act_jp.getString("activityCreatedBy"), "skvarghe");
		Assert.assertEquals(Act_jp.getString("activityState"), "Not Started");
		Assert.assertEquals(Act_jp.getString("activityCreatedBy"), "skvarghe");
		//Assert.assertEquals(Act_jp.getString("activityCreatedBy"), "");
		Assert.assertEquals(Act_jp.getString("activityUpdatedBy"), "NA");
		Assert.assertEquals(Act_jp.getString("activityUpdateAt"), "0000-00-00 00:00:00'");
		Assert.assertEquals(Act_jp.getString("activityCreatedBy"), "skvarghe");
		
		
		System.out.println("ActivityCode === "+Act_jp.getString("activityCode"));
		
	}
	
	//@Test
	public void post_updateActivity() {
		Response response=request.queryParam("activityId", 41)
						.contentType("application/json")
				.body("{\r\n" + 
						"    \"activityId\": 41,\r\n" + 
						"    \"activityCode\": \"ACT_41\",\r\n" + 
						"    \"activityName\": \"Act_41_Name_Act_41_Name\",\r\n" + 
						"    \"activityStatus\": \"\",\r\n" + 
						"    \"activityPercentCompletion\": \"0\",\r\n" + 
						"    \"activityState\": \"Not Started\",\r\n" + 
						"    \"activityCreatedBy\": \"skvarghe\",\r\n" + 
						"    \"activityCreatedAt\": \"2020-04-25 04:19:18\",\r\n" + 
						"    \"activityUpdatedBy\": \"NA\",\r\n" + 
						"    \"activityUpdatedAt\": \"0000-00-00 00:00:00\",\r\n" + 
						"    \"activityTasks\": [\r\n" + 
						"        {\r\n" + 
						"            \"taskId\": 19,\r\n" + 
						"            \"taskCode\": \"\",\r\n" + 
						"            \"taskDescription\": \"Task_19_Name_Task_19_name\",\r\n" + 
						"            \"taskStatus\": \"\",\r\n" + 
						"            \"taskComments\": \"\",\r\n" + 
						"            \"taskApplicable\": \"\",\r\n" + 
						"            \"percentCompletion\": \"0\",\r\n" + 
						"            \"taskState\": \"Not Started\",\r\n" + 
						"            \"taskCreatedBy\": \"skvarghe\",\r\n" + 
						"            \"taskCreatedAt\": \"2020-04-25 04:19:18\",\r\n" + 
						"            \"taskUpdatedBy\": \"0000-00-00 00:00:00\",\r\n" + 
						"            \"taskUpdatedAt\": \"NA\",\r\n" + 
						"            \"taskProcessName\": \"\",\r\n" + 
						"            \"taskSquadName\": \"\",\r\n" + 
						"            \"taskSquadType\": \"\"\r\n" + 
						"        }\r\n" + 
						"    ]\r\n" + 
						"}")
			.when()
				.put("/updateActivity")
			.then()
				.assertThat()
					.log().all()
					.statusCode(200)
					.extract().response();
	}
	
	//@Test
	public void test_deleteActivity() {
		
		
	}
}

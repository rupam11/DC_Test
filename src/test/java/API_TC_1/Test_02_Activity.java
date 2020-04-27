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
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.hasSize;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_02_Activity extends DC_Base_Test{
	
	public Response response;
	public RequestSpecification request;
		
	@BeforeClass
	public void setup() throws IOException {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI= baseServer+prop.getProperty("Activity");	
		request=RestAssured.given().header("user", prop.getProperty("user"));
	}
	
	//@Test
	public void test_getAllActivities() {
		
		response =	request.when()
								.get("getAllActivities")
							.then()	
								//.log().all().and()
							.assertThat()									
								.statusCode(200)
								.body("activityId", hasSize(36))
							.extract().response();
	                
		List<String> jsonResponse = response.jsonPath().getList("$");
        System.out.println("Total nuber of Activities: "+jsonResponse.size());
       
//        String activityNames = response.jsonPath().getString("activityName");
//        System.out.println("List of all ActivityNames :: "+activityNames);
		
        List<String> jsonResponse1 = response.jsonPath().getList("activityName");
        System.out.println("List of all ActivityNames using List :: "+jsonResponse1);

	}
	
	//@Test
	public void test_getActivityCount() {
	
		response =	request.when()
							.get("getActivityCount")
						.then()	
							//.log().all().and()
						.assertThat()									
							.statusCode(200)
							.extract().response();
		
		Assert.assertEquals(Integer.parseInt(response.asString()), 36, "Activities Count didnt matched");
	}
	
	@Test
	public void test_getActivityBySearchCriteria() {
		//Search by ActivityId
		response =	request.queryParams("activityId",36)
						.when()
		                	.get("getActivityBySearchCriteria")
		                .then()	
		                	.contentType("application/json")
		                .assertThat()
		                .log().all()
		                	.body("activityId", hasSize(1))
		                	//.body("activityId", equalTo(36))
		                	//.body("activityCode", equalTo("ACT_36"))
		    				.statusCode(200)
		    				
		     		     .extract().response();
		
		String actActName = response.jsonPath().getString("activityName");
        System.out.println("ActivityName, search By ActivityId = 1 :: "+actActName);
        Assert.assertEquals(response.jsonPath().getInt(response.asString()), 1);
	/*
        //Search by ActivityCode
		response =	request.param("activityCode","ACT_1")
							.when()
								.get("getActivityBySearchCriteria")
							.then()	
								.contentType("application/json")
							.assertThat()
								.statusCode(200)
								.and()
								.body("activityName",equalTo(actActName))
						.extract().response();
		
		/*
		//Search by ActivityStatus
		response =	request.param("activityStatus","Active")
								.when()
										.get("getAactivityBySearchCriteria")
								.then()	
										.contentType("application/json")
								.assertThat()
										.statusCode(200)										
								.extract().response();
		List<String> actActiveActNameList = response.jsonPath().getList("activityName");
        System.out.println("Actuve ActivityName List :: "+actActiveActNameList);
		
		
		//Search by ActivityType
				response =	request.header("user", prop.getProperty("user"))
													.param("activityType","TBD")
										.when()
												.get("getAactivityBySearchCriteria")
										.then()	
												.contentType("application/json")
										.assertThat()
												.statusCode(200)
												.body("activityName",equalTo("Application Remediation Activities For WAS"))
										.extract().response();			
	*/}
	
	//@Test
	public void test_createActivity() {
		/*
		 Task task=new Task("0", "Yes", "",
		 
				"", "2020-04-22 00:00:00", "0000-00-00 00:00:00",
				"", "dchelp", "App Recompilation - I -If KP team is responsible to recompile; need to gather the artifacts from KP team.",
				1, "", "Cloud Migration Factory and App Team",
				"JOINT", "Not Started", "Active");
				
		List<Task> taskList=new ArrayList<Task>();
		
		taskList.add(task);
		
		Activity activity=new Activity("","2020-04-22 00:00:00","dchelp",999,
				"t_TestActivityName","0","Not Started", "Active",
				taskList,"0000-00-00 00:00:00","");
	*/	
		List<Map<String,Object>> taskList=new ArrayList<>();
		
		Map<String,Object> task_1=new HashMap<>();
		task_1.put("taskUpdatedBy", "");
		task_1.put("taskStatus", "Active");
		task_1.put("taskSquadName", "Cloud Migration Factory and App Team");
		task_1.put("taskApplicable", "Yes");
		task_1.put("taskCreatedBy", "dchelp");
		task_1.put("taskProcessName", "");
		task_1.put("taskComments", "");
		task_1.put("taskCreatedAt","2020-04-22 00:00:00");
		task_1.put("taskDescription","Task_App Recompilation - I -If KP team is responsible to recompile; need to gather the artifacts from KP team.");
		task_1.put("taskCode", "");
		task_1.put("percentCompletion", "0");
		task_1.put("taskUpdatedAt","0000-00-00 00:00:00");
		task_1.put("taskState", "Not Started");
		task_1.put("taskSquadType", "JOINT");
		task_1.put("taskId", 1);
		
		taskList.add(task_1);
		
		Map<String,Object> activity=new HashMap<>();
		activity.put("activityId", 999);
		activity.put("activityCode", "");
		activity.put("activityCreatedAt", "2020-04-22 00:00:00");
		activity.put("activityUpdatedBy", "");
		activity.put("activityTasks", taskList);
		activity.put("activityState", "Not Started");
		activity.put("activityName", "TestActivityName");
		activity.put("activityStatus", "Active");
		activity.put("activityUpdatedAt","0000-00-00 00:00:00");
		activity.put("activityPercentCompletion", "0");
		activity.put("activityCreatedBy", "dchelp");
		
		Response response=request.contentType("application/json")
								.body(activity)
							.when()
								.post("/createActivity")
							.then()
								.assertThat()
									.log().all()
									.statusCode(200)
									.extract().response();
		
		String actCode=response.jsonPath().getString("activityCode");
		int expCode=Integer.parseInt(
								given().contentType("application/json")
										.header("user", prop.getProperty("user"))
								.when()
									.get("/getActivityCount").asString());
		Assert.assertEquals(actCode, "ACT_"+expCode,"Data didn't matched");		
	}
	
	//@Test
	public void test_updateActivity() {
		
	}
	
	//@Test
	public void test_deleteActivity() {
		
		
	}
}

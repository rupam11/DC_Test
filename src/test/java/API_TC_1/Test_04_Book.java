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

public class Test_04_Book extends DC_Base_Test{
	
	public Response response;
	public RequestSpecification request;
		
	@BeforeClass
	public void setup() throws IOException {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI= baseServer+prop.getProperty("Audit");	
		request=RestAssured.given().header("user", prop.getProperty("user"));
	}
	
	@Test
	public void test_addCategoryToTemplatesToBook() {
	       
	}
	
	@Test
	public void test_addFieldToTemplatesToBook() {		
     
	}
	
	@Test
	public void test_addTemplateToBook() {
	       
	}
	
	@Test
	public void test_addUsersToBook() {
	       
	}
	
	@Test
	public void test_changeCategorySequence() {
	       
	}
	
	@Test
	public void test_changeFieldSequence() {
	       
	}
	
	@Test
	public void test_changeTemplateSequence() {
	       
	}
	
	@Test
	public void test_cloneBook() {
	       
	}
	
	@Test
	public void test_cloneBookList() {
	       
	}
	
	@Test
	public void test_configureBook() {
	       
	}
	
	@Test
	public void test_copyCategoryToTemplateToBook() {
	       
	}
	
	@Test
	public void test_copyFieldsToTemplateToBook() {
	       
	}
	
	@Test
	public void test_copyRulesToBooks() {
	       
	}
	
	@Test
	public void test_copyTemplateToBook() {
	       
	}
	
	@Test
	public void test_createBook() {
	       
	}
	
	@Test
	public void test_createDummyBook() {
	       
	}
	
	@Test
	public void test_createDummyField() {
	       
	}
	
	
	@Test
	public void test_createProjectBook() {
	       
	}
	@Test
	public void test_deleteBook() {
	       
	}
	
	@Test
	public void test_deleteCategoryFromTemplatesToBook() {
	       
	}
	
	@Test
	public void test_deleteFieldFromTemplatesToBook() {
	       
	}
	
	@Test
	public void test_deleteTemplateFromBook() {
	       
	}
	
	@Test
	public void test_getAllBooks() {
	       
	}
	
	
	@Test
	public void test_getAllBooksOfProject() {
	       
	}
	@Test
	public void test_getBookById() {
	       
	}
	
	
	@Test
	public void test_getBookBySearchCriteria() {
	       
	}
	
	@Test
	public void test_getBookCount() {
	       
	}
	
	@Test
	public void test_manageCategoriesToTemplateToBook() {
	       
	}
	
	@Test
	public void test_manageFieldsToTemplateToBook() {
	       
	}
	
	@Test
	public void test_manageTemplates() {
	       
	}
	
	@Test
	public void test_registerBook() {
	       
	}
	
	@Test
	public void test_updateBook() {
	       
	}
	
	@Test
	public void test_updateCategoryToTemplatesToBook() {
	       
	}
	
	@Test
	public void test_updateFieldToTemplatesToBook() {
	       
	}
	
	@Test
	public void test_updateTemplateToBook() {
	       
	}	

}

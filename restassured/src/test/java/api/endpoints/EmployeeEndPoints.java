package api.endpoints;

import api.payload.Employee;
import api.routes.RoutesCRM;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class EmployeeEndPoints {

		public static Response createEmployee(Employee employee)
		{
			Response response = given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.body(employee)
					.post(RoutesCRM.post_createemployee_url);
		   return response;
		}
		
		public static Response getAllEmployee() {
			
			Response response = given()
					.contentType(ContentType.JSON)
					.get(RoutesCRM.get_allemployee_url);
			return response;
		}
		
		public static Response getEmployeeById(String ID) {
			
			Response response = given()
					.pathParam("id", ID)
					.when()
					.get(RoutesCRM.get_employee_by_id_url);
			return response;
		}
		
		public static Response updateEmployeeById(String ID, Employee employee) {
			
			Response response = given()
					.contentType(ContentType.JSON)
					.accept(ContentType.JSON)
					.pathParam("id",ID).body(employee)
					.when()
					.put(RoutesCRM.update_employee__url);
			
			return response;
		}
		
		public static Response deleteEmployeeById(int id) {
			
			Response response = given()
					.contentType(ContentType.JSON)
					.pathParam("id", id)
					.when()
					.delete(RoutesCRM.delete_employee_url);
			
			return response;
		}
	}

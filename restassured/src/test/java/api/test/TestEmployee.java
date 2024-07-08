package api.test;

import org.bson.types.ObjectId;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import api.endpoints.EmployeeEndPoints;
import api.payload.Employee;
import io.restassured.response.Response;

public class TestEmployee {

	// this class is to genrate Fake Employee DaTA

	Faker faker;
	Employee employee;

	@BeforeClass(enabled = false)
	public void setupdata() {
		faker = new Faker();

		employee = new Employee();
		employee.setId(new ObjectId().toString()); // Generate a valid ObjectId
		employee.setFirst_name(faker.name().firstName());
		employee.setLast_name(faker.name().lastName());
		employee.setEmail(faker.internet().safeEmailAddress());
		employee.setPassword(faker.internet().password());
		employee.setPhone(faker.phoneNumber().cellPhone());
		employee.setDepartment(faker.company().industry());
		employee.setPosition(faker.job().title());
		employee.setEmployee_image(faker.internet().avatar());
		employee.setCreated_at(faker.date().past(365, java.util.concurrent.TimeUnit.DAYS).toString());
		employee.setUpdated_at(faker.date().past(30, java.util.concurrent.TimeUnit.DAYS).toString());

	}

	@Test(priority = 1,enabled = false)
	public void testCreateEmployee() {
		Response response = EmployeeEndPoints.createEmployee(employee);

		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 201);

		System.out.println(response.getStatusCode()+"helooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

	}

	@Test(priority = 2, enabled = false)
	public void testGetAllemployees() {

		Response response = EmployeeEndPoints.getAllEmployee();

		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority = 3)
	public void testGetEmployeeById() {

		String hardcodedEmployeeID = "666975e82f4b83f3474665ac";

		Response response = EmployeeEndPoints.getEmployeeById(hardcodedEmployeeID);

		response.then().log().all();

		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 4)
	public void testUpdateEmployeeById() {
		String hardcodedEmployeeID ="666975e82f4b83f3474665ac";
		Employee employee1 = new Employee();
		faker = new Faker();
		
		employee1.setFirst_name("ravikm");
		employee1.setLast_name("thata");
//		employee.setEmail(faker.internet().safeEmailAddress());
//		employee.setPhone(faker.phoneNumber().cellPhone());
//		employee.setDepartment(faker.company().industry());
//		employee.setPosition(faker.job().title());
//		employee.setEmployee_image(faker.internet().avatar());
//		
		
		Response response = EmployeeEndPoints.updateEmployeeById(hardcodedEmployeeID, employee1);
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}

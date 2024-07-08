package api.routes;

public class RoutesCRM {

	// here we will maintain only the routes , we will not implement anything here.
	// create the base url of the api.
	public static String base_url = "http://localhost:3001";
	// create the urls for employee, customer and issues.

	// Employee module
	// create a new/register employee
	public static String post_createemployee_url = base_url + "/register";
	// route to login
	public static String post_login_url = base_url + "/login";
	// route to fetch all the employees.
	public static String get_allemployee_url = base_url + "/api/employees";
	// route to fetch one employee using id.
	public static String get_employee_by_id_url = base_url + "/employee/{id}";
	// route to delete the employee using id.
	public static String delete_employee_url = base_url + "/deleteemployee/{id}";
	// route to update the employee using id.
	public static String update_employee__url = base_url + "/updateemployee/{id}";

	// Customer module
	// create a new customer
	public static String post_createcustomer_url = base_url + "/addcustomer";
	// route to fetch all the employees.
	public static String get_allcustomer_url = base_url + "/customers";
	// route to fetch one employee using id.
	public static String get_customer_by_id_url = base_url + "/customer/{id}";
	// route to delete the employee using id.
	public static String delete_customer_url = base_url + "/deletecustomer/{id}";
	// route to update the employee using id.
	public static String update_customer_url = base_url + "/updatecustomer/{id}";

	// Issues module
	// create a new issue
	public static String post_createissue_url = base_url + "/createIssue";
	// route to fetch all the employees.
	public static String get_allissues_url = base_url + "/issues";
	// route to fetch one employee using id.
	public static String get_issue_by_id_url = base_url + "/issue/{id}";
	// route to delete the employee using id.
	public static String delete_issue_url = base_url + "/deleteissue/{id}";
	// route to update the employee using id.
	public static String update_issue_url = base_url + "/updateissue/{id}";
}

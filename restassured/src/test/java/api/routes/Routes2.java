package api.routes;

public class Routes2 {

	public static String baseURL = "http://localhost:3001";

	public static String post_createuser_URL = baseURL + "/addUser";
	public static String put_update_URL = baseURL + "/updateUser/{id}";
	public static String getUsers_URL = baseURL + "/getUsers";
	public static String getUser_URL = baseURL + "/getUser/{id}";	
	public static String deleteUser_URL = baseURL + "/deleteUser/{id}";
	
	
	
	public static String post_AddEvent_URL = baseURL + "/addEvent";	
	public static String put_UpdateEvent_URL = baseURL + "/updateEvent/{id}";	
	public static String get_getEvent_URL = baseURL + "/getEvents";
	public static String get_getEventById_URL = baseURL + "/event/{id}";	
	public static String deleteEvent_URL = baseURL + "/deleteEvent/{id}";
	
	
	public static String post_addArtist_URL = baseURL + "/addArtist";	
	public static String put_updateArtist_URL = baseURL + "/updateArtist/{id}";	
	public static String getArtists_URL = baseURL + "/getArtists";	
	public static String getartist_URL = baseURL + "/artist/{id}";	
	public static String deleteArtist_URL = baseURL + "/deleteArtist/{id}";
	
	
	
	public static String post_bookEvent_URL = baseURL + "/bookEvent/{eventId}";	
	public static String getBookedEvents_URL = baseURL + "/getBookedEvents";	
	public static String getUpcomingEvents_URL = baseURL + "/getUpcomingEvents";	
	public static String getCancelledEvents_URL = baseURL + "/getCancelledEvents";	
	public static String cancelBooking_URL = baseURL + "/cancelBooking/{bookingId}";
	
	
	public static String post_register_URL = baseURL + "/register";	
	public static String Post_login_URL = baseURL + "/login";	
	public static String put_resetPassword_URL = baseURL + "/resetPassword";
}
	
	

import java.util.ArrayList;

public class User {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public static int getUserCounter() {
		return userCounter;
	}

	public static void setUserCounter(int userCounter) {
		User.userCounter = userCounter;
	}

	public String getSexualOrientation() {
		return sexualOrientation;
	}

	public void setSexualOrientation(String sexualOrientation) {
		this.sexualOrientation = sexualOrientation;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public ArrayList<String> getUsersphotos() {
		return usersphotos;
	}

	public void setUsersphotos(ArrayList<String> usersphotos) {
		this.usersphotos = usersphotos;
	}
	private String email;
	private int age;
	private String mobile;
	private int userID;
	private static int userCounter=0;
	private String sexualOrientation; 
	private String currentLocation;//example "52.301293 0.185935"
	ArrayList<String> usersphotos = new ArrayList<String>();
	
	
	public User(String uName, String uEmail, int uAge, String uMobile, int uID, String uSexOrient) {
		name = uName;
		email = uEmail;
		age = uAge;
		mobile = uMobile;
		userID = uID;
		sexualOrientation = uSexOrient;
		
	}
	
	public User() {
		User.userCounter += 1; 
		this.userID = userCounter;
		
	}

	public void selectCalendar(){}
	public void returnCal(){}
	public void calendarExists(){}
	public void save(){}
	public void selectChatroom(){}
	public void selectMatch(){}
	public void selectContinueMatch(){}
	public void selectMap(){}
	
}

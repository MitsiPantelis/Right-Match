import java.util.ArrayList;

public class ProfileSettings {

	private String userInformation;
	private String usersDistancePreference;
	ArrayList<String> legalInformation = new ArrayList<String>();//allagh sto diagram

	public void addPhoto(){}
	public void choose(){}//allagh, einai me capital
	public void save(){}
	public void display(){}
	public void redirect(){}
	public String getUserInformation() {
		return userInformation;
	}
	public void setUserInformation(String userInformation) {
		this.userInformation = userInformation;
	}
	public String getUsersDistancePreference() {
		return usersDistancePreference;
	}
	public void setUsersDistancePreference(String usersDistancePreference) {
		this.usersDistancePreference = usersDistancePreference;
	}

}

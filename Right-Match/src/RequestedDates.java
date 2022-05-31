import java.util.ArrayList;

public class RequestedDates {
	//extend
	private String timeStampOfReq;
	//private approvedFlag; //typos?
	private String registratedUsers;//list?
	private int reqID;
	private int userID;
	
	public String getRegistratedUsers() {
		return registratedUsers;
	}
	public void setRegistratedUsers(String registratedUsers) {
		this.registratedUsers = registratedUsers;
	}
	public int getReqID() {
		return reqID;
	}
	public void setReqID(int reqID) {
		this.reqID = reqID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}

}
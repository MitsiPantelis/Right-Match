import java.util.ArrayList;

public class Messages {

	private int chatHistoryID;
	private String thread;
	private String msgTimestamp;
	private int senderID;
	ArrayList<String> words = new ArrayList<String>();

	public void getHistoryID(){}
	public void display(){}
	public void sendMsg(){}
	public void rejectMsg(){}
	public int getChatHistoryID() {
		return chatHistoryID;
	}
	public void setChatHistoryID(int chatHistoryID) {
		this.chatHistoryID = chatHistoryID;
	}
	public String getThread() {
		return thread;
	}
	public void setThread(String thread) {
		this.thread = thread;
	}
	public String getMsgTimestamp() {
		return msgTimestamp;
	}
	public void setMsgTimestamp(String msgTimestamp) {
		this.msgTimestamp = msgTimestamp;
	}
	public int getSenderID() {
		return senderID;
	}
	public void setSenderID(int senderID) {
		this.senderID = senderID;
	}

}
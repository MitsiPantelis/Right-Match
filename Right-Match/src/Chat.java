import java.util.ArrayList;

public class Chat {

	private int chat_id;
	private int chat_user_id;
	private int chat_match_id;
	private String chat_timestamp;

	public void getChatList(){}
	public void returnChatID(){}
	public void isMatch(){}
	public void tryAgain(){}
	public int retMatchID(){
		
		return chat_match_id;
	}
	public void display(){}
	public void backToChat(){}
	public int getChat_id() {
		return chat_id;
	}
	public void setChat_id(int chat_id) {
		this.chat_id = chat_id;
	}
	public int getChat_user_id() {
		return chat_user_id;
	}
	public void setChat_user_id(int chat_user_id) {
		this.chat_user_id = chat_user_id;
	}
	public int getChat_match_id() {
		return chat_match_id;
	}
	public void setChat_match_id(int chat_match_id) {
		this.chat_match_id = chat_match_id;
	}
	public String getChat_timestamp() {
		return chat_timestamp;
	}
	public void setChat_timestamp(String chat_timestamp) {
		this.chat_timestamp = chat_timestamp;
	}

}

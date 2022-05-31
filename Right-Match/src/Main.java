import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		
		SexualOrientation sexOrient = new SexualOrientation();
		
		ArrayList<String> sexOrientList = new ArrayList<String>();
		sexOrientList = sexOrient.showSexualOrientationOptions();
		
		/*
		for (String i : sexOrientList) { 		      
	           System.out.println(i); 		
	      }
		*/
		//User user1 = new User ("Makis","makis@gmail.com",25,"6985775343",1,"Gay");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi ");
		System.out.println("Welcome to Right Match! ");
		User user1 = new User();
		System.out.println("Give me Name:");
		user1.setName(input.nextLine());
		//System.out.println("User1 is: %s  ", user1.getName());
		System.out.println(String.format("User1 is: %s and his User ID is:%d  ", user1.getName(),user1.getUserID() ) );
		//System.out.println("User Id is: %d" , user1.getID());
		
	}

}


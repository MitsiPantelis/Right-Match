import java.util.ArrayList;

public class SexualOrientation {
	 private ArrayList<String> sexualOrientationOptions = new ArrayList<String>();
	 
	 public SexualOrientation()	 {
		 sexualOrientationOptions.add("Straight");
		 sexualOrientationOptions.add("Gay");
		 sexualOrientationOptions.add("Bisexual");
		 sexualOrientationOptions.add("Queer");
		 sexualOrientationOptions.add("Asexual");
		 sexualOrientationOptions.add("Other");
		 
 }
	 
	//public showSexualOrientationOptions(){}
	public ArrayList<String> showSexualOrientationOptions() {
		
		return(sexualOrientationOptions);
	}
	
	
}

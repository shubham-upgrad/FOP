import java.util.Comparator;
public class EndTimeActivityComparator implements Comparator<Activity>{
	
	public int compare(Activity a1, Activity a2){
		return (a1.getEndTime()-a2.getEndTime());
	}

}
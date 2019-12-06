import java.util.Comparator;
public class StartTimeActivityComparator implements Comparator<Activity>{
	
	public int compare(Activity a1, Activity a2){
		return (a1.getStartTime() - a2.getStartTime());

	}

}
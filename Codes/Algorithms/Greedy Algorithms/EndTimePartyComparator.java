import java.util.Comparator;
public class EndTimePartyComparator implements Comparator<Party>{
	
	public int compare(Party p1, Party p2){
		//  Using a getter is necessary here because compare method is not in the class as the
		// variales we are trying to compare(i.e, our Party class)
		// Hence, this comparator cannot access private members directly
		return (p1.getEndTime() - p2.getEndTime()==0)?1:-1;

	}

}
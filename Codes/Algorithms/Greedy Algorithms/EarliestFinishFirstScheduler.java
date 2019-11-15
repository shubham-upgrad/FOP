import java.util.Arrays;
import java.util.Comparator;
public class EarliestFinishFirstScheduler{
	public static void main(String[] args) {
		// Get meetings 
		Party party1 = new Party("A",5, 9);
        Party party2 = new Party("B",8, 9);
        Party party3 = new Party("C",5, 7);
        Party party4 = new Party("D",0, 6);
        Party party5 = new Party("E",3, 4);
        Party party6 = new Party("F",1, 2);		
		Party[] parties ={party1,party2,party3,party4,party5,party6};
		
		System.out.println("Before Sorting");
		for(Party m:parties){
			System.out.println(m);
		}
		Comparator<Party> custom_comparator = new StartTimePartyComparator();
		// Sort the meetings based on their finish times
		Arrays.sort(parties,custom_comparator); // Arrays.sort uses combination of Quick and Merge..O(nlog n)
		// Arrays.sort uses compareTo method of Comparable to compare two objects
		// So it is not the scheduler that is sorting the array with respect to finish times
		// It is the meeting object itself telling sort() method who is greater than whom		
		System.out.println("After Sorting");
		for(Party m:parties){
			System.out.println(m);
		}
		custom_comparator = new EndTimePartyComparator();
		// Sort the meetings based on their finish times
		Arrays.sort(parties,custom_comparator); // Arrays.sort uses combination of Quick and Merge..O(nlog n)
		// Arrays.sort uses compareTo method of Comparable to compare two objects
		// So it is not the scheduler that is sorting the array with respect to finish times
		// It is the meeting object itself telling sort() method who is greater than whom		
		System.out.println("After Sorting");
		for(Party m:parties){
			System.out.println(m);
		}
		/***
		System.out.println("Schedular scheduling the parties :::");
		System.out.println(parties[0]); // Select the first schedule greedily
		int numJobsScheduled = 1;

        // Greedily choose the schedules with the earliest ending times
        // Big-O: O(N)
        int lastSelectedIndex = 0;
        for(int i = 1; i < parties.length; i++) {
            // If the current schedule's start time is later than the
            // the last schedule's ending time, we can add this schedule 
            if (parties[i].getStartTime() >= parties[lastSelectedIndex].getEndTime()) {
                System.out.println(parties[i]);
                lastSelectedIndex = i; // index of the last schedule that we chose
                numJobsScheduled++;
            }
        }
        System.out.println("Jobs scheduled ::: "+numJobsScheduled);
		***/
	}
}

import java.util.Arrays;
public class EarliestFinishFirstScheduler{
	public static void main(String[] args) {
		// Get meetings 
		Meeting meeting1 = new Meeting("A","A1",5, 9);
        Meeting meeting2 = new Meeting("B","A2",8, 9);
        Meeting meeting3 = new Meeting("C","A3",5, 7);
        Meeting meeting4 = new Meeting("D","A4",0, 6);
        Meeting meeting5 = new Meeting("E","A5",3, 4);
        Meeting meeting6 = new Meeting("F","A6",1, 2);		
		Meeting[] meetings ={meeting1,meeting2,meeting3,meeting4,meeting5,meeting6};
		
		System.out.println("Before Sorting");
		for(Meeting m:meetings){
			System.out.println(m);
		}
		// Sort the meetings based on their finish times
		Arrays.sort(meetings); // Arrays.sort uses combination of Quick and Merge..O(nlog n)
		// Arrays.sort uses compareTo method of Comparable to compare two objects
		// So it is not the scheduler that is sorting the array with respect to finish times
		// It is the meeting object itself telling sort() method who is greater than whom		
		System.out.println("After Sorting");
		for(Meeting m:meetings){
			System.out.println(m);
		}
		System.out.println("Schedular scheduling the meetings :::");
		System.out.println(meetings[0]); // Select the first schedule greedily
		int numJobsScheduled = 1;

        // Greedily choose the schedules with the earliest ending times
        // Big-O: O(N)
        int lastSelectedIndex = 0;
        for(int i = 1; i < meetings.length; i++) {
            // If the current schedule's start time is later than the
            // the last schedule's ending time, we can add this schedule 
            if (meetings[i].getStartTime() >= meetings[lastSelectedIndex].getEndTime()) {
                System.out.println(meetings[i]);
                lastSelectedIndex = i; // index of the last schedule that we chose
                numJobsScheduled++;
            }
        }
        System.out.println("Jobs scheduled ::: "+numJobsScheduled);

	}
}

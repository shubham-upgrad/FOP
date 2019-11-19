import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
public class Schedulers{
	public static void earliestFinishFirst(Activity[] activities) {
		// Get meetings 
		
		System.out.println("Activities in Queue:::");
		for(Activity m:activities){
			System.out.println(m);
		}
		
		// Sort the meetings based on their finish times
		// Arrays.sort uses compareTo method of Comparable to compare two objects
		// So it is not the scheduler that is sorting the array with respect to finish times
		// It is the meeting object itself telling sort() method who is greater than whom		
		Comparator<Activity> custom_comparator = new EndTimeActivityComparator();
		// Sort the meetings based on their finish times
		Arrays.sort(activities,custom_comparator); // Arrays.sort uses combination of Quick and Merge..O(nlog n)
		// Arrays.sort uses compareTo method of Comparable to compare two objects
		// So it is not the scheduler that is sorting the array with respect to finish times
		// It is the meeting object itself telling sort() method who is greater than whom		
		
		System.out.println("Scheduler scheduling the activities :::");
		System.out.println(activities[0]); // Select the first schedule greedily
		int numJobsScheduled = 1;

        // Greedily choose the schedules with the earliest ending times
        // Big-O: O(N)
        int lastSelectedIndex = 0;
        for(int i = 1; i < activities.length; i++) {
            // If the current schedule's start time is later than the
            // the last schedule's ending time, we can add this schedule 
            if (activities[i].getStartTime() >= activities[lastSelectedIndex].getEndTime()) {
                System.out.println(activities[i]);
                lastSelectedIndex = i; // index of the last schedule that we chose
                numJobsScheduled++;
            }
        }
        System.out.println("Jobs scheduled ::: "+numJobsScheduled);
		
	}
	public static int depthProblemScheduler(Activity[] activities){
		Comparator<Activity> start_time_comparator = new StartTimeActivityComparator();
		Arrays.sort(activities,start_time_comparator);

		// An ArrayList of Integers denoting machines
		ArrayList<Integer> machines = new ArrayList<Integer>();
		for(int i=0;i<activities.length;i++){
			boolean scheduledThisActivity = false;
			for(int j=0;j<machines.size();j++){
				if(activities[i].getStartTime()>=machines.get(j)){
					//Schedule activity i on machine j
					machines.set(j,activities[i].getEndTime()); // Set endTime of activity i on machine j
					scheduledThisActivity=true;
					System.out.println("Scheduled Activity "+activities[i]+" on Machine "+(j+1));
				}
			}
			if(!scheduledThisActivity){
				machines.add(activities[i].getEndTime());
				System.out.println("Scheduled Activity "+activities[i]+" on Machine "+machines.size());

			}

		} 

		System.out.println("Number of machines used :::"+machines.size());
		return machines.size();
	}
}

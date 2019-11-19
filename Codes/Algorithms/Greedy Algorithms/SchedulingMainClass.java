public class SchedulingMainClass{

	public static void main(String[] args) {
		Meeting meeting1 = new Meeting("A","Shubham",1, 3);
        Meeting meeting2 = new Meeting("B","Shubham",2, 5);
        Meeting meeting3 = new Meeting("C","Shubham",6, 7);
        Meeting meeting4 = new Meeting("D","Shubham",4, 9);
        Meeting[] meetings = {meeting1,meeting2,meeting3,meeting4};
        //Schedulers.earliestFinishFirst(parties);
        int no_of_rooms_required = Schedulers.depthProblemScheduler(meetings);

	}

}
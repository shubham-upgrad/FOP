// public int compareTo(T o)
public abstract class Activity implements Comparable<Activity>{
    protected int startTime;
    protected int endTime;
    public int getEndTime(){
    	return endTime;
    }
    public int startTime(){
    	return startTime;
    }
}
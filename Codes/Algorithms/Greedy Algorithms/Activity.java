// public int compareTo(T o)
public abstract class Activity{
    protected int startTime;
    protected int endTime;
    public int getEndTime(){
    	return endTime;
    }
    public int getStartTime(){
    	return startTime;
    }
    public String toString(){
    	return "Activity";
    }
}
// Comparable has disadvantage that we have to select a fixed set of attributes to compare
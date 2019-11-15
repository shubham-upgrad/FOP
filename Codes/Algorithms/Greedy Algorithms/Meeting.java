public class Meeting extends Activity{
	private String title;
	private String organizedby;

	Meeting(String title,String organizedby,int startTime,int endTime){
		this.startTime=startTime;
		this.endTime=endTime;
		this.title=title;
		this.organizedby=organizedby;
	}

	public String toString(){
		return "Meeting : \'"+title+"\' organizedby "+organizedby+" starting at "+startTime
		+" ending at "+endTime+"\n";
	}
	public int getEndTime(){
		return endTime;
	}
	public int getStartTime(){
		return startTime;
	}
	public int compareTo(Activity otherActivity){
		return (this.getEndTime()-otherActivity.getEndTime());
	}
}




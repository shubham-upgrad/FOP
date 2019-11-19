// Assume that parties are not comparable...also, they aren't Activities either(They don't extend Activity class)
public class Party extends Activity{
	private String occassion;
	public Party(String occassion,int beginsAt,int endsAt){
		this.occassion=occassion;
		this.startTime=beginsAt; // Initializing varibales inherited from Activity
		this.endTime=endsAt;
	}
	public String toString(){
		return "Occassion :: "+occassion+" starting at "+startTime+" till "+endTime+"\n";
	}
	public String getOccassion(){
		return occassion;
	}
		
}
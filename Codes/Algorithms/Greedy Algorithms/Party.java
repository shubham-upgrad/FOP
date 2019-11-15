// Assume that parties are not comparable...also, they aren't Activities either(They don't extend Activity class)
public class Party{
	private String occassion;
	private int beginsAt;
	private int endsAt;
	public Party(String occassion,int beginsAt,int endsAt){
		this.occassion=occassion;
		this.beginsAt=beginsAt;
		this.endsAt=endsAt;
	}
	public String toString(){
		return "Occassion :: "+occassion+" starting at "+beginsAt+" till "+endsAt+"\n";
	}
	public String getOccassion(){
		return occassion;
	}
	public int getStartTime(){
		return beginsAt;
	}
	public int getEndTime(){
		return endsAt;
	}
	public boolean equals(Object o){
		Party p=(Party)o;
		return this.endsAt!=p.endsAt;

	}
	public int hashCode(){
		return occassion.length();
	}
}
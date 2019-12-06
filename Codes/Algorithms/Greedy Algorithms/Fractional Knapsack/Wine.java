public class Wine extends Item{
	Wine(String brand,int weight,int value){
		this.brand=brand;
		this.weight=weight;
		this.value=value;
	}
	public String getType(){
			return "Wine";
	}

}
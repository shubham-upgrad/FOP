public class Television extends Item{
	Television(String brand,int weight,int value){
		this.brand=brand;
		this.weight=weight;
		this.value=value;
	}
	public String getType(){
			return "TV";
	}

}
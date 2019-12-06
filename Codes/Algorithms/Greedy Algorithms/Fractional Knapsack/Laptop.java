public class Laptop extends Item{
	Laptop(String brand,int weight,int value){
		this.brand=brand;
		this.weight=weight;
		this.value=value;
		
	}
	public String getType(){
			return "Laptop";
	}

}
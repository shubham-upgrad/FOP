public abstract class Item {
	protected int weight;
	protected int value;
	protected String brand;
	public int getWeight(){
		return weight;
	}
	public int getValue(){
		return value;
	}	
	public String getBrand(){
		return brand;
	}
	public abstract String getType();
}
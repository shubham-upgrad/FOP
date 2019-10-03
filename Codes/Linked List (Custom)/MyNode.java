public class MyNode{
	// Data 
	private int data;
	// Next Node address(Reference)
	private MyNode next;
	public void setData(int d){
		data=d;

	}
	public void setNext(MyNode m){
		next=m;

	}
	public int getData(){
		return data;
	}
	public int getNext(){
		return next;
	}
}
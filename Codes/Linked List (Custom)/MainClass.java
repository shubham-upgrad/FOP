public class MainClass{
	public static void main(String[] args) {
		// Create a Node and store its address
		MyNode head=new MyNode();
		head.setData(1);
		head.setNext(null); // Because this is first node and the only node that we have
		// Adding one more node to the list
		// 1. Have a temp variable to refer to newly created NODE
				// then pass that to head.setNext
		// 2. Directly pass the new Node to head.setNext()
		// head.setNext(new MyNode());


		// We are using first method now :
		MyNode temp=new MyNode();
		head.setNext(temp);
		temp.setData(2); // Creating second node
		temp.setNext(null);

		temp=new MyNode();		
		}
}
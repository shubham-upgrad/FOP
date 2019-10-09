public class MainClass{
	public static void main(String[] args) {
		// // Create a Node and store its address
		// MyNode temp2;
		// MyNode head=new MyNode();
		// head.setData(1);
		// head.setNext(null);
		// temp=head; // Because this is first node and the only node that we have
		// // Adding one more node to the list
		// // 1. Have a temp variable to refer to newly created NODE
		// 		// then pass that to head.setNext
		// // 2. Directly pass the new Node to head.setNext()
		// // head.setNext(new MyNode());

		// // Creating second node
		// // We are using first method now :
		// // Creating third node
		// // temp=new MyNode(); // Created a new node and saved its address to temp
		// // // Move to the last node from head;
		// // temp2=head; // temp2 referring to head node now
		// // while(temp2.getNext()!=null){
		// // 	// Move temp2 to the next node
		// // }
		// // // After this loop, temp2 will stand/refer-to the last node

		// // // I want my newly created node to be inserted in the list
		// // // I want last node to have its address in its node
		// // temp2.setNext(temp);
		// // temp.setData(3);
		// // temp.setNext(null);

		// // // Creating 4th node
		// // temp=new MyNode(); // Created a new node and saved its address to temp
		// // // Move to the last node from head;
		// // temp2=head; // temp2 referring to head node now
		// // while(temp2.getNext()!=null){
		// // 	// Move temp2 to the next node
		// // }
		// // // After this loop, temp2 will stand/refer-to the last node

		// // // I want my newly created node to be inserted in the list
		// // // I want last node to have its address in its node
		// // temp2.setNext(temp);
		// // temp.setData(3);
		// // temp.setNext(null);
		// temp.setNext(new MyNode());
		// temp=temp.getNext();
		// temp.setNext(null);
		// temp.setData(2);
		// temp.setNext(new MyNode());
		// temp=temp.getNext();
		// temp.setNext(null);
		// temp.setData(2);
		// temp.setNext(new MyNode());
		// temp=temp.getNext();
		// temp.setNext(null);
		// temp.setData(2);
		// temp.setNext(new MyNode());
		// temp=temp.getNext();
		// temp.setNext(null);
		// temp.setData(2);
		// temp.setNext(new MyNode());
		// temp=temp.getNext();
		// temp.setNext(null);
		// temp.setData(2);
		// temp.setNext(new MyNode());
		// temp=temp.getNext();
		// temp.setNext(null);
		// temp.setData(2);
		// temp.setNext(new MyNode());
		// temp=temp.getNext();
		// temp.setNext(null);
		// temp.setData(2);
		// }
		MyLinkedList mylist = new MyLinkedList();
		mylist.printMyLinkedList();
		mylist.insertAtEnd(3);
		mylist.printMyLinkedList();
		mylist.insertAtEnd(4);
		mylist.printMyLinkedList();
		mylist.insertAtEnd(5);
		mylist.printMyLinkedList();
		mylist.insertAtEnd(6);
		mylist.printMyLinkedList();
		mylist.insertAtEnd(7);
		mylist.printMyLinkedList();
		mylist.insertAtStart(2);
		mylist.printMyLinkedList();
		mylist.insertAtStart(1);
		mylist.printMyLinkedList();
		// System.out.print("\n\n Starting to delete from Beginning :");
		// mylist.deleteFromBeginning();
		// mylist.printMyLinkedList();
		// mylist.deleteFromBeginning();
		// mylist.printMyLinkedList();
		// mylist.deleteFromBeginning();
		// mylist.printMyLinkedList();
		// mylist.deleteFromBeginning();
		// mylist.printMyLinkedList();
		// mylist.deleteFromBeginning();
		// mylist.printMyLinkedList();
		// mylist.deleteFromBeginning();
		// mylist.printMyLinkedList();
		// mylist.deleteFromBeginning();
		// mylist.printMyLinkedList();
		// mylist.deleteFromBeginning();
		System.out.print("\n\n Starting to delete from End :");
		mylist.deleteFromEnd();
		mylist.printMyLinkedList();
		mylist.deleteFromEnd();
		mylist.printMyLinkedList();
		mylist.deleteFromEnd();
		mylist.printMyLinkedList();
		mylist.deleteFromEnd();
		mylist.printMyLinkedList();
		mylist.deleteFromEnd();
		mylist.printMyLinkedList();
		mylist.deleteFromEnd();
		mylist.printMyLinkedList();
		System.out.print("\n");
		mylist.deleteFromEnd();
		mylist.printMyLinkedList();
		mylist.deleteFromEnd();

		
	}
}
public class MyLinkedList{
	private MyNode head;
	// private MyNode last;
	public MyLinkedList(){
		head=null;
	}
	public void insertAtEnd(int data){
	 MyNode temp;
	 if(head==null){


		head=new MyNode();
		head.setData(data);
		head.setNext(null);
		// last=head;
	}
	else{

		// last.setNext(new MyNode());
		// last=last.getNext();
		// last.setNext(null);
		// last.setData(data);

		temp=head;
		while(temp.getNext()!=null){
			temp=temp.getNext();
		}
		// temp will refer to last node after the loop
		temp.setNext(new MyNode());
		temp=temp.getNext(); // Moving to the next node
		temp.setNext(null);
		temp.setData(data);
	}

	}
	public void insertAtStart(int data){
			MyNode temp;
			if(head==null){
				temp=new MyNode();
				temp.setNext(null);
				temp.setData(data);
				head=temp;

			}
			else{
				temp=new MyNode();
				temp.setData(data);
				temp.setNext(head);
				head=temp;
			}



	}
	public void printMyLinkedList(){
		// Start from head
		// 	go to the last node
		MyNode temp;
		if(head==null){
			System.out.println("\nLIST IS EMPTY");
		}
		temp=head;
		System.out.print("\n");
		while(temp!=null){
			System.out.print(temp.getData()); // temp will show data before moving to next
			if(temp.getNext()!=null) // If there is a next node
			{
				System.out.print("-->");
			}
			
			temp=temp.getNext();

		}
	}
	public boolean deleteFromBeginning()
    {
        MyNode temp;
        if(head == null)
        {
            return false;
        }
        else
        {
            temp = head;
            head = temp.getNext();
            System.gc();
            return true;
        }
    }
    public boolean deleteFromEnd(){

    	MyNode last,secondlast;
    	if(head==null){
    		return false; //Cannot delete from empty list
    	}
    	else{

    		last=head;
    		while(last.getNext()!=null){

    			last=last.getNext();
    		}
    		secondlast = head;
    		while(secondlast.getNext()!=last && secondlast.getNext()!=null){
    			secondlast=secondlast.getNext();

    		}
    		if(secondlast==last){
    			head=null;
    			last=null;
    			secondlast=null;

    		}
    		else{
    			secondlast.setNext(null);
    			last=secondlast;	
    		}
    		return true;
    		
    	}
	    	


    }

}
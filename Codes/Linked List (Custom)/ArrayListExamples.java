import java.util.*;
// Assuming E to be the type of ArrayList
public class ArrayListExamples{
	public static void main(String[] args) {
	ArrayList<String> mylist = new ArrayList<>();
	// add(E)  : add element to the last position or at the end	
	mylist.add("Shubham");
	mylist.add("Hitesh");
	mylist.add("Disha");
	mylist.add(null); // Can add null values to list
	mylist.add(null); // List allows duplicates
	// add(int,E) : add element to a specified position
	mylist.add(0,"Nandini");
	// // mylist.add(-5,"A"); // Won't work...IndexOutOfBoundsException
	// // mylist.add(10,"A"); // Won't work... IndexOutOfBoundsException
	// // mylist.add('5'); // add(integer) // this won't work because ther eis no
	// //  add method corresponding to this call
	// ArrayList<String> mylist2=new ArrayList<>();
	// ArrayList<String> mylist3=new ArrayList<>();
	// // addAll(Collection<? extends E>) : adds a collection to the list
	// mylist2.addAll(mylist);
	// mylist3.add("A"); //0
	// mylist3.add("B"); //1
	// mylist3.add("C"); //2
	// mylist3.add("D"); //3
 // 	mylist3.add("E"); //4
	// // addAll(int,Collection<? extends E>) : adds a collection to the list at
	// //								specified index in the list
	// mylist3.addAll(1,mylist2);
	// // mylist3.clear(); // Will remove everything from the list
 	
	// // System.out.println(mylist);	
	// // System.out.println(mylist2);	
	// // System.out.println(mylist3);	
	// // System.out.println(mylist.contains("Nandini")); // Checks if list contains this element
	// // 	// returns a boolean
	// // System.out.println(mylist.get(3)); // Getting element by index
	// // mylist.set(4,"Prasham");
	// // System.out.println("After using set(int,E):::");
	// // System.out.println(mylist);	
	// // Removing from the list
	// /*
	// mylist =[Nandini, Shubham, Hitesh, Disha, Prasham, null]
	// mylist2 = [Nandini, Shubham, Hitesh, Disha, null, null]
	// mylist3 =[A, Nandini, Shubham, Hitesh, Disha, null, null, B, C, D, E]

	// */
	// mylist.remove(0); // Removing from index
	// mylist2.remove(null); // Removing by element (only first occurrence will be removed)
	// mylist2.remove("Shubham");
	// System.out.println(mylist);	
	// System.out.println(mylist3);
	
	// // At this point :
	// /*
	// mylist2 = [Nandini, Hitesh, Disha, null]
	// mylist3 =[A, Nandini, Shubham, Hitesh, Disha,null,null, B, C, D, E]
	// */	
	// // removeAll(Collection<? extends E>) will remove all occurrences of elements
	// // from given list(mylist3) that are present in mylist2 
	// // mylist3.removeAll(mylist2);

	// // retainAll(Collection<? extends E>) gives intersection of two lists
	// mylist3.retainAll(mylist2);
	// /* After removing mylist2 from mylist3 :
	// 	mylist3 =[A, Shubham, B, C, D, E]
	// */
	// System.out.println(mylist3);	


	// Iterating over list elements :
	// 1. Using iterators
	// Iterator<String> it=mylist.iterator();
	// Iterator it=mylist.iterator();
	// while(it.hasNext()){
	// 	// String x=it.next(); // next() returns String if Iterator is declared as Iterator<String>
	// 	String x=(String)it.next(); // next() returns Object if Iterator doesn't have type
 // 		// Anything you want to do with the value

		
	// 	System.out.println(x);
	// }
	// System.out.println(mylist);




	// // 2. Using for-each loop
	// for(String s:mylist){
	// 	mylist.remove(3); // Nooooo!!!! forEach is also fail-fast(internally uses iterators)
	//	// Use Iterator's remove method 
		// Note : remove method can not be called twice after a next() call	
	//System.out.println(s);
	// }

	/** LIST ITERATORS **/
	// ListIterator lit=mylist.listIterator(); // Starting from beginning
	ListIterator lit=mylist.listIterator(mylist.size()); // Starting from end
	// while(lit.hasNext()){
	// 	String s=(String)lit.next();
	// 	System.out.println(s);
	// }
	System.out.println("Traversing list backwards");
	while(lit.hasPrevious()){
		String s=(String)lit.previous();
		System.out.println(s);
	}

	}
    
		
	
}
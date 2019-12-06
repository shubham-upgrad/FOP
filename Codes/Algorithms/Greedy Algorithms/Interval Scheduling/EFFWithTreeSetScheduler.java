// This is EarliestFinishFirst scheduler as before but with TreeSet
// TreeSet --> Set : doesn't allow duplicates
//         --> Sorted Set
// 		   --> Excpects the objects that are put into it to be Comparable
import java.util.*;
public class EFFWithTreeSetScheduler{
	public static void main(String[] args) {
		// Instantiate a TreeSet
		Set<Party> party_set=new HashSet<Party>();
		Party party1 = new Party("A",5, 9);
        Party party2 = new Party("B",8, 9);
        Party party3 = new Party("C",5, 7);
        Party party4 = new Party("D",0, 6);
        Party party5 = new Party("E",3, 4);
        Party party6 = new Party("F",1, 2);		
        Party party7 = new Party("B",8, 9);		
		party_set.add(party1);
		party_set.add(party2);
		party_set.add(party3);
		party_set.add(party4);
		party_set.add(party5);
		party_set.add(party6);
		party_set.add(party7);
		System.out.println(party_set);
		
	}





}
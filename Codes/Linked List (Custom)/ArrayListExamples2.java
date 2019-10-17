//  Here we are going to add Student objects to a list :
import java.util.*;
class Student{
	String name;
	int rollno;
	Student(String n,int r){
		name=n;
		rollno=r;
	}
	//Overriding the toString()
	public String toString(){ // This provides String representation of an object
		// So it will be called whenever you use a reference as/with a String
		System.out.println("toString() called");
		return rollno+"."+name;
	}
	// From object class
	public boolean equals(Object o){
		Student s=(Student)o;
		if(this.name.equals(s.name) && this.rollno==s.rollno){
			return true;
		}
		return false;
	}
	
}


public class ArrayListExamples2{
	public static void main(String[] args) {
	// Creating an arraylist of students	
	List<Student> list=new ArrayList<Student>();
	Student s1=new Student("Manay",2);
	list.add(new Student("Hitesh",1));
	list.add(new Student("Sakshi",3));
	list.add(new Student("Nandini",4));
	list.add(new Student("Prasham",5));
	list.add(new Student("Nikhil",6));
	list.add(s1);
	Student s2=new Student("Prasham",5);
	list.remove(s2); //
	System.out.println(s2.equals(s1));




	}

}
// What is a class ???????? -- A Specification
// Every girl's sapno ka rajkumar
// This defines... what THE HE should look like and properties HE must have

// What is an object ??????? -- Instance of a class
// Hitesh Sehgal --> The one with all the properties (Example of what was specified...or specification)

// this --> a keyword that refers to currently calling object

// Access modifiers
// private : class level access
// default : package level access(Accessible in same package only)
// protected : Sub-classes (even if they are out of the package)
// public : Any one from outside the class



class Human{
	// A class has properties(attributes) and behaviour(methods)
	// Attributes of a class
	private String name; // Only available inside the class
	private String dob;
	private String hair_color;
	private double height;
	// Constructor -- Used to create an object
	// Human(No parameters(Default Constructor)){
		
	// }
	
	// Parameterized constructor

	Human(String name,String dob,String hair_color,double height){
		
		this.name/*(Attribute)*/=name/*Parameter passed to constructor*/;
		this.dob=dob;
		this.hair_color=hair_color;
		this.height=height;
	}
	// Constructors don't have a return type
	// But what if we give it a return type???
	// If we do...then it becomes a method of the class(like any other mehtod)
	// Hence it is NOT a constructor		
	void Human(){
		System.out.println("OOOPS!!!!! It is a method not a constructor");
	}

	public void speak(){
		System.out.println(this.name+" is Speaking : Har Har Modi Ghar ghar modi");
	}
	void speak(String what_to_speak){
		System.out.println(this.name+" is Speaking : "+what_to_speak);
	}
	void speak(int a,int b){
		System.out.println(this.name+" is Speaking : "+"The sum of numbers is+ "+(a+b));
	}
	// A getter method(Accessor) to access the value of a private data member
	public String getName(){
		return name;
	}
	public double getHeight(){
		return height;
	}
	public String getHairColor(){
		return hair_color;
	}
	public String getDOB(){
		return dob;
	}
	// A setter method(Mutator) to change the value of a private member
	public void setName(String name){
		if(!name.trim().equals("")){
				this.name=name;
		}
		
	}
	
}
public class ClassesAndObjectsExamples2{
	

	public static void main(String[] args) {
	Human a=new Human("Hitesh","10/02/1998","Black",223);
	
	System.out.println(a.getName());
	a.setName("                        ");
	System.out.println(a.getName());
	}


}
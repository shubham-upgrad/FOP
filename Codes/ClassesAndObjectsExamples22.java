// static  -> 
/*
static :
create an attribute that can be used by all objects
		- common to all objects
		- Class Variables

create a method which can be called without creating an object
create a static block(initialization block) :
		1.Inititalization blocks -- Constuctors, static blocks,non-static blocks 
		Invocation order : static ----> nonstatic----> constructor(if all three are present)

An inner class can be static :

1. if you have a non-static inner class then...all its static data members must be 
	initialized with a constant
2. Members of inner class are not directly accessible from outer class
3. Members of outer class are directly accessible inside the inner class


final keyword :
can be used :
1. with a class --> You cannot inherit a final class . . 
2. with a method --> You cannot override a method that is final
	OVERRIDING only comes into picture when there is INHERITANCE
3. with a varibale --> You cannot modify a final variable







*/
// class A{
// 	final void display(){
// 		System.out.println("displaying");
// 	}
// }
// final class A{
// 	final void display(){
// 		System.out.println("displaying");
// 	}
// }

class HighClass extends A{
	
	private int y; //Creating instance variable
	private static int x; // Creating a CLASS VARIABLE
	{
		System.out.println("Non Static Block 2");
		
		
	}
	{	
		System.out.println("Non Static Block 1");
	}
	static{
	
		System.out.println("Static Block 2");
		
	}
	static
	{
		System.out.println("Static Block 1");
	}
	// void display(){
	// 	System.out.println("HighClass");
	// }
	HighClass()
	{
		System.out.println("Constructor");
	}

	public void setX(){
		x++;
	}
	public int getX(){
		return x;
	} 
}
public class ClassesAndObjectsExamples22{


	public static void main(String[] args) {
    final HighClass object1=new HighClass();
    HighClass object2=new HighClass();
    HighClass object3=new HighClass();
    object1.setX();
    object3.setX();
    object3.setX();
    object1=object3;
    System.out.println(object1.getX());
    System.out.println(object2.getX());
    System.out.println(object3.getX());
    object1.display();
    

	}		
}
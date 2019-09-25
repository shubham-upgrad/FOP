/*


abstract : 
1. with a class -> You wil never create objects of this class and some class will
				INHERIT this class
2. with a method --> Some method in some child class will override this method

*/

/*
super -> access super class methods and constructors in a sub class
this -> access methods and variables and constructors of same class
abstract -> A whole different story . . . . . . .


*/
class Vehicle{
Vehicle(){
	System.out.println("Vehicle Constructor");
}
void drive(){
	System.out.println("Driving");
}
void stop(){
	System.out.println("STOP!!!");
}
} 


class Car extends Vehicle{
int x; // Will be inherited
Car(){
	System.out.println("Car constructor");
}
Car(String x){
	System.out.println("Parameterized car constructor");
}
void drive(){
	System.out.println("Car Driving");
}
void stop(){
	System.out.println("STOP THE CAR!!!");
}

}

class Jaguar extends Car{
	int x; // Hides the x of Car class
	String y;
	void drive(){
	super.drive(); // Using super to access super class drive
	}
	Jaguar(){
		
		this(5); // Calling the parameterized constructor from default constructor 
		// this("ABC"); // WON'T WORK!!!!! this ke upar this bhi nahin aayega
		System.out.println("Jaguar Constructor");

	}
	Jaguar(int x){
		this.x=x;
	}
	Jaguar(String y){
		this(); // Call default constuctor
		this.y=y;
	}
	Jaguar(boolean a){
		super(new Boolean(a).toString()); //Calling parametrized Cons. of super class
		System.out.println("Boolean Constructor");
	}
	void stop(){
		System.out.println("STOP THE JAGUAR!!!");
	}
	void showX(){
		System.out.println(super.x);
	}

}
public class InheritanceExamples2{
	public static void main(String[] args) {
		// Vehicle v=new Jaguar();
		// v.drive();
		// // System.out.println(v.x); // WON't WORK......Vehicle doesn't have x
		// Jaguar j=new Jaguar();
		// System.out.println(j.x);
		// j.showX();
		// Jaguar new_j=new Jaguar("Jaguar String");
		// System.out.println(new_j.x);
		// System.out.println(new_j.y);
		Jaguar j2=new Jaguar(false);
	}
}
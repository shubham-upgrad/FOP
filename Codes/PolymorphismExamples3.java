/*

*/

/*
Interfaces : were pure abstract classes until java 8
		- Before JAVA 8 You couldn't define a method in interface
		- Now you can...they're called default methods  
	1. All methods inside an interface are public,abstract by default (except for default
			methods)	
	2. You can have variable in an interface and they are public,static,final
	3. It is(was) pure abstract class because you cannot have NON-ABSTRACT methods
	   in an Interface
	4. Multiple Inheritance is allowed in interfaces   
Consider interfaces as a contract that a class signs to be able to do or become
something
In classes -> methods are behaviours,data members are properties or attributes
Interfaces ---> They are Capabilites(what a particular object can do )

If a class implements an interface, then it must override ALL of its abstract methods
		OR else the class must be abstract
If a class implements an interface(say X implements InterfaceX)....and if 
some class(say Y extends X).....then same rules apply as in case of abstract class
inheritance [Some of the descendants of X may or may not override the abstract method
if one of them has already done it]		


Default methods in Interfaces :
1. If interface X and Y have same default method and ClassZ implements X,Y then class MUST 
   provide implementation of the method
2. If X has implementation and Y doesn't then also class Z is forced to override
		the method
3. If ClassZ implements X, and ClassZ2 extends ClassZ implements X -> 
		Both parent and child
   			are implementing the default method
*/
interface Parent{
	default void steer(){
		System.out.println("Parent Steering");
	}
}  
interface Driveable{
	void steer();
	void brake(); // Declaring the method(kinda like Prototype Declaration)
	void accelerate();

}
interface Steerable{
	default void steer(){
		System.out.println("Default Steering algortihm of Steerable");
	}
}
class Truck implements Driveable{
	public void steer(){
			System.out.println("Truck Steering Algorithm");
	}
	public void brake(){ // Implementing the method
			System.out.println("Truck Applying Brakes");
	}
	public void accelerate(){
			System.out.println("Truck Accelerating");
	}
}
class Tractor implements Driveable,Steerable{
	
	public void brake(){
			System.out.println("Tractor Applying Brakes");
	}
	public void accelerate(){
			System.out.println("Tractor Accelerating");
	}
}
public class PolymorphismExamples3{
	public static void main(String[] args) {
			Driveable d=new Truck(); // Legal...interface reference can refer to 
									// Object of implementing class . . . .
			d.accelerate();
			d.steer();
			d.brake();
			d=new Tractor();
			d.accelerate();
			d.steer();
			d.brake();
	}

}
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
abstract class A{ // This class cannot be instrantitiated and has
					// ATLEAST ONE ...ATLEAST ONE abstract method

abstract void display(); // means some sub class is going to override this method
void show(){
	System.out.println("Showing in A");
}

} 
abstract class B extends A{
	
	void showInB(){
		System.out.println("Showing in B");
	}
	void show(){
		System.out.println("Overriding show in B");
	}
}
class C extends B{
	void display(){
		System.out.println("display overridden");
	}
	void showInC(){
		System.out.println("Showing in C");
	}
	void show(){
		System.out.println("Overriding show in C");
	}
}
abstract class A2{ // This class cannot be instrantitiated and has
					// ATLEAST ONE ...ATLEAST ONE abstract method

abstract void display(); // means some sub class is going to override this method
void show(){
	System.out.println("Showing in A");
}

} 
class B2 extends A2{
	void display(){ // Now none of the descendants of B2 need to override display()
		System.out.println("B's version of displaying!!");
	}
	void showInB(){
		System.out.println("Showing in B");
	}
	
}
class C2 extends B2{
	
	void display(int x){ // Now C2 has two display methods
		System.out.println("Displaying in display(int x)");
	}
	void showInC(){
		System.out.println("Showing in C");
	}

}
public class InheritanceExamples3{
	public static void main(String[] args) {
	A2 a2_obj=new B2();	 // We are NOT creating Object of abstract class
	//WE are just creating a reference of abstract class and object is of class B2
	// a2_obj.showInB(); // WON'T WORK!!!!! a2_obj has Reference Type A2 which doesn't
	// Have this method
	a2_obj.show(); // OK!!!A2 has this method and show() is not overridden so
	// Here we consider reference type and not the reference which a2_obj
	// is holding. , . . 

	}
}
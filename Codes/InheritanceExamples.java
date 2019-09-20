/*


abstract : 
1. with a class -> You wil never create objects of this class and some class will
				INHERIT this class
2. with a method --> Some method in some child class will override this method

*/

class Living{

}
class Human extends Living{

public void display(){
	System.out.println("Displaying in Human");
}

}
class Student extends Human{ //Student IS-A human

public void study(){
	System.out.println("Studying in Human");
}
public void display(){
	System.out.println("Displaying in Student");
}
}
class Employee extends Human{
public void display(){
	System.out.println("Displaying in Employee");
}
}
class Animal extends Living{

}
class Dog extends Animal{

}
class Suzi extends Dog{

}
class Bozo extends Dog{

}


class AnimalDoctor{

	void treat(Object a){
		System.out.println("treating an animal here");
	}
}



public class InheritanceExamples{
	public static void main(String[] args) {
		Human h=new Student(); 	 // Correct, a super class reference can
							// hold a sub-class object
		// h.study(); // WON'T WORK BECAUSE REFERENCE IS CONSIDERED WHILE
					//CALLING METHODS..SO Human doesn't have study method
					// Aur reference Human ka hai
		h=new Human();
		h=new Employee();
		h.display(); // In case of overridden methods...Object is considered
					// while calling the overridden methods

		// Student s=new Human(); //WON'T WORK!!!!!
		AnimalDoctor d=new AnimalDoctor();
		Bozo b=new Bozo();
		Employee e=new Employee();
		d.treat(b);
	}
}
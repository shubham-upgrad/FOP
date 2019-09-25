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
public String toString(){
	return "This is a student";
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
		// Human h=new Student(); 	 // Correct, a super class reference can
							// hold a sub-class object
		// h.study(); // WON'T WORK BECAUSE REFERENCE IS CONSIDERED WHILE
					//CALLING METHODS..SO Human doesn't have study method
					// Aur reference Human ka hai
		// h=new Human();
		// h=new Employee();
		// h.display(); // In case of overridden methods...Object is considered
					// while calling the overridden methods

		// Student s=new Human(); //WON'T WORK!!!!!
		// AnimalDoctor d=new AnimalDoctor();
		// Bozo b=new Bozo();
		// Employee e=new Employee();
		// d.treat(b);


		// Object class sabki maa hai
		// Object obj=new Human();
		// obj.display(); //
		// Human ke paas...display() hai.....
		/* So,
		Human ke references Student,Employee ko store kr skte hain aur display
		ki alag alag implementations call kr skte hain BECAUSE display HUMAN mein
		hai aur override hua hai */
		/*BUT,
		1.Object class mein display() naam ka koi method nahin hai..
		2. display Human class mein ek naya method hai aur Object ka koi display
		 override nahin hua hai...kyunki uske pass display nahin hai
		3. Hence this piece of code won't compile */

		// obj=new Employee();
		// obj.display();
		// obj=new Student();
		// obj.display();

		Object s=new Student();
		System.out.println(s);
	}
}
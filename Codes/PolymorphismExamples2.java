/*
	Overloading : using methods with same names to do different tasks.

	Overloading vs Overriding
	1. Inheritance is not necessary
	2. PARAMETER LIST OF OVERLOADED METHODS SHOULD BE , "SHOULD BE" DIFFERENT
	3. Return type may change
	4. Access privilege may change in any way
	5. Static method CAN BE OVERLOADED
	6. No restrictions on Exceptions
	7. Invokation (binding) happens at compile time


*/

class OverloadingExample1{
	// Inheritance is not required to overload a method
	public void printSomething(){
		System.out.println("Something");
	}
	// Commenting code because this will be available in child class
	// public void printSomething(String toPrint){
	// 	System.out.println(toPrint);
	// }
	private int printSomething(int a){
		System.out.println(5);
		return 5;
	}	

	public void printHuman(Student s){
			System.out.println("Student Recieved....");
	}
	public void printHuman(Human s){
			System.out.println("Human Recieved....");
	}

}
class OverloadingExample1Child extends OverloadingExample1{
	public void printSomething(String toPrint){
		System.out.println(toPrint);
	}
	public void getDouble(double d){
		System.out.println("Double Recieved");
	}
	public void getDouble(int d){
		System.out.println("int Recieved");
	}
	// public void printSomething(){
	// 	System.out.println("HELLO");
	// }
}

public class PolymorphismExamples2{
	public static void main(String[] args) {
		OverloadingExample1Child example = new OverloadingExample1Child();
		example.printSomething();
		example.printSomething("Shubham");
		OverloadingExample1 example1=new OverloadingExample1();
		Human m=new Student();
		example1.printHuman(m);		
		example.getDouble('a');
		example.getDouble(5.0);
	}

}
/*
Conditions for OVERRIDING methods :
0. Inheritance is involved or implementation is involved
1. MUST have "EXACTLY SAME" arguments(in case of primitives and References) and name

2. Return type should be EXACTLY same(for primitives) OR 
	it can be subtype of the retrun type in	original method(for references)

3. Access cannot be more restrictive in overriding method
   Can be more stronger than original method
   Can have more strong access privilege than original method
	The ascending order of access (most restrictive last) :
		public > protected(only child classes) > default > private
		MOST OPEN MODIFIERS ::::::
		[Least Restrictive] 1.public --> Most(Strongest) Access privileges(can be accessed anywhere)
							2.protected
							3.default
		[Most Restrictive] 4.private --> Least(Weakest) Access Privileges
4. Static methods cannot be overridden
5. final method cannot be overridden 
6. Exception :
	Unchecked Exceptions(NullPointerException,ArithmeticException) :
		Overriding method can add/remove all or some of unchecked exceptions
		 declared by original method....It(overriding method) doesn't have to declare any
		 RuntimeException that it doesn't throw

	Checked Exceptions(FileNotFoundException,Custom Exception) :
		Overriding method cannot throw any BROADER exception than the one declared
		 in original method
		*****It can however throw Narrower exceptions*****
		If original method doesn't throw ANY CHECKED EXCEPTIONS
		then Overiding method cannot throw any checked exceptions
			Let Parent = Overidden and Child = Overriding
		case 1 : Parent throws Checked exception :
					-Child can throw narrower exceptions
					-Child may choose to not throw any exception at all
					-Child may throw same exception 
		case 2 : Parent doesn't throw Checked Exception :
					- Chile CANNOT throw checked Exception 	

7. Invokation of OVERIDDEN METHODS happens at RUNTIME
*/
import java.io.*; // For FileNotFoundException
class CustomException extends Exception{

} 
class Parent{}

class Child extends Parent{}


class A3{
	public void display(){
		System.out.println("Display - A");
	}
	public int getSum(int a,int b){
		System.out.println("A - Sum is "+(a+b));
		return (a+b);
	}
	public void methodWithParentArg(Parent p){
		System.out.println("Inside methodWithParentArg - A");
	}
	public Parent methodWithParentReturn(){
		System.out.println("Inside Parent Returning - A");
		return new Parent();
	}
	public int intReturningMethod(){
		System.out.println("Inside int Returning - A");
		return 5;
	}
	public void myMethod(){ // A public method
		System.out.println("Public Method in A");
	}
	public static void staticMethod(){
		System.out.println("Static A");
	}
	// public final void finalMethod(){
	// 	System.out.println("Final Method - A");
	// } //Cannot be overridden



	// Let's assume following are the signatures of methodThrowingUnchecked() :
	// public void methodThrowingUnchecked()
	// public void methodThrowingUnchecked() throws ArithmeticException
	// and one more :
	public void methodThrowingUnchecked() throws ArithmeticException,NullPointerException
	{
		System.out.println("methodThrowingUnchecked - A");
	}
	public void methodThrowingChecked()
	{
		System.out.println("methodThrowingUnchecked - A");
	} 
}
class B3 extends A3{
	public void display(){
		System.out.println("Display - B");
	}
	public int getSum(int a,int b){
		System.out.println("B - Sum is "+(a+b));
		return (a+b);
	}	
	public void methodWithParentArg(Parent p){
		System.out.println("Inside methodWithParentArg - B");
	}
	public Child methodWithParentReturn(){
		System.out.println("Inside Parent Returning - B");
		return new Child();
	}
	// public char intReturningMethod(){
	// 	System.out.println("Inside char Returning - B");
	// 	return 'A';
	// } //This cannot override the intReturningMethod
	public void myMethod(){ // A default method trying to override a public method
		System.out.println("Public Method in B");
	}
	public static void staticMethod(){ // this is redefinition and not overriding
		System.out.println("Static B");
	}
	// public void finalMethod(){
	// 	System.out.println("Final Method - A");
	// }

	// The methodThrowingUnchecked can be overridden by any of the following :
	// public void methodThrowingUnchecked() throws NullPointerException
	// public void methodThrowingUnchecked() throws ArithmeticException,NullPointerException
	// and :
	public void methodThrowingUnchecked()
	{
		System.out.println("methodThrowingUnchecked - B");
	}

	public void methodThrowingChecked() throws FileNotFoundException
	{
		System.out.println("methodThrowingUnchecked - B");
	}  

}
public class PolymorphismExamples1{
	public static void main(String[] args) throws IOException {
		A3 a_ref=new B3(); // A3 reference having B3 object
		// All B methods
		// a_ref.display();
		// a_ref.getSum(2,3);
		// a_ref.methodWithParentArg(new Child());
		// a_ref.methodWithParentReturn();
		// a_ref.intReturningMethod();
		// a_ref.myMethod();
		// a_ref.staticMethod();
		// a_ref.methodThrowingUnchecked();
		a_ref.methodThrowingChecked();
		a_ref=new A3();
		// All A methods
		// a_ref.display();
		// a_ref.getSum(2,3);
		// a_ref.methodWithParentArg(new Child());
		// a_ref.methodWithParentReturn();
		// a_ref.intReturningMethod();
		// a_ref.myMethod();
		// a_ref.staticMethod();
		// a_ref.methodThrowingUnchecked();
		a_ref.methodThrowingChecked();
	}
}
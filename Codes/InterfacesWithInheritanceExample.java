/*
1. If B inherits A and A implements X then :
	
	i.If A doesn't implement default method in X --> B will use the
		 default implementation which is there in the interface
	
	ii. If A overrides method1(), then 
			---> B will use the implementation of
					parent class
			---> B cannot use X.super.method1() because it has a parent who is 
					implementing method1()	

	
	iii. If B overrides method1(), then ----> B will use its own implementation

	 
2. "Interfaces can have static methods"

*/
interface G{
	default void someMethod(){
		System.out.println("G");
	}
}
interface H{
	default void someMethod(){
		System.out.println("H");
	}
}
interface I extends G,H{
	default void someMethod(){
		G.super.someMethod(); // I gave preference to G's method
		// It could have also selected H
	}
}

interface MyInterface{
	default void method1(){
		System.out.println("Hello there, I am in Interface");
	}
	
}
class MyImplementingParent implements MyInterface{
	public void method1(){
		MyInterface.super.method1(); // Delegating the call to default method
	}


}
class MyImplemetingChild extends MyImplementingParent implements MyInterface{
 	public void method1(){
 		System.out.println("Child calling default implementation");
		
	}
}


public class InterfacesWithInheritanceExample{
	public static void main(String[] args) {
		MyImplemetingChild m=new MyImplemetingChild();
		m.method1();
		// I want to call non-static method of interface :
		// I will call parent's method1
		MyImplementingParent mp=new MyImplementingParent();
		mp.method1(); // Calling parent's method1();
		// We get an illusion that interface's deafult method was called
		// but actually it was Parent's method1() that delegated the call to 
		// Interface's method1();
	}
}
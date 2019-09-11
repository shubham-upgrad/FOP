// l\   l
// l \  l
// l  \ l
// l   \l O T E -------> JAVA IS STRICTLY PASS PY VALUE

// You don't need an object to access a static method
// However, you CAN access a static method through an object
// Example : FunctionsExamples.main() can be used to call main() or anyother
			// Static method
// OR FunctionsExamples fe=new FunctionsExamples();
		// fe.main() or any other static method....so you can use objects too!!!

// Static data members are class members and are common to all objects
// Non static members, however are separate for each object of a class

// Method definitions :
/*
[Access Specifier] {static} [Return-type] [methodName]([Parameter List separated by comma]){
	// Lines of code that perform the task


	[return statement]
}
Example :
[public/protected/default(or leave empty)/private] {(leave empty)/static} [Return-type] [methodName]([Parameter List separated by comma]){
	// Lines of code that perform the task


	return [return something of type Return-type];
}

[Access Specifier] {static} [Kya dega] [methodName]([Kya lega]){
	// Lines of code that perform the task


	[Ye de raha hun ]
}

*/
// Why use methods ?
// To make our code easy to debug and understand
// To increase code reusability


public class FunctionsExamples{
	public static int product(int a, int b){ // product() is static method
		// printTable(a,b);
		return a*b;
	}
	public int sum(int a,int b){ // sum(int,int) here is a non-static method
		return a+b;
	}
    public static void printTable(int x,int upto){
    	System.out.println("Printing table of "+x+" upto "+upto);
    	for(int i=1;i<=upto;i++){
    		System.out.println(product(x,i)); //Legal because product() is static
    	}
    }
	public static void main(String[] args) {
		// main() is a static method
		
		// So, no non-static member can enter it directly
		// Example :
		// int a=sum(2,5); // ILLEGAL!!!! main cannot access a non-static method DIRECTLY
		// System.out.println("Sum ="+a);
		

		// How can main() access a non-static method???
		// Ans : Using object of the class in which method is defined
		// Example :
		FunctionsExamples fe=new FunctionsExamples();
		int a=fe.sum(2,5);
		System.out.println("Sum = "+a);


		// main() or a static method can access other static methods directly :
		// Example :
		printTable(5,10);


		// using the product() method 
		int p=product(5,8);
		System.out.println("The product is "+p);

	}
}




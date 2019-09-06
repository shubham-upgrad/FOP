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

// Static members are class members and are common to all objects
// Non static members, however are separate for each object of a class

// Method definitions :
/*
[Access Specifier] {static} [Return-type] [methodName]([Parameter List separated by comma]){
	// Lines of code that perform the task


	[return statement]
}

[Access Specifier] {static} [Kya dega] [methodName]([Kya lega]){
	// Lines of code that perform the task


	[Ye de raha hun ]
}





*/


public class FunctionsExamples{
	public int sum(int a,int b){
		return a+b;
	}

	public static void main(String[] args) {
		FunctionsExamples fe=new FunctionsExamples();
		int x=1;
		int y=2;
		int z=fe.sum(x,y);	
		System.out.println(z);

	}
}




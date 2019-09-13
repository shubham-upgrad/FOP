/*
Unexpected situations that may arise due to some unexpected thing
that happened during the execution of the program

There two categories of such situations :
1. Error -> Situations which your code had nothing to do with
2. Exception -> Situations that arise due to the way code was made(Programmatic Errors)
	Exceptions are of two types :
		i. Checked(Compile Time Exception) : JVM knows that this may happen so informs you
											that "Hey!!You should handle this situation
											which may occur"
		ii. Unchecked(Runtime Exception) : JVM assumes that this situation might not come
											very often so doesn't ask you to handle the
											exception during compile time(BUT YOU CAN 
											HANDLE IF YOU WANT TO)

Error : StackOverflowError,OutOfMemoryError ....they are caused by things that your
		code cannot control...So you cannot do anything(steps) that can Handle an error

Exception : They are coming from a condition that was not handled in your code
		Example: - You want to read a file but the file is not there....
				JVM is like :: " Hey!!!You should've thought of this possibility"
				FileNotFoundException
		You are taking 2 numbers and dividing first by second...So you should think
		that user may enter Zero as the second number
					  Object
						|
						|
					Throwable
					/       \
				   /	     \
				 Error      Exception
				 			   \
				 			    \
				 			    RuntimeException(Unchecked)

Exception Handling in java involves 5 keywords :
1. try -> Surround the piece of code that may cause an exception with try
2. catch -> If an exception is encountered in try block...then handle it using catch
3. throw -> Use this to throw an exception by yourself (Exlicitly)
4. throws -> Use this to report an exception which a method is not handling by itself
5. finally -> THE CODE THAT ALWAYS RUNS






// Propagating an exception through the stack

m4 --> Throwing an excption --> so m4 declared it...like m4() throws SomeCheckedException
m3 --> So m3 is calling m4...hence m3 should handle this exceptio
		If m3 IS NOT WILLING TO HANDLE IT...then m3 can also report it
		m3() throws SomeCheckedException
m2 -->So m2 is calling m3...hence m2 should handle this exceptio
		If m2 IS NOT WILLING TO HANDLE IT...then m2 can also report it
		m2() throws SomeCheckedException
m1 -->So m3 is calling m4...hence m3 should handle this exceptio
		If m3 IS NOT WILLING TO HANDLE IT...then m3 can also report it
		m3() throws SomeCheckedException
main --> So main is calling m1...hence main should handle this exceptio
		If main IS NOT WILLING TO HANDLE IT...then main can also report it
		main() throws SomeCheckedException










*/
class MyException extends Exception{

}

public class ExceptionExamples{
	
	public static void hello(){
		
		try{

			throw new ArrayIndexOutOfBoundsException();
			
		}
		finally{
			System.out.println("finally");
		}
	
	
	}
	public static void main(String[] args)  {
		int x=1,y=Integer.parseInt(args[0]);
		
		try{
		double z=x/y; // Throws ArithmeticException
		// throw new NullPointerException(); // Throwing a checked exception
		// hello();
		// System.out.println(y1);
		throw new StackOverflowError();
	}
	catch(ArithmeticException e){
		System.out.println("Handling Exceptions");
	}
	
	System.out.println("See the code wasn't terminated!!!!");

	}


}
public class VariablesAndDataTypes{
	public static void main(String[] args){
		// The defaults 
		// : a number(without decimal - called integer literal ) is int by default
		// : a number with decimal is double by default

    	// Different Data Types
		int i; // i has 32 bits(signed) to represent an integer (31 bits for magnitude)
		char c;
		byte b;
		short s;
		long l;
		boolean bool;
		float f;
		double d;
		// Declaring Variables with literal(constant) values :
		int i1=10__00_00_000; // Underscores cannot be in the beginning or at the end
		int i2=0b101; // Can use 0b or 0B for binary
		int i3=0x01AbCd; // 0x or 0X is for Hex numbers
		int i4=0_17; // 0 is for Octal numbers
		long y=56l; // To declare a number(which is int by default) as long, place an l or L at the end
		// Note...You cannot use underscores with B in 0B,X in 0X
		// and near decimal in a float
		System.out.println(i4);
		// By default numbers are int but we can make them long
		long x1=2; // Widening : converting a smaller type to bigger type
		// long x3=2.3; // Narrowing : converting a bigger type to smaller type(Compiler won't allow it)
		// But with explicit casting we can shut the compiler up
		long x2=(long)2.3; // Will compile just fine
		// int explicit_casting=y; // y is a long an we're tryna stuff it into int(Won't Compile)
		
		float f1=2.5F; // To declare a float literal, just add f or F at the end

		boolean b1=true; // NOTE : No integer,empty string or anything can be boolean
		
		if(b1){ // You cannot replace b1 with int or any other type except boolean
			System.out.println("Hello");
		}

		char c1='A'; //Only Single Character is allowed in single quotes
		char c2='\u004E';
		char c3=2; // Legal, 2 can be accomodated in 16 bits...Implicit Casting ho rahi hai
		// char c4=70000;	// Illegal! because 16 bits are not enough represent this value
		
		// A rule for ints :
		// Whenever you combine something int-sized or smaller(char,short,byte) 
		// you get an int
		int by1=1;
		byte by2=2;
		byte by3=(byte)(by1+by2);
		byte m=2;
		// m=m+2; // Won't work!!m+2 will give an int and we are assigning it to a byte
		m+=2; // Compound assignments will always do the implicit casting(This will work)
		System.out.println(by3);	
		// -------------------------------END OF PRIMITIVES--------------------


		// -------------------------------REFERENCE TYPES(NON PRIMITIVES)------
		String str="ABC"; // str DOESN'T CONTAIN OBJECT "ABC"...
		// Recall that all variables are bit holders
		// So str also contains bits...that will lead us to "ABC" object in memory
		// So are they addresses(pointers)?????? NOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		// They are bit patterns that represent an address but are NOT actual
		// addresses

		System.out.println((str instanceof Object)?"String inherits object":"String doesn't inherit object");


	



















	}
}
// EXTRA knowledge :
// Signed 3 bits:
// 111 ---> THEN THE NUMBER IS NEGATIVE(BECAUSE THE SIGN BIT IS 1)
// Value : 
// 2's complement : Convert 1 to zeroes and zeroes to 1 and add 1 to the result
// 000 + 1 = 001(binary) = -1(decimal)

// Unsigned 3 bits:
// 111 ---> All three represent magnitude
// Value : 
// 111 = [1X2^(2)] + [1X2^(1)] + [1X2^(0)] = 7(Decimal)
// 000 + 1 = 001(binary) = -1(decimal)

// 101010101010101010100010110010101010101010


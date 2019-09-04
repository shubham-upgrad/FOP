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
		int i1=10_00_00_000; // Underscores cannot be in the beginning or at the end
		int i2=0b101; // Can use 0b or 0B for binary
		int i3=0x01AbCd; // 0x or 0X is for Hex numbers
		int i4=017; // 0 is for Octal numbers
		// Note...You cannot use underscores with B in 0B,X in 0X
		// and near decimal in a float
		System.out.println(i4);
		// By default numbers are int but we can make them long
		long x=2; // Narrowing : converting a bigger type to smaller type(Compiler won't allow it)
		// But with explicit casting we can shut the compiler up
		long x2=(long)2.3; // Will compile just fine
		




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

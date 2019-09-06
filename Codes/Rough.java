public class Rough{
	public static void main(String[] args) {
		// Bitwise Operators & |
		// S 64 32 16 8 4 2 1
		// 0  0 1  0  1 0 0 0 = 40
		// 0  0 0  1  1 0 0 0 = 24
		// 0  0 0  0  1 0 0 0 = 8 Result of and
		// 0  0 1  1  1 0 0 0 = 56 Result of OR
		// 1  1 1  0  0 1 1 1
		// 0  0 0  1  1	0 0 0 +1 = 0 0 0 1 1 0 0 1 = - 25
		byte i=40;
		byte b=24;
		System.out.println(i&b);
		System.out.println(i|b);
		System.out.println(~b);

	}


}
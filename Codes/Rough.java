public class Rough{
	public static void main(String[] args) {
		// Bitwise Operators & |
		// S 64 32 16 8 4 2 1
		// 0  1 0  0  0 0 0 0 = 64 = b
		// 0  0 0  0  0 1 0 1 = 5
		// 0  1 0  0  0 1 0 1  <---b|5 = 69
		// 0  0 0  0  0 0 1 1 = 3 
		// 0  0 0  0  0 1 0 0 = 4 
		// 0  0 0  0  0	0 0 0 = 0 3&4

		
		byte b=64;
		byte c=(byte)((b|5)+((byte)3&(byte)4));
		System.out.println(c);
		

	}


}
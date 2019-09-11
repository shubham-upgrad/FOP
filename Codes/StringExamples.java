/*

1. String is a sequence of characters
2. In java Strings literals are represented using ""(double quotes)
3. Strings are immutable(once assigned a value...they cannot be modified)
4. String class represents string in java
5. String class is declared final(it cannot be inherited) and resides in java.lang
6. There is this concept of Memory Management with String (String constant pool)
7. String is NOT...I SAID NOT an Array...so str[10] will not work(use charAt() instead)
8. String class has too many overloaded constructors
	(so you can create a string out of almost anything)
9. String in java is not ended by '\0'(not null terminated)
10. length() method of String class is used to calculate length of the string
11. If you try to access more characters than are present in a string you get
	StringIndexOutOfBoundsException


*/


public class StringExamples{
	public static void main(String[] args) {
		String s=new String("Shubham");
		s.concat(" Sharma"); // Won't change s, Strings are immutable
		// So almost all of the methods that tend to change a string
		// Generate a new string
		// In the above line...same thing happened
		// But the new String was not referred by any variable
		// Hence it was lost
		System.out.println(s);		

		// Now let's protect the new string from being lost
		String concatenated; // A reference that will point to new string
		concatenated=s.concat(" Sharma");

		System.out.println(concatenated);	


		// Constant Pool Waali Baatcheet 
		String str1="ABCDEF";
		String str2="ABCDEF";
		String str3=new String("ABCDEF");
		// == compares references..that is..if we write a==b for two references(
		// NOT primitives)... then if a and b refer to same object in memory
		// a==b gives you true ...else false
		System.out.println(str1==str3);

		// How many objects will be created :
		String ss1="ABC";
		String ss2=new String("ABC");
		String ss3=new String(new String("abc"));
		String ss4=ss3;

		System.out.println(ss1.charAt(6));
	


	}
}
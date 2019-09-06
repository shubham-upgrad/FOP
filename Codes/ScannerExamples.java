import java.util.Scanner;
import java.io.*;
public class ScannerExamples{


	public static void main(String[] args){
		// First we need to create an object of Scanner which will read inputs.
		// In order to create that object, we need to provide it a stream
		// from which Scanner object must read.
		// Here that stream is System.in aka Standard Input Stream aka Keyboard
		// Scanner sc= new Scanner(System.in);
		
		// System.out.println("Enter a number:::");
		// int num=sc.nextInt(); // nextInt for int
		
		// System.out.println("Enter a Characterer:::");
		// char c=sc.next().charAt(0); //next() for String(but we are taking first character
		// 							// of the string which was entered)
		
		// System.out.println("Enter a floating point number:::");
		// double dnum=sc.nextDouble(); // nextDouble() is for floating point numbers
		
		// System.out.println("Enter a String:::");
		// String str=sc.next(); // nextDouble() is for floating point numbers

		// System.out.println("Number : "+num);
		// System.out.println("Character : "+c);
		// System.out.println("Float Number : "+dnum);
		// System.out.println("String : "+str);

		// Reading from a file
		try{
		File inputFile=new File("input23.txt");
		
		Scanner sc= new Scanner(inputFile);
			System.out.println("Enter a number:::");
		
		// int num=sc.nextInt(); // nextInt for int
		
		// System.out.println("Enter a Characterer:::");
		// char c=sc.next().charAt(0); //next() for String(but we are taking first character
		// 							// of the string which was entered)
		
		// System.out.println("Enter a floating point number:::");
		// double dnum=sc.nextDouble(); // nextDouble() is for floating point numbers
		
		// System.out.println("Enter a String:::");
		// String str=sc.next(); // nextDouble() is for floating point numbers

		// System.out.println("Number : "+num);
		// System.out.println("Character : "+c);
		// System.out.println("Float Number : "+dnum);
		// System.out.println("String : "+str);
		
		// Checking whether file has input to be read
	// 	System.out.println("Enter a number:::");
	// 		int sum=0;
	// 	while(sc.hasNext()){
	// 		int x = sc.nextInt();
	// 		sum+=x;
	// 	}
	// 	System.out.println(sum);

	// }
	// 	while(sc.hasNextLine()){
	// 		String line=sc.nextLine();
	// 		System.out.println(line);
	// 	}
	// }
			}catch(IOException e){
			System.out.println("Caught by IO Exception---File Not Found");
		}
	

 }
}
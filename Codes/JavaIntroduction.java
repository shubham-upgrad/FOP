// Except for the package declaration and import statements
//  there is nothing----ABSOLUTELY NOTHING!!!----written 
//  Outside a class

// Class name SHOULD match file name if class is public
public class JavaIntroduction{
	// Heart of the Java Program, Java Code literally dies in front JRE if main()
	// is not present
	// The CODE cannot be EXECUTED if there is no main()
	public static void main(String[] args){
		// args = array of command line arguments passed during execution of the code
		// args[0] = 1st argument then args[1],args[2]. . . . .. 
		// Command Line Arguments are space separated


		// Code inside of main() that is to be executed
		System.out.println("Hello "+args[0]);

	}
}

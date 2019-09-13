// Arrays : Collection of homogeneous data
// NOTE : ----> IN JAVA ARRAYS ARE TREATED AS OBJECTS
// That means Arrays can be created using "new"(Don't be misled...there are other ways!!!)

class Person{

}
class Employee extends Person{

}

public class ArraysExamples{
	public static void changeReference(int[][] a){
		a=new int[2][2];
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				a[i][j]=5;
			}
		}

	}  
	public static void changeArray(int[][] a){
		
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
				a[i][j]*=2;
			}
		}
	}  



	public static void main(String[] args) {
		// arr is called array-reference(just like reference variable of any other
		// object in java)

		int[] arr1=null; // Creating an array reference
		// Here no array is created just the reference to an array
		// System.out.println(arr1);
 		// Assigning an array to the reference variable
 		arr1=new int[5]; // Size should be positive and is mandatory here
 		// System.out.println(arr1);
 		int n=4;
 		// Creating an array reference and an array in a single line
 		// Note that [] are placed after arr2...it is legal but unconventional
 		// 		so you should avoid it
 		//	Size can be dynamically defined
 		int arr2[]=new int[n];
 		// It is illegal(again...ILLEGAL) to define size on the left side
 		// int[5] arr3=new int[5]; // WON'T WORK...JVM SAYS...IT's JUST A REFERENCE..PROVIDE SIZE WHEN
 		// YOU CREATE AN ACTUAL ARRAY USING new
 		int[][] arr2d1=new int[5][];
 		// arr2d1[2][1]=65; // Won't work...Second dimension doesn't exist ye
 		arr2d1[0]=new int[3];  // It is legal to have different sized arrays
 		arr2d1[1]=new int[2];	// stored in an array of arrays
 		arr2d1[2]=new int[1];
 		arr2d1[3]=new int[4];
 		arr2d1[4]=new int[5];
 		int[][] arr2d2=new int[5][4];
 		arr2d2[0][2]=45; // Will work...Second dimension was created when gave size 4
 		// If you pass an array to a method then
 		// any change that method makes to the array will be reflected in the original
 		// array...same thing that happens with other objects
 	// 	for(int i=0;i<5;i++){
		// 	for(int j=0;j<4;j++){
		// 		arr2d2[i][j]=1;
		// 	}
		// }
		// System.out.println("Array before calling change Reference::");
		// for(int i=0;i<5;i++){
		// 	for(int j=0;j<4;j++){
		// 		System.out.print(arr2d2[i][j]+" ");
		// 	}
		// 	System.out.println("\n");
		// }
		// changeReference(arr2d2);
		// System.out.println("Array after calling change reference::::");
		// for(int i=0;i<5;i++){
		// 	for(int j=0;j<4;j++){
		// 		System.out.print(arr2d2[i][j]+" ");
		// 	}
		// 	System.out.println("\n");
		// }
		// for(int i=0;i<5;i++){
		// 	for(int j=0;j<4;j++){
		// 		arr2d2[i][j]=1;
		// 	}
		// }
		// System.out.println("Array before calling changeArray::");
		// for(int i=0;i<5;i++){
		// 	for(int j=0;j<4;j++){
		// 		System.out.print(arr2d2[i][j]+" ");
		// 	}
		// 	System.out.println("\n");
		// }
		// changeArray(arr2d2);
		// System.out.println("Array after calling changeArray::::");
		// for(int i=0;i<5;i++){
		// 	for(int j=0;j<4;j++){
		// 		System.out.print(arr2d2[i][j]+" ");
		// 	}
		// 	System.out.println("\n");
		// }

		


		// Arrays of Object References
		String str="Shubham";
		String[] str_arr=new String[5];
		for(int i=0;i<5;i++){
			str_arr[i]=str;
		}
		System.out.println(str_arr[2].concat("Accessing"));
		System.out.println(str_arr[3]);	
		
		str=str.concat(" Sharma ");// Here only str lost the contact to shubham
		// But 5 references are still able to get to "Shubham"
		// So displaying str_arr[any_index] =---> will give us "Shubham"
		Student[] stu_arr=new Student[5];//Array of 5 student REFERENCES
		// And they all are still null
		for (int i=0;i<5 ;i++ ) {
			stu_arr[i]=new Student();
		}
		// System.out.println(stu_arr[5]);
		

		// Assignments in Array
		int[] my_arr1=new int[5];
		my_arr1[2]='3'; // OK!!! Because my_arr is an int array and can store a char
		// my_arr1[0]=3.5; // NOT OKAY.....3.5 is a double and int is not enough to hold it
		char[] my_arr2; // A char array reference
		// my_arr2=my_arr1; // NOT OKAY....char[] reference cannot be assigned an int[]
		int[] my_arr3;
		my_arr3=my_arr1; // OKAY because int[] reference can refer to an int[] array
		Person[] person_arr=new Person[5];
		person_arr[0]=new Employee(); // Fine because Person can hold Employee object
		Employee[] emp=new Employee[5];
		// emp[0]=new Person(); // WON't COMPILE because Employee cannot hold a person
		// Person[] p1=new Person[2];
		// Employee[] e2;
		// e2=p1; // Person[] array cannot be converted to Employee[]
		Employee[] e=new Employee[5];
		Person[] p;
		p=e; // In case of References(non primitives).. A Parent[] reference can hold a child[]

		int[] int_ref;
		char[] ch_arr=new char[5];
		int_ref=ch_arr; // WE CAN CONVERT char to int but Arrays ki baat hi kuch aur hai
 	}

}
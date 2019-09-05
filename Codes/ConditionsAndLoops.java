public class ConditionsAndLoops{
	public static void main(String[] args) {
	
		int x=1;
		if(x==1){ // If can be used alone
			System.out.println("X is 1");
		}

		if(x>1){
			System.out.println("X is 1");
		}
		else{ // else cannot be alone
			System.out.println("X is NOT GREATER THAN 1");
		}

		// You can combine conditions using AND(&&) OR(||) and NOT(!)

		int y=20;
		if(x==1){


		}
		else if(x==2){

		}
		else if(x==3){

		}
		else{

		}
		
		// Loops  :s
		// while loop(Entry controlled loop)...May not even run once
		
		// In while loop initialization happens outside the loop,and test begins
		// Update or iteration of variable being used in test must be inside the loop
		// Else there will be an infinite loop
		// while(){
		// 	System.out.println("X is one in while loop");
		// 	y--;// Change the variable so that loop ends
			
		// }



		// do while(Exit Controlled Loop)....Will execute atleast once
		// Inititialization should also be outside the loop
		// int xa=10;
		// do{
		// 	System.out.println("Hello");

		// 	//Updation or iteration(changing the variable being tested)
		

		// 	// xa--;
		// }while(xa!=10);






		// // for loop
		// It's legal to have a for loop like for(;;){ }
		// // Scope of initialization in for loop is limited to for only


		// for(int xa=10,l=2,c=5;xa>=0 && l==2;xa--,l++){
		// 	System.out.println("Hello");
		// 	c++;
			
		// }
		// int i=0;
		// for(;i<10;i++) // Legal and it works but you cannot access i after it
		// {
		// 	System.out.println("Inside loop...I guess :-P");
		// }
		// System.out.println(i);
		// You cannot use xa here(outside the loop)

		// // for each loop - for arrays and collections
		// for(:){

		// }
		// break and continue(break takes you out of immediate loop, and continue skips
		// the rest of the loop and moves to next iteration)
		// unlabelled break,unlablled continue 
		// for(int m=1;m<=20;m++){
		// 	System.out.println("Inside loop");
		// 	if(m>10){
		// 		continue;
		// 	}
		// 	System.out.println("After if statement");
		// }

		// Break and Continue in nested fors
		for(int m=1;m<=5;m++){
			System.out.println("Inside the outer loop m="+m);
			for(int n=3;n>=1;n--){

				System.out.println("SHUBHAM n="+n);

			}
		}

	}
}


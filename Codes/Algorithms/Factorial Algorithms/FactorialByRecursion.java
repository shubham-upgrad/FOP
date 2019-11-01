import java.util.Scanner;

/*
    if(n==0) --> c
    * ---> c
    -  ---> c   
    T(n) = T(n-1) + 3*c
    T(n-1) = T(n-2) + 3*c
    T(n-2)= T(n-3) + 3*c
    T(n-3)= T(n-4) + 3*c
    .
    .

    T(n) =T(n-2) + 2*(3c) 
    T(n) =T(n-3) + 3*(3c)
    T(n) =T(n-4) + 4*(3c)
    .
    .
    .
    T(n) = T(n-k)+ k*(3c)
    T(0) = c2 // Base case time
    n-k=0
    n=k
    T(n) = T(0) + n*3c
    T(n) = n*C + C2 = O(n)
*/

public class FactorialByRecursion {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive no: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is : " + factorial(n));
    }
}
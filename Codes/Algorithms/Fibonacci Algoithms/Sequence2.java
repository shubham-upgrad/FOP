import java.util.Scanner;
public class Sequence2 {
    public void fibonacci(int n) {
        int[] f = new int[n+1]; // Allocating n+1 size array
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++)
            f[i]=(f[i-1]+f[i-2])%10;
        System.out.println("Fibonacci number : "+f[n]);
    }
    public static void main(String args[]) {
        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // We are taking an integer
        Sequence2 sequence = new Sequence2();
        sequence.fibonacci(n);
    }
}

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
            int n;
            try (Scanner sc = new Scanner(System.in)) {
                n = sc.nextInt();
            }
		int fib = fibo(n);
		System.out.println(fib);
	}
	static int fibo(int n)
	{
		if(n==1 || n==2)
		{
			return 1;
		}
		else
		{
			return fibo(n-1) + fibo(n-2);
		}
	}
}
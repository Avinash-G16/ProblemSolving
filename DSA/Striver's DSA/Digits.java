import java.util.Scanner;

public class Digits
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int c=0;
            while(n!=0)
            {
                c++;
                n/=10;
            }   System.out.println(c);
            // int cnt = (int) (Math.log10(n) + 1);
            // System.out.println(cnt);
        }
    }
}
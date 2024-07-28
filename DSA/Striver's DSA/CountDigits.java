import java.util.Scanner;

public class CountDigits 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cd = countDigits(n);
        System.out.println(cd);
        sc.close();
    }
    static int countDigits(int n)
    {
        int c=0;
        int temp = n;
        while(temp!=0)
        {
            int dgt = temp%10;
            if(n%dgt==0)
            {
                c++;
            }
            temp/=10;
        }
        return c;
    }
}

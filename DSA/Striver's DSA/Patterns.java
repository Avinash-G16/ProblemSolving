import java.util.Scanner;

public class Patterns
{
    static void pattern22(int n)
    {
        for(int i=1;i<=2*n-1; i++)
        {
            for(int j=1;j<=2*n-1; j++)
            {
                int top=i-1, left=j-1, right=2*n-1-j, bottom=2*n-1-i;
                System.out.print(n-Math.min(Math.min(top, bottom),Math.min(right, left)));
            }
            System.out.println();
        }
    }
    static void pattern21(int n)
    {
        for(int i=1; i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=1; j<=n; j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=1; j<=n;j++)
                {
                    if(j==1 || j==n)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    static void pattern20(int n)
    {
        int stars, space;
        space = 2*(n-1);
        for(int i=1; i<=2*n-1; i++)
        {
            if(i>n)
            {
                stars = 2*n-i;
            }
            else
            {
                stars = i;
            }
            for(int j=1; j<=stars; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++)
            {
                System.out.print("*");
            }
            if(i>=n)
            {
                space+=2;
            }
            else
            {
                space-=2;
            }
            System.out.println();
        }
    }
    static void pattern19(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=2*(i-1); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int space = 2*n-2;
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j=1; j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            space-=2;
        }
    }
    static void pattern18(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(char c= (char)(n-i+'A'); c < n+'A'; c++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    static void pattern17(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            char ch='A';
            for(int j=1; j<=2*i-1; j++)
            {
                System.out.print(ch);
                if(j>=i)
                {
                    ch--;
                }
                else{
                    ch++;
                }
            }
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern16(int n)
    {
        char ch = 'A';
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
    static void pattern15(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(char j='A'; j<=n-i+'A'; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern14(int n)
    {
        char c = 'A';
        for(int i=1; i<=n; i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(c+j)+" ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n)
    {
        int c=1;
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    static void pattern12(int n)
    {
        for(int i=1;i<=n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=1; j <= 2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern11(int n)
    {
        int start;
        for(int i = 1; i<=n; i++)
        {
            if(i%2==0)
            {
                start = 0;
            }
            else
            {
                start = 1;
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    static void pattern10(int n)
    {
        for(int i = 1; i<=2*n-1; i++)
        {
            int stars = i;
            if(i>n)
            {
                stars = 2*n - i;
            }
            for(int j=1; j<=stars; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n)
    {
        pattern7(n);
        pattern8(n);
    }
    static void pattern8(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j = 1; j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)+1;k++)
            {
                System.out.print("*");
            }
            for(int j = 1; j<=i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++)
            {
                System.out.print("*");
            }
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j = 1; j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n)
    {
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=n-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows for pattern: ");
            int n = sc.nextInt();
            pattern22(n);
            System.out.println();
            pattern21(n);
            System.out.println();
            pattern20(n);
            System.out.println();
            pattern19(n);
            System.out.println();
            pattern18(n);
            System.out.println();
            pattern17(n);
            System.out.println();
            pattern16(n);
            System.out.println();
            pattern15(n);
            System.out.println();
            pattern14(n);
            System.out.println();
            pattern13(n);
            System.out.println();
            pattern12(n);
            System.out.println();
            pattern11(n);
            System.out.println();
            pattern10(n);
            System.out.println();
            pattern9(n);
            System.out.println();
            pattern8(n);
            System.out.println();
            pattern7(n);
            System.out.println();
            pattern6(n);
            System.out.println();
            pattern5(n);
            System.out.println();
            pattern4(n);
            System.out.println();
            pattern3(n);
            System.out.println();
            pattern2(n);
            System.out.println();
            pattern1(n);
        }
    }
}
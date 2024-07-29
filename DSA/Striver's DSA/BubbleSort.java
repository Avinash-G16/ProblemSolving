import java.util.Scanner;

public class BubbleSort 
{
    static int[] bubbleSort(int[] array, int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            int flag = 0;
            for(int j=0;j<=i-1; j++)
            {
                if(array[j]>array[j+1])
                {
                    array[j] = array[j+1]+array[j];
                    array[j+1] = array[j]-array[j+1];
                    array[j] = array[j]-array[j+1];
                    flag = 1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        return array;
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size: ");
            int n = sc.nextInt();
            System.out.println("Enter array elements: ");
            int[] array = new int[n];
            for(int i=0; i<n; i++)
            {
                array[i] = sc.nextInt();
            }
            System.out.println("Before sorting: ");
            for(Integer a : array)
            {
                System.out.print(a+" ");
            }
            array = bubbleSort(array, n);
            System.out.println("\nAfter sorting: ");
            for(Integer a : array)
            {
                System.out.print(a+" ");
            }
        }
    }   
}

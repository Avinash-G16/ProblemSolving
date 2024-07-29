import java.util.Scanner;

public class InsertionSort
{
    static int[] insertionSort(int[] array, int n)
    {
        for(int i=1;i<n;i++)
        {
            int j = i;
            while(j>0 && array[j-1]>array[j])
            {
                array[j-1] = array[j-1] + array[j];
                array[j] = array[j-1] - array[j];
                array[j-1] = array[j-1] - array[j];
                j--;
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
            array = insertionSort(array, n);
            System.out.println("\nAfter sorting: ");
            for(Integer a : array)
            {
                System.out.print(a+" ");
            }
        }
    }
}
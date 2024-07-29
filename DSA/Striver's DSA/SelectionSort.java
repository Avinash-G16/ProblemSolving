import java.util.Scanner;

public class SelectionSort 
{
    static int[] selectionSortMethod(int[] array, int n)
    {
        for(int i = 0; i<n-1; i++)
        {
            int min = i;
            for(int j = i; j<n; j++)
            {
                if(array[j]<array[min])
                {
                    min = j;
                }
            }
            if(min!=i)
            {
                array[min] = array[min] + array[i];
                array[i] = array[min] - array[i];
                array[min] = array[min] - array[i];
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
            array = selectionSortMethod(array, n);
            System.out.println("\nAfter sorting: ");
            for(Integer a : array)
            {
                System.out.print(a+" ");
            }
        }
    }
}

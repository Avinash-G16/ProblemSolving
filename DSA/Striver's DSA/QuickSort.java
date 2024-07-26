import java.util.Scanner;

public class QuickSort
{
    static void quickSort(int[] array, int low, int high)
    {
        if(low<high)
        {
            int pindex = partition(array, low, high);
            quickSort(array, low, pindex-1);
            quickSort(array, pindex+1, high);
        }
    }
    static int partition(int[] array, int low,int high)
    {
        int pivot = array[low];
        int i = low;
        int j = high;
        while(i<j)
        {
            while(i<=high && array[i]<=pivot)
            {
                i++;
            }
            while(j>=low && array[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[j];
        array[j] = array[low];
        array[low] = temp;
        return j;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
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
        quickSort(array, 0, n-1);
        System.out.println("\nAfter sorting: ");
        for(Integer a : array)
        {
            System.out.print(a+" ");
        }
        sc.close();
    }
}
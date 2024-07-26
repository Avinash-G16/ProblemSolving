import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort
{
    static void mergeSort(int[] array, int low, int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    }
    static void merge(int[] array, int low, int mid, int high)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int i = low;
        int j = mid+1;
        while(i<=mid && j<=high)
        {
            if(array[i]<=array[j])
            {
                temp.add(array[i]);
                i++;
            }
            else
            {
                temp.add(array[j]);
                j++;
            }
        }
        while(i<=mid)
        {
            temp.add(array[i]);
            i++;
        }
        while(j<=high)
        {
            temp.add(array[j]);
            j++;
        }
        for(int k=low; k<=high;k++)
        {
            array[k] = temp.get(k-low);
        }
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
        mergeSort(array, 0, n-1);
        System.out.println("\nAfter sorting: ");
        for(Integer a : array)
        {
            System.out.print(a+" ");
        }
        sc.close();
    }
}
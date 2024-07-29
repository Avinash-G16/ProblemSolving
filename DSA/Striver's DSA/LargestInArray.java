import java.util.Scanner;

public class LargestInArray
{
    public static void main(String args[])
    {
        int[] array;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            array = new int[n];
            System.out.print("Enter array Elements: ");
            for(int i=0; i<n;i++)
            {
                array[i] = sc.nextInt();
            }
        }
        int largest = largestElement(array);
        System.out.println("Largest: "+largest);
    }
    static int largestElement(int[] array)
    {
        int large = array[0];
        for(int i=1; i<array.length; i++)
        {
            if(array[i]>large)
            {
                large = array[i];
            }
        }
        return large;
    }
}
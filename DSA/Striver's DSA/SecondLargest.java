import java.util.Scanner;

public class SecondLargest 
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] array = new int[n];
            System.out.print("Enter array Elements: ");
            for(int i=0; i<n;i++)
            {
                array[i] = sc.nextInt();
            }
            int secondlargest = secondLargestElement(array);
            System.out.println("Second Largest: "+secondlargest);
        }
    }
    static int secondLargestElement(int[] array)
    {
        int large = array[0];
        int seclarge = -1;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>large)
            {
                seclarge = large;
                large = array[i];
            }
            else if(array[i]>seclarge && array[i]!=large)
            {
                seclarge = array[i];
            }
        }
        return seclarge;
    }
}

import java.util.*;

class PassedBy {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking count of total testcases
        int t = sc.nextInt();
        while (t-- > 0) {
            // taking n
            int n = sc.nextInt();

            PB.printTable(n);
        }
        sc.close();
    }
}
// } Driver Code Ends

// User function Template for Java
class PB {
    static void printTable(int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            System.out.print(n * multiplier + " ");
            multiplier--;
            // Your code here
        }
        System.out.println();
    }
}
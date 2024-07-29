import java.util.*;

public class GFG {
	public static void main (String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int t=sc.nextInt();
                while(t-->0)
                {
                    int n =sc.nextInt();
                    Wh.printTable(n);
                }
            }
		
	}
}
class Wh {
	 static void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                System.out.print(n*multiplier+" ");
                multiplier--;
            }
       System.out.println();
	 }
}
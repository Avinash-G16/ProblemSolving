import java.util.*;
class PassedBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            PB.printTable(n);
        }
        sc.close();
    }
}
class PB {
    static void printTable(int n) {
        int multiplier = 10;
        while (multiplier > 0) {
            System.out.print(n * multiplier + " ");
            multiplier--;
        }
        System.out.println();
    }
}
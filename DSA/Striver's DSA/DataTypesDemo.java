import java.io.*;
import java.util.*;

public class DataTypesDemo {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            while (T-- > 0) {
                sc.nextLine();
                String s = sc.next();
                int ans = Solution.dataTypeSize(s);
                String Character = "Character";
                if (Character.equals(s) && ans == 2) {
                    ans = 1;
                }
                System.out.println(ans);
            }
        }
    }
}

class Solution {
    static int dataTypeSize(String str) {
        return switch (str) {
            case "Character" -> 1;
            case "Integer" -> 4;
            case "Long" -> 8;
            case "Float" -> 4;
            case "Double" -> 8;
            default -> -1;
        };
    }
}
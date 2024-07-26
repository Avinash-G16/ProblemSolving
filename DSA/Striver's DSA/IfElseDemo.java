import java.io.*;

class IfElseDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int m;
            m = Integer.parseInt(br.readLine());

            String res = If.compareNM(n, m);

            System.out.println(res);

        }
    }
}

// } Driver Code Ends
// User function Template for Java
class If {
    public static String compareNM(int n, int m) {
        // code here
        if (n == m) {
            return "equal";
        } else if (n > m) {
            return "greater";
        } else {
            return "lesser";
        }
    }
}
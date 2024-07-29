import java.io.*;
public class Switch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n;
            n = Integer.parseInt(br.readLine());  
            int m;
            m = Integer.parseInt(br.readLine()); 
            String res = Swit.compareNM(n, m);
            System.out.println(res);
        }
    }
}
class Swit {
    public static String compareNM(int n, int m) {
        if(n==m)
        {
            return "equal";
        }
        else if(n>m)
        {
            return "greater";
        }
        else
        {
            return "lesser";
        }
    }
}
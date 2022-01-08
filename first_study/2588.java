 
import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) {
           FastReader fr = new FastReader();
           int a = fr.nextInt(); //3자리수 입력
           int b = fr.nextInt();
           int c1 = a* (b%10); //1의 자리는 10 나눠서 나머지
           int c2 = a * ((b%100)/10); //십의 자리 100나눠서 10으로 나눈 몫
           int c3 = a * (b/100);
           int addd = a*b;
           System.out.println(c1);
           System.out.println(c2);   
           System.out.println(c3);   
           System.out.println(addd);            
         
           
          
           
           
           
     }
       public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}

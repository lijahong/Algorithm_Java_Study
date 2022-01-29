import java.io.*;
import java.util.*;
public class Main{
  static Integer[][] ary =  new Integer[41][2];

  static Integer[] fibo(int n){
    
    if(ary[n][0] == null || ary[n][1] == null){
      ary[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
      ary[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
    }
    return ary[n];
  }


  public static void main(String[] args){
    FastReader fr = new FastReader();
    int a = fr.nextInt();
    ary[0][0] = 1;
    ary[0][1] = 0;
    ary[1][0] = 0;
    ary[1][1] = 1;
    
    for(int i = 0; i< a; i++){
      int b = fr.nextInt();
      fibo(b);
      System.out.println(ary[b][0] + " " + ary[b][1]);
    }

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

import java.io.*;
import java.util.*;
public class Main{
  
  public static int[][][] d = new int[50][50][50];
  public static int w(int a, int b, int c){
    if( a <= 0 || b <= 0 || c <= 0)
      return 1;

    if (a > 20 || b > 20 || c > 20)
      return w(20, 20, 20);

    if(d[a][b][c] != 0)
      return d[a][b][c];
    else{
     if(a<b && b<c){
       d[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        return  d[a][b][c];
      }else{
        d[a][b][c] =w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
       return d[a][b][c];
      }
    }
  }

  public static void main(String[] args){
    FastReader fr = new FastReader();
    while(true){
    int a = fr.nextInt();
    int b = fr.nextInt();
    int c = fr.nextInt();
    if(a == -1 && b == -1 && c == -1){
      break;
    }else System.out.println("w("+a + ", "+b+", "+c+") = "+ w(a,b,c));
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

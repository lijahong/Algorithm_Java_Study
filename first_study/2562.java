import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader fr = new FastReader(); 
        int a = 9;
        int maxi = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i <a; i++){
          int x = fr.nextInt();
          arrayList.add(x);
        }
        
        int max = Collections.max(arrayList);
        for(int i =0; i<a;i++){
          if( arrayList.get(i) == max){
              maxi = (i+1);
          }

        }
        System.out.println(max);
        System.out.println(maxi);
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

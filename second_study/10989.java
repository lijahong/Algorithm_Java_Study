import java.util.*;
import java.io.*;
//계수정렬
public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        
        int[] cnt = new int[10001];
        int n = fr.nextInt();
        StringWriter stringWriter = new StringWriter();
        BufferedWriter buffWriter = new BufferedWriter(stringWriter);
        for(int i = 0; i<n; i++){
          int x = fr.nextInt();
          cnt[x]++; //데이터의 인덱스에 해당하는 수를 증가
        }
        for(int i = 0; i< 10001; i++){
          for(int j =0; j<cnt[i]; j++){
              buffWriter.write( i + '\n');
          }
        }
        buffWriter.flush();
        System.out.println(stringWriter.getBuffer());
        
        
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

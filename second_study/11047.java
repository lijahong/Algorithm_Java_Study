//그리디 알고리즘 - 동전문제

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        
        int n = fr.nextInt();
        int k = fr.nextInt();

        ArrayList<Integer> coins = new ArrayList<>();
        //동전 리스트
        for(int i =0;i<n;i++){
          int x = fr.nextInt();
          coins.add(x);
        }   
        int result = 0;
      //금액에서 동전 큰거부터 비교해가며 나누고, 나머지를 k로 저장
        for(int i =n-1; i>=0;i--){
          result += k/coins.get(i);
          k %= coins.get(i);
        }
        System.out.println(result);
        
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

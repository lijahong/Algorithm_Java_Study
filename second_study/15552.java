//버퍼에 담았다가 한번에 출력하는 방법으로 시간초과에 대비하는 출력법

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();

        StringWriter stringWriter = new StringWriter();
        BufferedWriter buffWriter = new BufferedWriter(stringWriter);
  
        int testCases = fr.nextInt();
        for (int tc = 0; tc < testCases; tc++) {
            int a = fr.nextInt();
            int b = fr.nextInt();
            buffWriter.write((a + b) + "\n"); //버퍼에 기록
        }
        // Flush the buffer writer
        buffWriter.flush(); //출력 스트림을 비우고, 버퍼에 기록된 데이터를 강제 입력
        System.out.println(stringWriter.getBuffer()); //한번에 출력
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

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            FastScanner sc = new FastScanner();
            int T = 1;
            while (T-- > 0) {
                // Write Your Code...
                int n = sc.nextInt();
                int k = sc.nextInt();
                for(int i=0;i<k;i++){
                    String s = String.valueOf(n);
                    if(s.charAt(s.length() - 1) == '0'){
                        n = n/10;
                    }
                    else{
                        n = n-1;
                    }
                }
                System.out.println(n);
            }
        } catch (Exception e) {
            //
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] readLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
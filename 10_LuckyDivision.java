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
                String str = sc.next();
                boolean flag = false;
                int count = 0;
                for(int i=0;i<str.length();i++){
                    char ch = str.charAt(i);
                    if(ch == '4' || ch == '7'){
                        count++;
                    }
                }
                if(count == str.length()){
                    flag = true;
                }
                if(Integer.parseInt(str) % 4 == 0) flag = true;
                if(Integer.parseInt(str) % 7 == 0) flag = true;
                if(Integer.parseInt(str) % 47 == 0) flag = true;
                if(Integer.parseInt(str) % 477 == 0) flag = true;
                if(flag) System.out.println("YES");
                else System.out.println("NO");
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
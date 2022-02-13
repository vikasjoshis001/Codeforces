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
                String S = sc.next();
                StringBuilder str = new StringBuilder("hello");
                for(int i=0;i<S.length();i++){
                    char ch = S.charAt(i);
                    if(ch == str.charAt(0)){
                        str.deleteCharAt(0);
                    }
                    if(str.toString().equals("")){
                        break;
                    }
                }
                if(str.toString().equals("")){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
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
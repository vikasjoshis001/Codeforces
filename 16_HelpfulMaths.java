import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            FastScanner sc = new FastScanner();
            int T = Integer.parseInt(sc.next());
            while (T-- > 0) {
                // Write Your Code...
                String str = sc.next();
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if(ch != '+'){
                        arr.add((int) ch);
                    }
                }
                Collections.sort(arr);
                String ans = "";
                for (int i = 0; i < arr.size(); i++) {
                    ans+= (char) arr.get(i);
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
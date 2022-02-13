import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CodeForces {
    public static void main(String[] args) {
        try {
            FastScanner sc = new FastScanner();
            // int T = Integer.parseInt(sc.next());
            // while (T-- > 0) {
            // }
            int n =sc.nextInt();
            int k =sc.nextInt();
            int arr[] = sc.readArray(n);
            int count  = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >0 && arr[i] >= arr[k-1]){
                    count++;
                }
            }
            System.out.println(count);
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
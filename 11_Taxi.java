import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            FastScanner sc = new FastScanner();
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int freq[] = new int[5];
            for(int i=0;i<5;i++){
                freq[i] = 0;
            }
            for(int i=0;i<n;i++){
                freq[arr[i]]++;
            }
            
            System.out.print(freq[4]+freq[3]+(Math.max(0,freq[1]-freq[3])+freq[2]*2+3)/4);

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
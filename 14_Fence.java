import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            FastScanner sc = new FastScanner();
           int n = sc.nextInt();
           int k =sc.nextInt();
           int arr[] = sc.readArray(n);
           int add[]  =  new int[n],mi=1,sum=0,min=0;
           for (int i = 0; i<k; i++) {
               sum+= plank[i];
           }
           min=sum;
           for (int i = k; i < n; i++) {
               sum+= plank[i] - plank[i-k];
               if(sum<min){
                   min=sum;
                   mi=i -k+2;
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
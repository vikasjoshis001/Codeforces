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
                String s = sc.next();
                int arr[] = new int[2];
                Arrays.fill(arr,0);
                if(s.length() == 1){
                    System.out.println(0);
                }
                else{
                    for (int i = 0; i < s.length()-1; i++) {
                        if(s.charAt(i) == '0') arr[0]++;
                        else arr[1]++;
                    }
                    if (arr[0] == arr[1])
                        System.out.println(arr[0]-1);
                    else
                        System.out.println(Math.min(arr[0], arr[1]));
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
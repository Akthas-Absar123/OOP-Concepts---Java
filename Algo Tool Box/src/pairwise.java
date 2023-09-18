import java.util.*;
import java.io.*;
public class pairwise {
    static long getMaxPairwiseProduct(long[] numbers) {
        long  max_product = 0;
        int n = numbers.length;
        for (int first = 0; first < n; ++first) {
            for (int second = first + 1; second < n; ++second) {
                max_product = Math.max(max_product,
                        numbers[first] * numbers[second]);
            }
        }
        return max_product;
    }
    public static void main(String[] args) {

        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        long startTime = System.currentTimeMillis(); // start measuring execution time
        long result = getMaxPairwiseProduct(numbers);
        long endTime = System.currentTimeMillis(); // end measuring execution time
        System.out.println(result);
        //System.out.println("Execution time: " + (endTime - startTime) + " ms");
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}


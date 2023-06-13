import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int k;
    private static int N;
    private static int[] arr;
    private static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        k = Integer.parseInt(str[0]);
        N = Integer.parseInt(str[1]);
        arr = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) max = arr[i];
        }
        max++;
        result = 0;
        dfs(1, max);

        System.out.println(result);
    }

    private static void dfs(long left, long right) {
        if (left > right) {
            return;
        }
        long mid = (left + right) / 2;
        long count = 0;

        for (int i = 0; i < arr.length; i++) {
            count += (arr[i] / mid);
        }
        if (count >= N) {
            result = Math.max(result, mid);
            dfs(mid + 1, right);
        } else {
            dfs(left, mid - 1);
        }
    }
}

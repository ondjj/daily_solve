import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = Integer.MAX_VALUE;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > k) {
                right = mid - 1;
                continue;
            }

            int coin = 0;
            int remainingAmount = k;
            while (remainingAmount > 0) {
                if (arr[mid] <= remainingAmount) {
                    coin += remainingAmount / arr[mid];
                    remainingAmount %= arr[mid];
                } else {
                    mid--;
                }
            }

            result = Math.min(result, coin);
            left++;
        }

        System.out.println(result);
        br.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine()); // 층 수 입력
            int n = Integer.parseInt(br.readLine()); // 호 수 입력

            int[][] dp = new int[k + 1][n + 1];

            // 0층의 i호에는 i명이 산다
            for (int i = 1; i <= n; i++) {
                dp[0][i] = i;
            }

            // k층의 n호에는 k-1층의 1호부터 n호까지의 사람 수의 합만큼 사람들을 데려와야 함
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
            System.out.println(dp[k][n]); // 결과 출력
        }

        br.close();
    }
}

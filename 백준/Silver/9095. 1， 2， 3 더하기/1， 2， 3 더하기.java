import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int answer;
    static int cnt;

    public void solution(int sum, int n) {
        if (sum == answer) {
            cnt++;
            return;
        }
        if (sum > answer || n < 0) return;

        solution(sum + 1, n - 1);
        solution(sum + 2, n - 2);
        solution(sum + 3, n - 3);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            answer = n;
            cnt = 0;
            T.solution(0, n);
            System.out.println(cnt);
        }
        br.close();
    }
}

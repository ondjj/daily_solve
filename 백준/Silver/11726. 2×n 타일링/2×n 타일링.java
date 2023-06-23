import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dy;
    static int n;
    public void solution(int x) {
        for (int i = x; i <= n; i++) {
            dy[i] = (dy[i-1] + dy[i-2]) % 10007;
        }
        System.out.println(dy[n]);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dy = new int[1001];
        dy[1] = 1;
        dy[2] = 2;
        T.solution(3);
        br.close();
    }
}

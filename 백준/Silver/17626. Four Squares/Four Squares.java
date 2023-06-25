import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] dy = new int[n + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);

        List<Integer> squares = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            squares.add(i * i);
        }
        dy[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int square : squares) {
                if (square > i) break;
                dy[i] = Math.min(dy[i], dy[i - square] + 1);
            }
        }
        System.out.println(dy[n]);
        br.close();
    }
}

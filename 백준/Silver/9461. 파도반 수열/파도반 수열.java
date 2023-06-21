import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] seq = new long[101];
    public void solution() {
        seq[1] = 1;
        seq[2] = 1;
        seq[3] = 1;

        for (int i = 4; i < 101; i++) {
            seq[i] = seq[i-2] + seq[i-3];
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T.solution();
        int n = Integer.parseInt(br.readLine());
        while(n --> 0){
            sb.append(seq[Integer.parseInt(br.readLine())]).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}

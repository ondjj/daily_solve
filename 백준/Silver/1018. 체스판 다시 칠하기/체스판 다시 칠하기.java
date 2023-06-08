import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static boolean[][] arr;
    public static final int SIZE = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = (str.charAt(j) == 'W');
            }
        }

        int N_row = N - SIZE + 1;
        int M_col = M - SIZE + 1;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N_row; i++) {
            for (int j = 0; j < M_col; j++) {
                int count = find(i, j);
                min = Math.min(min, count);
            }
        }
        System.out.println(min);
        br.close();
    }

    public static int find(int x, int y) {
        int end_x = x + SIZE;
        int end_y = y + SIZE;
        int count = 0;

        boolean TF = arr[x][y];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != TF) {
                    count++;
                }

                TF = !TF;
            }
            TF = !TF;
        }

        count = Math.min(count, SIZE * SIZE - count);

        return count;
    }
}

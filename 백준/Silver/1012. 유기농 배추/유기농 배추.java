import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int n, m, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] temp = br.readLine().split(" ");
            m = Integer.parseInt(temp[0]);
            n = Integer.parseInt(temp[1]);
            k = Integer.parseInt(temp[2]);

            graph = new int[m][n];
            visited = new boolean[m][n];

            for (int j = 0; j < k; j++) {
                String[] edge = br.readLine().split(" ");
                int x = Integer.parseInt(edge[0]);
                int y = Integer.parseInt(edge[1]);
                graph[x][y] = 1;
            }

            int cnt = 0;
            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    if (graph[x][y] == 1 && !visited[x][y]) {
                        dfs(x, y);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
        br.close();
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}

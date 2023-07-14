import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] node;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int vertex = Integer.parseInt(temp[0]);
        int edge = Integer.parseInt(temp[1]);
        node = new int[vertex + 1][vertex + 1];
        visited = new boolean[vertex + 1];

        for (int i = 0; i < edge; i++) {
            String[] info = br.readLine().split(" ");
            int a = Integer.parseInt(info[0]);
            int b = Integer.parseInt(info[1]);

            node[a][b] = node[b][a] = 1;
        }
        int count = 0;
        for (int i = 1; i <= vertex; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }

    private static void dfs(int n) {
        visited[n] = true;
        for (int i = 1; i < visited.length; i++) {
            if (node[n][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}

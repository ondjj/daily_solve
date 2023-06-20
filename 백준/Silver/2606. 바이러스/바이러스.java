import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Node {
        int data;
        LinkedList<Integer>[] adj;

        void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v);  // 양방향 연결 추가
        }
    }

    public int solution(Node node) {
        int count = 0;
        boolean[] visited = new boolean[node.adj.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;

            for (int adjNode : node.adj[current]) {
                if (!visited[adjNode]) {
                    queue.offer(adjNode);
                    visited[adjNode] = true;
                }
            }
        }
        return count - 1;  // 시작 노드인 1번 컴퓨터를 제외
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        Node graph = new Node();
        graph.adj = new LinkedList[n + 1];  // 노드의 개수에 따라 인접 리스트 생성
        for (int i = 1; i <= n; i++) {
            graph.adj[i] = new LinkedList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int data = Integer.parseInt(st.nextToken());
            int near = Integer.parseInt(st.nextToken());
            graph.addEdge(data, near);
        }

        int result = T.solution(graph);
        System.out.println(result);

        br.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if (!priorityQueue.isEmpty() && (m == 0)) {
                System.out.println(priorityQueue.poll());
            } else if (priorityQueue.isEmpty() && (m == 0)) {
                priorityQueue.offer(0);
                System.out.println(priorityQueue.poll());
            }else {
                priorityQueue.offer(m);
            }
        }
    }
}

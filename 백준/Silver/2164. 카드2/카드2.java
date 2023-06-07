import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=0; i<N; i++) deque.add(i+1);

        while (deque.size() != 1){
            deque.pop();
            int temp = deque.pop();
            deque.offerLast(temp);
        }
        System.out.println(deque.pop());
        br.close();
    }
}

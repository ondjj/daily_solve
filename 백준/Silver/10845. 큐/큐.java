import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> que = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++){
            String[] temp = br.readLine().split(" ");
            if (temp[0].equals("push")) {
                que.offer(Integer.parseInt(temp[1]));
            } else if (temp[0].equals("front") && que.size() == 0) {
                System.out.println("-1");
            } else if (temp[0].equals("front")) {
                System.out.println(que.peek());
            } else if (temp[0].equals("back") && que.size() == 0) {
                System.out.println("-1");
            } else if (temp[0].equals("back")) {
                List<Integer> arr = new ArrayList<>(que);
                System.out.println(arr.get(arr.size()-1));
            } else if (temp[0].equals("size")) {
                System.out.println(que.size());
            } else if (temp[0].equals("empty") && que.size() == 0) {
                System.out.println("1");
            } else if (temp[0].equals("empty")) {
                System.out.println("0");
            } else if (temp[0].equals("pop") && que.isEmpty()) {
                System.out.println("-1");
            } else if (temp[0].equals("pop")) {
                System.out.println(que.poll());
            }
        }
        br.close();
    }
}

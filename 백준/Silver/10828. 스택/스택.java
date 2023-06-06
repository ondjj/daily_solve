import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++){
            String[] temp = br.readLine().split(" ");
            if (temp[0].equals("push")){
                stack.push(Integer.parseInt(temp[1]));
            }else if(temp[0].equals("top") && stack.size() == 0){
                System.out.println("-1");
            } else if (temp[0].equals("top")) {
                System.out.println(stack.peek());
            } else if (temp[0].equals("empty") && stack.isEmpty()) {
                System.out.println("1");
            } else if (temp[0].equals("empty")) {
                System.out.println("0");
            }else if (temp[0].equals("size")){
                System.out.println(stack.size());
            } else if (temp[0].equals("pop") && stack.size() == 0) {
                System.out.println("-1");
            } else if (temp[0].equals("pop")) {
                System.out.println(stack.pop());
            }
        }
        br.close();
    }
}

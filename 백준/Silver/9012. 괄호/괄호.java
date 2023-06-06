import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            String ch = br.readLine();

            for (int j=0; j<ch.length(); j++){
                if (ch.charAt(j) == '('){
                    stack.push('(');
                }else {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(')');
                    }
                }
            }
            if (stack.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        br.close();
    }
}

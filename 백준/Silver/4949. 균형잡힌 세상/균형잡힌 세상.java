import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while (true) {
            line = br.readLine();
            if (line.equals(".")) {
                break;
            }
            sb.append(balance(line)).append('\n');
        }
        System.out.println(sb);
        br.close();
    }

    private static String balance(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < line.length(); i++) {
          char ch = line.charAt(i);
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return "no";
                else stack.pop();
            }
            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return "no";
                else stack.pop();
            }
        }
        if (stack.isEmpty()) return "yes";
        else return "no";
    }
}

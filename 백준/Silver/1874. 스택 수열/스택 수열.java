import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] origin = new int[T];
        boolean judge = false;

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Character> state = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr.add(temp);
            origin[i] = temp;
        }
        Collections.sort(arr);

        int lt=0; int rt = arr.size(); int i=0;
        while(lt < rt){
            if (stack.isEmpty() || stack.peek() != origin[lt]){
                if (i >= arr.size()){
                    judge = true;
                    break;
                }
                state.add('+');
                stack.push(arr.get(i));
                i++;
            }
            if (stack.peek() == origin[lt]){
                state.add('-');
                stack.pop();
                lt++;
            }
        }

        if (!judge) {
            for (char x : state) {
                System.out.println(x);
            }
        }else {
            System.out.println("NO");
        }
        br.close();
    }
}

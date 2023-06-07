import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int lt = 0;

        List<Integer> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }

        while (!arr.isEmpty()) {
            lt = (lt + K - 1) % arr.size();
            temp.add(arr.remove(lt));
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < temp.size(); i++) {
            sb.append(temp.get(i));
            if (i != temp.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb.toString());

        br.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < m; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String key = st.nextToken();
                if (map.containsKey(key)){
                    map.put(key, map.get(key) + 1);
                }else {
                    map.put(key, 1);
                }
            }
            int result = 1;

            for (int val : map.values()) {
                result *= (val + 1);
            }
            sb.append(result - 1).append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}

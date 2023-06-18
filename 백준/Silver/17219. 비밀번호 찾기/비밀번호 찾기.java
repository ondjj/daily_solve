import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String key = st.nextToken();
            String value = st.nextToken();
            map.put(key, value);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String find = st.nextToken();
            if (map.containsKey(find)){
                sb.append(map.get(find)+'\n');
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

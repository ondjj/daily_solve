import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> nameToNumber = new HashMap<>();
        Map<String, String> numberToName = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            String number = Integer.toString(i);
            nameToNumber.put(name, number);
            numberToName.put(number, name);
        }

        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                sb.append(numberToName.get(query)).append("\n");
            } else {
                sb.append(nameToNumber.get(query)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}

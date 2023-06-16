import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = 0; i < n + m; i++) {
            String temp = br.readLine();
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        for (Map.Entry<String, Integer> x : map.entrySet()) {
            if (x.getValue() > 1){
                arr.add(x.getKey());
                cnt++;
            }
        }
        Collections.sort(arr);
        System.out.println(cnt);
        for (String x : arr) {
            System.out.println(x);
        }
        bw.close();
        br.close();
    }
}

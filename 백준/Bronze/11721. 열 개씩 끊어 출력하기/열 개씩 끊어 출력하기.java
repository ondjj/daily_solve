import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        while(sb.length() >= 10){
            String temp = sb.substring(0, 10);
            sb.delete(0, 10);
            System.out.println(temp);
        }
        System.out.println(sb);
        br.close();
    }
}

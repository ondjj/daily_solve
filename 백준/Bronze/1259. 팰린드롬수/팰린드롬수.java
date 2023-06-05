import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String num = br.readLine();
            if (num.equals("0")) break;
            sb.append(num);
            sb.reverse();

            if (sb.toString().equals(num)) System.out.println("yes");
            else System.out.println("no");
            sb.delete(0, num.length());
        }
        br.close();
    }
}

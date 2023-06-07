import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());

        char[] temp = br.readLine().toCharArray();
        char[] small = new char[27];
        for (int i = 1; i < small.length; i++) {
            small[i] = (char) (96+i);
        }

        long hashing = 0L;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 1; j < small.length; j++) {
                if (temp[i] == small[j]){
                    hashing += (j * (Math.pow(31L,i))) % 1234567891;
                }
            }
        }
        System.out.println(hashing);
        br.close();
    }
}

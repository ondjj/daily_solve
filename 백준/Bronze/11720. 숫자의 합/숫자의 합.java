
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String number = in.next();
        int sum = 0;
        for (int i=0; i<number.length(); i++){
            char temp = number.charAt(i);
            sum += temp - '0';
        }
        System.out.println(sum);

        in.close();
    }
}

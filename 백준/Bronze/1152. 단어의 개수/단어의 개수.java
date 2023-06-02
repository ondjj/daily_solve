
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine().trim();
        String word = sentence.replaceAll(" ", "");
        int cnt = sentence.length() - word.length();

        if (sentence.equals("")) {
            System.out.println(0);
        }else{
            System.out.println(cnt+1);
        }

        in.close();
    }
}

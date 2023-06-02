import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String alphabet = in.nextLine();
        int[] including = new int[26];

        for (int i=0; i<26; i++){
            System.out.print(alphabet.indexOf('a' + i));
            System.out.print(" ");
        }

        in.close();
    }
}

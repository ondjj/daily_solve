import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ascending = "12345678";
        String descending = "87654321";
        StringBuilder answer = new StringBuilder();
        Scanner in = new Scanner(System.in);

        for (int i=1; i<9; i++){
            int T = in.nextInt();
            answer.append(T);
        }
        if (answer.toString().equals(ascending)){
            System.out.println("ascending");

        } else if (answer.toString().equals(descending)) {
            System.out.println("descending");

        }else {
            System.out.println("mixed");
        }
        in.close();
    }
}

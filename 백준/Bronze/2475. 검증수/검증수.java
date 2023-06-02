import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int validNumber = 0;
        for (int i=0; i<5; i++){
            int n = in.nextInt();
            validNumber += n*n;
        }
        validNumber = validNumber % 10;
        System.out.println(validNumber);

        in.close();
    }
}

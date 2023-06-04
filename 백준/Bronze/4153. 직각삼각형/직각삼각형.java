import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        while (true){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            if (a == 0 && b == 0 && c == 0){
                break;
            }

            if ((a * a + b * b) == c * c){
                System.out.println("right");
            } else if ((b * b + c * c) == a * a) {
                System.out.println("right");
            } else if ((c * c + a * a) == b * b) {
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}

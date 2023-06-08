import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int sum = 0;
        int sol = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int lt = 0 , rt=0;
        while(true){
            if(sum >= s){
                sum -= arr[lt];
                sol = Math.min(sol,(rt-lt));
                lt++;
            } else if (rt == n) {
                break;
            }else sum += arr[rt++];
        }
        if(sol == Integer.MAX_VALUE){
            System.out.println(0);
        }else {
            System.out.println(sol);
        }
    }
}

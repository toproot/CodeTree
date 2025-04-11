import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int even = 1;
        int odd = N;

        for(int i = 1; i < N*2+1; i++) {
            if (i%2 != 0) {
                for(int j = 0; j < odd; j++) {
                    System.out.print("* ");
                }
                odd -= 1;
            }else {
                for(int k =0; k < even; k++) {
                    System.out.print("* ");
                }
                even += 1;
            }
            System.out.println("");
        }
    }
}
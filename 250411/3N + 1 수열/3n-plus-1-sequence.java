import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        while(N != 1) {
            cnt++;
            if (N%2 == 0) {
                N /= 2;
            }else {
                N *= 3;
                N += 1;
            }

            if (N == 1) {
                break;
            }
        }
        System.out.print(cnt);

    }
}
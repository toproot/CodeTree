import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        

        for(int i = 0 ; i < M; i++) {
            int cnt = 0;
            int N = sc.nextInt();

            while (N > 0) {
                if (N == 1) {
                    System.out.println(cnt);
                    break;
                }else if (N % 2 == 0){
                    N /= 2;
                    cnt += 1;
                }else {
                    N *= 3;
                    N += 1;
                    cnt += 1;
                }
            }
        }
    }
}
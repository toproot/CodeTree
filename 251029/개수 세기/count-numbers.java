import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            int iNum = sc.nextInt();
            if(iNum == M) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
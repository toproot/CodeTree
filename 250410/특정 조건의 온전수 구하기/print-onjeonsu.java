import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++) {
            if (i%2 == 0 || i%10 == 5 || (i%3 == 0 && i%9 != 0)) {
                continue;
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
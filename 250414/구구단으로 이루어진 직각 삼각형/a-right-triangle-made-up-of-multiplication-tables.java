import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = N;

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= cnt; j++) {
                System.out.print(i + " * " + j + " = " + i*j);
                if(j < cnt) {
                    System.out.print(" / ");
                }
            }
            cnt--;
            System.out.println("");
        }
    }
}
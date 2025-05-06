import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] iList = new int[10];

        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();
            iList[n] += 1;
        }

        for(int i = 1; i < 10; i++) {
            System.out.println(iList[i]);
        }
    }
}
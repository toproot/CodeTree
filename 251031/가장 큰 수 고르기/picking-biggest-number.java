import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        final int INT_MIN = Integer.MIN_VALUE;
        int maxVal = INT_MIN;

        for(int i = 0; i < 10; i++) {
            int N = sc.nextInt();
            if (N > maxVal) {
                maxVal = N;
            }
        }

        System.out.println(maxVal);
    }
}
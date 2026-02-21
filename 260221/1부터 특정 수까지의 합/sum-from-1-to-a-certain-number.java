import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int iSum = add(1, N);

        System.out.print(iSum / 10);

    }

    public static int add(int a, int b) {
        int iSum = 0;
        for(int i = a; i <= b; i++) {
            iSum += i;
        }

        return iSum;
    }
}
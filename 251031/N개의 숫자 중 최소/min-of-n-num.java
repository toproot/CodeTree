import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        final int INT_MAX = Integer.MAX_VALUE;
        int minValue = INT_MAX;

        int[] iList = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            int iNum = sc.nextInt();
            iList[i] = iNum;

            if(iNum < minValue) {
                minValue = iNum;
            }
        }

        for(int i = 0; i < N; i++) {
            if(iList[i] == minValue) {
                cnt++;
            }
        }

        System.out.print(minValue);
        System.out.print(" ");
        System.out.print(cnt);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];
        int iSum = 0;
        double iAvg = 0;
        int iCnt = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            iArr[i] = n;
            iSum += n;
            iCnt++;
        }

        iAvg = (double)iSum / iCnt;

        System.out.printf(iSum + " %.1f", iAvg);
    }
}
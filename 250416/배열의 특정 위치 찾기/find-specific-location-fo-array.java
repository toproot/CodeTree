import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] iArr = new int[10];
        int iEvenSum = 0;
        int iThreeSum = 0;
        int iThreeCnt = 0;
        double dThreeAvg = 0;

        for(int i = 0; i < 10; i++) {
            iArr[i] = sc.nextInt();
        }

        for(int j = 1; j <= 10; j++) {
            if (j%2 == 0) {
                iEvenSum += iArr[j-1];
            }

            if(j%3 == 0) {
                iThreeSum += iArr[j-1];
                iThreeCnt++;
            }
        }

        dThreeAvg = (double)iThreeSum / iThreeCnt;
        System.out.printf(iEvenSum + " %.1f", dThreeAvg);
    }
}
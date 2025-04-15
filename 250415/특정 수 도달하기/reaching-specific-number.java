import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];
        for(int i = 0; i < 10; i++) {
            iArr[i] = sc.nextInt();
        }

        int iSum = 0;
        int iCnt = 0;
        int iAvg = 0;
        for(int j = 0; j < iArr.length; j++) {
            if (iArr[j] >= 250) {
                break;
            }
            iSum += iArr[j];
            iCnt++;
        }

        System.out.printf(iSum + " %.1f", (double)iSum/iCnt);
    }
}
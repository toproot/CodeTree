import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];
        int iCnt = 0;
        int iSum = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }
            iArr[i] = n;

            if(n%2 == 0) {
                iSum += n;
                iCnt++;
            }
        }

        System.out.print(iCnt + " " + iSum);
    }
}
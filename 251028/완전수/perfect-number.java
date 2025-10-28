import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iStart = sc.nextInt();
        int iEnd = sc.nextInt();
        int iCnt = 0;

        for(int i = iStart; i < iEnd; i++) {
            int iSum = 0;
            for(int j = 1; j < i; j++) {
                if (i % j == 0) {
                    iSum += j;
                }
            }
            if (iSum == i) {
                iCnt++;
            }
        }

        System.out.println(iCnt);
    }
}
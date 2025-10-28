import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
       Scanner sc = new Scanner(System.in);
        int iStart = sc.nextInt();
        int iEnd = sc.nextInt();

        int iResult = 0;

        for(int i = iStart; i < iEnd; i++) {
            int iCnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    iCnt++;
                }
            }
            if (iCnt == 3) {
                iResult++;
            }
        }
        System.out.println(iResult); 
    }
}
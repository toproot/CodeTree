import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int iCnt = 0;
        while(true) {
            if (iCnt == 3) {
                break;
            }

            int iNum = sc.nextInt();

            if (iNum % 2 == 0) {
                System.out.println(iNum / 2);
                iCnt++;
            }
        }
    }
}
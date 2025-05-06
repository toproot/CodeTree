import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] iList = new int[2];
        int cnt = 0;
        int evenCnt = 0;
        int n = sc.nextInt();

        while(true) {
            cnt++;
            System.out.print((n * cnt) + " ");
            if((n * cnt)%5 == 0) {
                iList[evenCnt] = (n*cnt);
                evenCnt++;
            }

            if(evenCnt == 2) {
                break;
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int iNum = N;
        int iResult = 0;

        while(iNum > 0) {
            if (N % iNum == 0) {
                iResult++;
            }
            iNum--;
        }

        if (iResult > 2) {
            System.out.println("C");
        }else {
            System.out.println("P");
        }
    }
}
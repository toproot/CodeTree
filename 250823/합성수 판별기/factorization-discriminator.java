import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int iNum = N-1;
        String result = "N";
        while (iNum > 1) {
            if (N % iNum == 0) {
                result = "C";
            }
            iNum--;
        }

        System.out.print(result);
    }
}
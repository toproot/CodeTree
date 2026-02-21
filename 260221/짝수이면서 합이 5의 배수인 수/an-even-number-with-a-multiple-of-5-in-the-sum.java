import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        boolean result = isMagicNumber(n);
        if (result) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }

    public static boolean isMagicNumber(int n) {
        boolean bReturn = false;

        if(n % 2 == 0) {
            int i10Num = n / 10;
            int i1Num = n % 10;

            if ((i10Num + i1Num) % 5 == 0) {
                bReturn = true;
            }
        }

        return bReturn;
    }
}
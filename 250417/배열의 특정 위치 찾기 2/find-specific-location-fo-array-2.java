import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int iEvenSum = 0;
        int iOddSum = 0;

        for(int i = 1; i <= 10; i++) {
            int n = sc.nextInt();
            if(i%2 != 0) {
                iEvenSum += n;
            }else {
                iOddSum += n;
            }
        }

        if(iEvenSum > iOddSum) {
            System.out.print(iEvenSum - iOddSum);
        }else if(iEvenSum < iOddSum) {
            System.out.print(iOddSum - iEvenSum);
        }
    }
}
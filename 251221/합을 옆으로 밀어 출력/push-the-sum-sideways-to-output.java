import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int iSum = 0;

        for(int i = 0; i < N; i++) {
            iSum += sc.nextInt();
        }

        String str = Integer.toString(iSum);

        String sResult = "";

        sResult += str.substring(1);
        sResult += str.substring(0, 1);

        System.out.print(sResult);
    }
}
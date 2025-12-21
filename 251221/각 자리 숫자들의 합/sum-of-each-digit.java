import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        String str = Integer.toString(A);
        int iResult = 0;

        for(int i = 0; i < str.length(); i++) {
            String sNum = str.charAt(i) + "";
            int iNum = Integer.parseInt(sNum);
            iResult += iNum;
        }
        
        System.out.print(iResult);
    }
}
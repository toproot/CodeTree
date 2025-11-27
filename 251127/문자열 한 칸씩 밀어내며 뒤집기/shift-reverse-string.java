import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String sResult = sc.next();
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int M = sc.nextInt();

            if(M == 1) {
                sResult = sResult.substring(1, sResult.length()) + sResult.substring(0, 1);
            }else if (M == 2) {
                sResult = sResult.substring(sResult.length()-1, sResult.length()) + sResult.substring(0, sResult.length()-1);
            }else if (M == 3) {

                char[] cList = sResult.toCharArray();
                String str = "";
                for(int j = cList.length -1; j >= 0; j--) {
                    str += cList[j] + "";
                }

                sResult = str;
            }

            System.out.println(sResult);
        }
    }
}
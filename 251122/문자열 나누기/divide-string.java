import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();

        String sResult = "";

        for(int i = 0; i < N; i++) {
            String str = sc.next();
            sResult += str;
        }

        String sSplit = "";

        for(int i = 0; i < sResult.length(); i++) {
            if (sSplit.length() < 5) {
                sSplit += sResult.charAt(i);
            }else if(sSplit.length() == 5) {
                System.out.println(sSplit);
                sSplit = ""+sResult.charAt(i);
            }
        }

        if(!sSplit.equals("")) {
            System.out.println(sSplit);
        }
    }
}
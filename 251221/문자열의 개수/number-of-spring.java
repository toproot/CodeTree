import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int cnt = 0;
        String sResult = "";

        while(true) {
            String str = sc.next();
            if(str.equals("0")) {
                System.out.println(cnt);
                System.out.println(sResult);
                break;
            }else {
                if (i ==0 || i % 2 == 0) {
                    sResult += str + "\n";
                }
            }

            cnt++;
            i++;
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char a = str.charAt(0);
        char b = str.charAt(1);

        char[] cList = str.toCharArray();

        for(int i = 0; i < cList.length; i++) {
            if (cList[i] == b) {
                cList[i] = a;
            }
        }

        String sResult = String.valueOf(cList);
        System.out.print(sResult);
    }
}
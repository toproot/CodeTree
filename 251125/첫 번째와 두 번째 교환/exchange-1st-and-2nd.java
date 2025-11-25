import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char a = str.charAt(0);
        char b = str.charAt(1);

        char[] sList = str.toCharArray();

        for(int i = 0; i < sList.length; i++) {
            char c = sList[i];

            if(c == a) {
                sList[i] = b;
            }else if (c == b) {
                sList[i] = a;
            }
        }

        String sResult = String.valueOf(sList);

        System.out.print(sResult);
    }
}
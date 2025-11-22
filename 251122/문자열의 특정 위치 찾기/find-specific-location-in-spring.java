import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String sWord = sc.next();
        String str = sc.next();
        int iIdx = -1;

        for(int i = 0; i < sWord.length(); i++) {
            String s = "" + sWord.charAt(i);
            if (s.equals(str)) {
                iIdx = i;
                break;
            }
        }

        if (iIdx == -1) {
            System.out.print("No");
        }else {
            System.out.print(iIdx);
        }
    }
}
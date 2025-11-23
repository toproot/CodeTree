import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String sWord= sc.next();
        String str = sc.next();
        int iIdx = -1;

        for(int i = 0; i < sWord.length() - str.length()+1; i++) {
            String s = sWord.substring(i, i + str.length());
            if(s.equals(str)) {
                iIdx = i;
                break;
            }
        }

        System.out.print(iIdx);
    }
}

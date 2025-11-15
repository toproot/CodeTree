import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] strList = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        String str = sc.next();
        int iCnt = 0;

        for(int i = 0; i < strList.length; i++) {
            String sFruit = strList[i];
            if((sFruit.charAt(2) == str.charAt(0)) || (sFruit.charAt(3) == str.charAt(0))) {
                System.out.println(sFruit);
                iCnt++;
            }
        }
        System.out.println(iCnt);
    }
}
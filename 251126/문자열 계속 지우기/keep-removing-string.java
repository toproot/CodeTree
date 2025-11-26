import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        while(true) {

            if(strA.length() <= strB.length()) {
                if(strA.equals(strB)) {
                    System.out.print("");
                    break;
                }else {
                    System.out.print(strA);
                    break;
                }
            }
            
            boolean bFlag = false;

            for(int i = 0; i < strA.length() - strB.length()+1; i++) {
                String subStr = strA.substring(i, i+strB.length());
                if (subStr.equals(strB)) {
                    strA = strA.substring(0, i) + strA.substring(i+strB.length());
                    bFlag = true;
                    break;
                }
            }
            
            if(!bFlag) {
            	System.out.print(strA);
            	break;
            }
        }
    }
}
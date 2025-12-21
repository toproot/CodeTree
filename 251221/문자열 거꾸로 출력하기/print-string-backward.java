import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str = sc.next();
            if(str.equals("END")) {
                break;
            }else {
                String sWord = "";
                for(int i = str.length()-1; i >= 0; i--) {
                    sWord += str.charAt(i);
                }
                System.out.println(sWord);
            }
        }
    }
}
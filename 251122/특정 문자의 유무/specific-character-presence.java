import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String ee = "ee";
        String ab = "ab";

        String str = sc.next();

        String bEE = "No";
        String bAB = "No";

        for(int i = 0; i < str.length() -1; i++) {
            if(str.substring(i, i+2).equals(ee)){
                bEE = "Yes";
            }else if(str.substring(i, i+2).equals(ab)){
                bAB = "Yes";
            }
        }

        System.out.print(bEE);
        System.out.print(" ");
        System.out.print(bAB);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();


        String sResult = str1.substring(0, 2) + str2.substring(2);
        System.out.print(sResult);
    }
}
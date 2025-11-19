import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int N = sc.nextInt();
        int strLength = str.length();

        if(N > strLength) {
            for(int i = strLength-1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }else {
            for(int i =strLength-1; i >= (strLength - N); i--) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
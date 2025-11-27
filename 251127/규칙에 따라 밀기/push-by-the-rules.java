import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String con = sc.next();

        for(int i = 0; i < con.length(); i++) {
            String console = con.charAt(i) + "";
            if(console.equals("L")) {
                str = str.substring(1, str.length()) + str.substring(0, 1);
            }else if (console.equals("R")) {
                str = str.substring(str.length()-1, str.length()) + str.substring(0, str.length()-1);
            }
        }

        System.out.print(str);
    }
}
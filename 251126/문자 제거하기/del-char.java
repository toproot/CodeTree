import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while(true) {
            if (str.length() == 1){
                break;
            }

            int i = sc.nextInt();

            if (i > str.length()) {
                str = str.substring(0, str.length()-1);
            }else {
                str = str.substring(0, i) + str.substring(i+1);
            }

            System.out.println(str);
        }
    }
}
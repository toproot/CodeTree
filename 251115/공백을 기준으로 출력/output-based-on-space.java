import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String strLine = sc.nextLine();
        String strLine2 = sc.nextLine();

        for(int i = 0; i < strLine.length(); i++) {
            if (strLine.charAt(i) != ' ') {
                System.out.print(strLine.charAt(i));
            }
        }

        for(int i = 0; i < strLine2.length(); i++) {
            if(strLine2.charAt(i) != ' ') {
                System.out.print(strLine2.charAt(i));
            }
        }
    }
}
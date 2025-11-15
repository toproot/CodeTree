import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String strLine = sc.nextLine();

        for(int i = 2; i < 10; i++) {
            System.out.print(strLine.charAt(i));
        }
    }
}
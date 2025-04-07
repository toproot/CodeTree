import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String sNumber = sc.next();
        String[] sList = sNumber.split("-");

        System.out.print(sList[0] + "-" + sList[2] + "-" + sList[1]);

    }
}
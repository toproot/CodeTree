import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String sDate = sc.next();

        String[] sList = sDate.split("-");
        System.out.print(sList[2] + "." + sList[0] + "." + sList[1]);
    }
}
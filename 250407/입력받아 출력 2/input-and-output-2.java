import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String sNumbers = sc.next();
        String[] sList = sNumbers.split("-");

        System.out.print(sList[0]+sList[1]);
    }
}
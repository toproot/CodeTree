import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = "";

        if (a%2 == 0) {
            result = "even";
        }else {
            result = "odd";
        }

        System.out.println(result);

        if (b%2 == 0) {
            result = "even";
        }else {
            result = "odd";
        }

        System.out.println(result);
    }
}
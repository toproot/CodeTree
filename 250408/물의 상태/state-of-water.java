import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int water = sc.nextInt();
        String result = "";

        if (water < 0) {
            result = "ice";
        } else if (water >= 100) {
            result = "vapor";
        } else {
            result = "water";
        }

        System.out.print(result);
    }
}
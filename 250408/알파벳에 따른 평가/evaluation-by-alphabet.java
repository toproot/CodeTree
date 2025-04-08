import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);
        String grade = "Failure";

        if (alpha == 'S') {
            grade = "Superior";
        }else if (alpha == 'A') {
            grade = "Excellent";
        }else if (alpha == 'B') {
            grade = "Good";
        }else if (alpha == 'C') {
            grade = "Usually";
        }else if (alpha == 'D') {
            grade = "Effort";
        }

        System.out.print(grade);
    }
}
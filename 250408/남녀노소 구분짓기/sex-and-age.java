import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();
        String person = "";

        if (age >= 19) {
            if (sex == 0) {
                person = "MAN";
            }else {
                person = "WOMAN";
            }
        }else {
            if (sex == 0) {
                person = "BOY";
            }else {
                person = "GIRL";
            }
        }

        System.out.print(person);
    }
}
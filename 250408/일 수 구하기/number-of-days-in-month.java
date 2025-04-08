import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//             1 3 5 7 8 10 12  (31) , 4 6 9 11 (30)
        if (n == 2) {
            System.out.print(28);
        }else if (n%2 == 0) {
            if (n >= 8) {
                System.out.print(31);
            }else {
                System.out.print(30);
            }
        }else {
            if (n >= 9) {
                System.out.print(30);
            }else {
                System.out.print(31);
            }
        }
    }
}
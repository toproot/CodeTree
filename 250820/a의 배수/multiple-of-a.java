import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();

        int iFlagNO = 1;
        while(iFlagNO <= N) {
            if (iFlagNO % a == 0) {
                System.out.println("1");
            }else {
                System.out.println("0");
            }
            iFlagNO++;
        }
    }
}
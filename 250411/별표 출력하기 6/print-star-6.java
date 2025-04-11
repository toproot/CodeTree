import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int space = 0;
        int star = N*2-1;
        boolean change = false;

        for(int i = 0; i < (N*2-1); i++) {
            for(int k = 0; k < space; k++){
                System.out.print("  ");
            }

            for(int j = 0; j < star; j++) {
                System.out.print("* ");
            }

            System.out.println("");

            if (star == 1) {
                change = true;
            }

            if (!change) {
                space += 1;
                star -= 2;
            }else {
                space -= 1;
                star += 2;
            }
        }
    }
}
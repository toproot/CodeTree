import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int space = N-1;
        int star = 1;
        boolean change = false;

        for(int i = 0; i < (N*2-1); i++) {
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }

            for(int k = 0; k < star; k++) {
                System.out.print("* ");
            }
            System.out.println("");

            if(star == N) {
                change = true;
            }

            if(!change) {
                star += 1;
                space -= 1;
            }else {
                star -= 1;
                space += 1;
            }
        }
    }
}
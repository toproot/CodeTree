import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char c = 'A';

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for(int k = 0; k < N-i; k++) {
                System.out.print(c + " ");

                if (c == 'Z'){
                    c = 'A';
                }else {
                    c += 1;
                }
            }
            System.out.println("");
        }
    }
}
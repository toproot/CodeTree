import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = 1; i <= A; i++){
            for(int j = 1; j <= B; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <=N; i++) {
            for(int j = 1; j < i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            if(i%2 == 0) { 
                for(int j = 1; j <= N; j++) {
                    System.out.print(j);
                }
            }else {
                for(int j = N; j > 0; j--) {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sumVal = 0;

        for(int i =1; i<N; i++) {
            if(N%i == 0) {
                sumVal += i;
            }
        }

        if (sumVal == N) {
            System.out.print("P");
        }else {
            System.out.print("N");
        }
    }
}
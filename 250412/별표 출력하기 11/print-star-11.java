import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N*2+1; i++) {
            if (i%2 != 0) {
                for(int j = 1; j <= N*2+1; j++) {
                    System.out.print("* ");
                }
            }else {
                for(int j = 1; j <= N*2+1; j++) {
                    if(j%2 != 0) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
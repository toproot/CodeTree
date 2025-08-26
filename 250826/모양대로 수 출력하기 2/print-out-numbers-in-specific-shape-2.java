import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int iFlagNo = 2;

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (iFlagNo < 10) {
                    System.out.print(iFlagNo + " ");
                }else {
                    iFlagNo = 2;
                    System.out.print(iFlagNo + " ");
                }
                iFlagNo+=2;
            }
            System.out.println();
        }
    }
}
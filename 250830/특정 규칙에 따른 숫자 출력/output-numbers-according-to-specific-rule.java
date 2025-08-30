import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int iFlagNo = 0;

        for(int i = N; i > 0; i--) {
            for (int j = N; j > 0; j--) {
                if(j <= i) {
                    iFlagNo++;
                    if(iFlagNo == 10) {
                        iFlagNo = 1;
                    }
                    System.out.print(iFlagNo + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
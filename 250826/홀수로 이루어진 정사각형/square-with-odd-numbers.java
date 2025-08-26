import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int iFlagNo = 11;

        for(int i = 0; i < N; i++) {
            int iSubno = iFlagNo;
            for (int j = 0; j < N; j++) {
                if (j == 0) {
                    System.out.print(iSubno + " ");
                }else {
                    iSubno += 2;
                    System.out.print(iSubno + " ");
                }
            }
            iFlagNo += 2;
            System.out.println();
        }
    }
}
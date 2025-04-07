import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int[] iRow = new int[n];

            for (int j=0; j<n; j++) {
                iRow[j] = j+1;
            }
            if (i%2 != 0){ // 홀수인 경우.
                for (int k=n-1; k >=0; k--) {
                    System.out.print(iRow[k]);
                }
            }else { // 짝수인 경우.
                for (int k=0; k<n; k++) {
                    System.out.print(iRow[k]);
                }
            }

            System.out.println("");
        }

    }
}
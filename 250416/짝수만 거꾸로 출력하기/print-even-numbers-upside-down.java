import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] iArr = new int[N];

        for(int i = 0; i < N; i++) {
            iArr[i] = sc.nextInt();
        }

        for(int j = iArr.length-1; j >= 0 ; j--) {
            if (iArr[j] %2 == 0) {
                System.out.print(iArr[j] + " ");
            }
        }

    }
}
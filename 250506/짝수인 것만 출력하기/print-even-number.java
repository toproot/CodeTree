import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] iList = new int[N];

        for(int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (n%2 == 0) {
                iList[i] = n;
            }
        }

        for(int i = 0; i < iList.length; i++) {
            if(iList[i] != 0) {
                System.out.print(iList[i] + " ");
            }
        }
    }
}
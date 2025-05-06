import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] iList = new int[N];

        for(int i = 0; i < iList.length; i++) {
            iList[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            System.out.print(iList[i]*iList[i] + " ");
        }

    }
}
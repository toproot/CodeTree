import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] iList = new int[N];

        for(int i = 0; i < N; i++) {
            int iNum = sc.nextInt();
            iList[i] = iNum;
        }

        for(int i = 0; i < Q; i++) {
            int iNum = sc.nextInt();

            if(iNum == 1) {
                int a = sc.nextInt();
                System.out.println(iList[a-1]);
            }else if(iNum == 2) {
                int b = sc.nextInt();
                int result = 0;

                for(int j = 0; j < N; j++) {
                    if(iList[j] == b) {
                        result = j+1;
                        break;
                    }
                }
                System.out.println(result);
            }else if(iNum == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for(int k = s-1; k < e; k++) {
                    System.out.print(iList[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
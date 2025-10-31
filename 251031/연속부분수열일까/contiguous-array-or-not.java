import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] iNList = new int[N];
        int[] iMList = new int[M];

        for(int i = 0; i < N; i++) {
            iNList[i] = sc.nextInt();
        }
        
        for(int i = 0; i < M; i++) {
            iMList[i] = sc.nextInt();
        }

        int result = 0;
        for(int i = 0; i < N; i++) {
            int cnt = 0;
            for(int j = 0; j < M; j++) {
                if (i+j < N) {
                    if (iNList[i+j] == iMList[j]) {
                        cnt++;
                    }else {
                        break;
                    }
                }else {
                    break;
                }
            }

            if (cnt == M) {
                result = 1;
            }
        }

        if(result == 1) {
            System.out.println("Yes");
        }else if (result == 0) {
            System.out.println("No");
        }
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] iList = new int[N][N];

        for(int i = 0; i < N; i++) {
            int iNum = i+1;
            for(int j =0; j<N; j++) {
                iList[i][j] = iNum;
                System.out.print(iList[i][j]);
                System.out.print(" ");
                iNum += N;
            }
            System.out.println();
        }
    }
}
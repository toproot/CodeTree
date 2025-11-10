import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int iSum = 0;
        int[][] iList = new int[4][4];

        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int iNum = sc.nextInt();
                iList[i][j] = iNum;
            }
        }

        for(int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                iSum += iList[i-1][j];
            }
        }

        System.out.print(iSum);
    }
}
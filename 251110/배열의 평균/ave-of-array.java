import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double[][] dList = new double[2][4];
        double dTotalNum = 0;
        double dFirstRow = 0;
        double dSecondRow = 0;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                double dNum = sc.nextDouble();
                dList[i][j] = dNum;
                if(i == 0) {
                    dFirstRow += dNum;
                }else if (i == 1) {
                    dSecondRow += dNum;
                }
                dTotalNum += dNum;
            }
        }
        System.out.printf("%.1f", dFirstRow / 4);
        System.out.print(" ");
        System.out.printf("%.1f", dSecondRow / 4);
        System.out.println();

        for(int i = 0; i < 4; i++) {
            double dSubSum = 0;
            for(int j = 0; j <2; j++) {
                dSubSum += dList[j][i];
            }
            System.out.printf("%.1f", dSubSum / 2);
            System.out.print(" ");
        }
        System.out.println();
        System.out.printf("%.1f", dTotalNum / 8);
    }
}
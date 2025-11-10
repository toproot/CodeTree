import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] iList1 = new int[3][3];
        int[][] iList2 = new int[3][3];

        for(int i = 0; i < 2; i++) {

            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                    int iNum = sc.nextInt();

                    if(i == 0) {
                        iList1[j][k] = iNum;
                    }else if (i == 1){
                        iList2[j][k] = iNum;
                    }
                }
            }
            sc.nextLine();
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(iList1[i][j] * iList2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
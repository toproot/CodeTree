import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int iNum = sc.nextInt();
        int iCnt = 0;

        for(int i =0; i < iNum; i++) {
            int[] iScores = new int[4];
            for(int j = 0; j < 4; j++) {
                iScores[j] = sc.nextInt();
            }
            int iSum = 0;
            double iAvg = 0d;
            for(int k = 0; k < iScores.length; k++){
                iSum += iScores[k];
            }
            iAvg = (double)iSum/4;
            if (iAvg >= 60) {
                System.out.println("pass");
                iCnt++;
            }else {
                System.out.println("fail");
            }
        } 

        System.out.println(iCnt);
    }
}
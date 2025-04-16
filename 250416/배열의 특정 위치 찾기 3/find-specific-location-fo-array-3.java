import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[100];
        boolean bFlag = true;
        int iCnt = 0;
        int iSum = 0;

        while(bFlag) {
            int iNum = sc.nextInt();
            if (iNum == 0) {
                bFlag = false;
                break;
            }

            iArr[iCnt] = iNum;
            iCnt++;
        }

        for(int i = iArr.length-1; i >= 0; i--) {
            if(iArr[i] != 0) {
                for(int j = i; j > i-3; j--) {
                    iSum += iArr[j];
                }
                break;
            }
        }

        System.out.print(iSum);
        
    }
}
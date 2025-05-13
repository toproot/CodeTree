import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int intA = sc.nextInt();
        int intB = sc.nextInt();

        int[] iArr = new int[intB];

        while(true) {
            if (intA <= 1) {
                break;
            }

            int iRest = intA % intB;
            intA = intA / intB;
            
            iArr[iRest] += 1;
        }

        int iSum = 0;
        for(int i = 0; i < iArr.length; i++) {
            if(iArr[i] != 0) {
                iSum += iArr[i] * iArr[i];
            }
        }

        System.out.print(iSum);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.

        int cnt = 0;

        for(int i = A; i <= B; i++) {
            if(isMagicNumber(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    public static boolean isMagicNumber(int i) {
        boolean bReturn = false;

        if((i % 3 == 0) || isSpecialNumber(i)) {
            bReturn = true;
        }

        return bReturn;
    }

    public static boolean isSpecialNumber(int i) {
        boolean bReturn = false;
        while(i > 0) {

            if (i / 10 == 0) {
                if(isThreeNumber(i)) {
                    bReturn = true;
                }
                break;
            }else {
                int j = i % 10;
                if(isThreeNumber(j)) {
                    bReturn = true;
                    break;
                }
            }

            i = i / 10;
        }

        return bReturn;
    }

    public static boolean isThreeNumber(int j) {
        boolean bReturn = false;
        int[] iList = new int[]{3, 6, 9};
        for(int i = 0; i < iList.length; i++) {
            if (j == iList[i]) {
                bReturn = true;
                ;
            }
        }

        return bReturn;
    }
}
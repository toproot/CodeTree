import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] iList = new int[100];
        int cnt = 2;

        iList[0] = 1;
        iList[1] = sc.nextInt();

        while(true) {
            iList[cnt] = iList[cnt -1] + iList[cnt -2];
            if (iList[cnt] > 100) {
                break;
            }
            cnt++;
        }

        for(int i = 0; i < iList.length; i++) {
            if(iList[i] == 0) {
                break;
            }
            System.out.print(iList[i] + " ");
        }
    }
}
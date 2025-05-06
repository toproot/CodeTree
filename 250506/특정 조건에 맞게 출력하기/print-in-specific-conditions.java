import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] iList= new int[100];
        int cnt = 0;

        while(true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            
            iList[cnt] = n;
            cnt++;
        }

        for(int i = 0; i < iList.length; i++) {
            if(iList[i] == 0 ) {
                break;
            }
            if(iList[i] % 2 != 0) {
                System.out.print(iList[i] + 3 + " ");
            }else {
                System.out.print(iList[i] / 2 + " ");
            }
        }
    }
}
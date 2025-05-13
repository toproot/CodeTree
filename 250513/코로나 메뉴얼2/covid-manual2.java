import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int[] iArr = new int[4];
        
        while(true) {
            if (cnt > 3) {
                break;
            }
            cnt++;

            String sState = sc.next();
            long lTemp = sc.nextLong();
            if (sState.equals("Y")){
                if (lTemp >= 37) {
                    iArr[0] += 1;
                }else {
                    iArr[2] += 1;
                }
            }else if(sState.equals("N")) {
                if (lTemp >= 37) {
                    iArr[1] += 1;
                }else {
                    iArr[3] += 1;
                }
            }

        }

        for(int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i] + " ");
        }
        if(iArr[0] >= 2) {
            System.out.print("E");
        }
    }
}
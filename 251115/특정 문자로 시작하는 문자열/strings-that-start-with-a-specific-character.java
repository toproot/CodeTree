import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double iCnt = 0;
        int iSum = 0;
        double iAvg = 0d;
        String str = "";

        String[] sList = new String[N];

        for(int i = 0; i < N; i++) {
            sList[i] = sc.next();
        }
        
        str = sc.next();

        for(int i = 0; i < N; i++) {
            if(sList[i].charAt(0) == str.charAt(0)){
                iCnt++;
                iSum += sList[i].length();
            }
        }
        iAvg = iSum / iCnt;
        System.out.print((int) iCnt + " ");
        System.out.printf("%.2f", iAvg);
    }
}
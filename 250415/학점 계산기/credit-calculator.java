import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] iArr = new double[N];
        double iSum = 0d;
        double iAvg = 0;
        String sGrade = "";

        for(int i = 0; i < N; i++) {
            iArr[i] = sc.nextDouble();
            iSum += iArr[i];
        }

        iAvg = iSum / N;
        System.out.printf("%.1f\n", iAvg);

        if(iAvg >= 4.0) {
            System.out.print("Perfect");
        }else if(iAvg >= 3.0) { 
            System.out.print("Good");
        }else if(iAvg < 3) {
            System.out.print("Poor");
        }
    }
}
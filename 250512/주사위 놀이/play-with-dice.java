import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];
        int[] cntArr = new int[7];

        for(int i=0; i < 10; i++) {
            iArr[i] = sc.nextInt();
        }

        for(int i=0; i < 10; i++) {
            cntArr[iArr[i]] += 1;
        }

        for(int i=1; i < cntArr.length; i++) {
            System.out.println(i + " - " + cntArr[i]);
        }

    }
}
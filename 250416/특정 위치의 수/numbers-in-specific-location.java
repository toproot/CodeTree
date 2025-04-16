import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];

        for(int i = 0; i < 10; i++) {
            iArr[i] = sc.nextInt();
        }

        int sum = iArr[3-1] + iArr[5-1] + iArr[10-1];
        System.out.print(sum);
    }
}
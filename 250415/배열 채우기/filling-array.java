import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] iArr = new int[10];

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n == 0) { 
                break;
            }
            iArr[i] = n;
        }
        for(int j = 9; j >=0; j--) {
            if(iArr[j] != 0) {
                System.out.print(iArr[j] + " ");
            }
        }
    }
}
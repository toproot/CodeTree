import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int[] iArr = new int[11];

        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }

            int m = n / 10;
            iArr[m] += 1;
        }

        for(int i = iArr.length-1; i > 0; i--) {
            System.out.println(i + "0 - " + iArr[i]);
        }

    }
}
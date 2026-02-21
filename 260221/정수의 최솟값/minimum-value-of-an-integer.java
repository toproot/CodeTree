import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.print(checkMin(a,b,c));
    }

    public static int checkMin(int a, int b, int c) {
        int iMin = 0;
        if(a <= b && a <= c) {
            iMin = a;
        }else if (b <= a && b <= c) {
            iMin = b;
        }else if (c <= a && c <= b) {
            iMin = c;
        }
        return iMin;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean bFlag = false;

        for(int i = a; i <= b; i++){
            if (i%c == 0) {
                bFlag = true;
            }
        }

        if (bFlag) {
            System.out.print("YES");
        }else {
            System.out.print("NO");
        }
    }
}
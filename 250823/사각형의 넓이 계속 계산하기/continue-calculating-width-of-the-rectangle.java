import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            int iWidth = sc.nextInt();
            int iHeight = sc.nextInt();
            char ch = sc.next().charAt(0);

            System.out.println(iWidth * iHeight);

            if (ch == 'C') {
                break;
            }
        }
    }
}
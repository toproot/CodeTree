import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] iList = new int[10];
         
        for(int i = 0; i < 10; i++) {
            iList[i] = sc.nextInt();
            if (iList[i] % 3 == 0) {
                System.out.print(iList[i-1]);
                break;
            }

        }

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] iList = new int[10];

        iList[0] = sc.nextInt();
        iList[1] = sc.nextInt();

        for(int i = 2; i < 10; i++) {
            iList[i] = iList[i-1] + (2 * iList[i-2]);
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(iList[i] + " ");
        }
    }
}
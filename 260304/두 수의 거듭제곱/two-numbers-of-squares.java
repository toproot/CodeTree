import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        System.out.print(iCalculate(a, b));
    }

    public static int iCalculate(int a, int b) {
        int iResult = a;

        for(int i = 0; i < b-1; i++) {
           iResult *= a;
        }

        return iResult;
    }  
}


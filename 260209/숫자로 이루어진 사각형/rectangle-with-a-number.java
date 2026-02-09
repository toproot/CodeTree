import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printNumbers(n);
    }

    public static void printNumbers(int n) {
        int number = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(number == 9) {
                    number = 1;
                }else {
                    number++;
                }
                System.out.print(number);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
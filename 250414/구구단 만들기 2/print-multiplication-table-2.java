import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = 2; i < 10; i += 2) {
            for(int j = B; j >= A; j--) {
                System.out.print(j + " * " + i + " = " + j*i);
                if(j > A) {
                    System.out.print(" / ");
                }
            }
            System.out.println("");
        }
    }
}
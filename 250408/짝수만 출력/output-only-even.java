import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        while(A <= B) {
            if(A%2 == 0) {
                System.out.print(A + " ");
            }
            A+=1;
        }
    }
}
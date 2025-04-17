import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 10; i++ ){
            String n = sc.next();
            if(i == 2 || i == 5 || i == 8) {
                System.out.print(n + " ");
            }
        }
    }
}
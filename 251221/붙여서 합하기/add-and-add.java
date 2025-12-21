import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int a = Integer.parseInt(A+B);
        int b = Integer.parseInt(B+A);

        System.out.print(a+b);

        
    }
}
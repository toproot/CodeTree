import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if(c == 'z') {
            System.out.print('a');
        }else {
            int n = (int)c + 1;
            System.out.print((char)n);
        }
    }
}
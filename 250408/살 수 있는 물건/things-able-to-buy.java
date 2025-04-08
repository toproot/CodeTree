import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String product = "";
        if (N >= 3000) {
            product = "book";
        }else if (N >= 1000) {
            product = "mask";
        }else {
            product = "no";
        }
        System.out.print(product);
    }
}
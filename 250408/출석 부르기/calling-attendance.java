import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        String sName = "Vacancy";

        if (Num == 1) {
            sName = "John";
        }else if(Num == 2) {
            sName = "Tom";
        }else if(Num == 3) {
            sName = "Paul";
        }

        System.out.print(sName);
    }
}
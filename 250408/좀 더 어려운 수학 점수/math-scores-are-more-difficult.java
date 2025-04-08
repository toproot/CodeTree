import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int aMath = sc.nextInt();
        int aEng = sc.nextInt();
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        String winner = "";

        if (aMath > bMath) {
            winner = "A";    
        }else if (aMath < bMath) {
            winner = "B";
        }else if (aMath == bMath) {
            if (aEng > bEng) {
                winner = "A";
            }else {
                winner = "B";
            }
        }

        System.out.print(winner);
    }
}
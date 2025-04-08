import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String score = "";
        if (N >= 90) {
            score = "A";
        }else if (N >= 80) {
            score = "B";
        }else if (N >= 70) {
            score = "C";
        }else if (N >= 60) {
            score = "D";
        }else if(N < 60) {
            score = "F";
        }

        System.out.print(score);
    }
}
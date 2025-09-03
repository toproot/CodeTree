import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.print(i +" * " + j + " = " + (i*j));

                if (j < 19 && j % 2 == 1) {
                    System.out.print(" / ");
                }else if (j % 2 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
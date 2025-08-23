import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true) {
            int iNum = sc.nextInt();

            if (!checkVacancy(iNum)) {
                System.out.println("Vacancy");
                break;
            }

            if (iNum == 1) {
                System.out.println("John");
            }else if (iNum == 2) {
                System.out.println("Tom");
            }else if (iNum == 3) {
                System.out.println("Paul");
            }else if (iNum == 4) {
                System.out.println("Sam");
            }
        }
    }


    public static boolean checkVacancy(int iNum) {
        if (iNum > 0 && iNum < 5) {
            return true;
        }else {
            return false;
        }
    }
}
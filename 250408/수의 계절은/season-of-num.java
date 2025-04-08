import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        String season = "";
        if (M >= 3 && M <= 5) {
            season = "Spring";
        }else if (M >= 6 && M <=8) {
            season = "Summer";
        }else if (M >= 9 && M <=11) {
            season = "Fall";
        }else if (M == 12 || (M >= 1 && M <= 2)) {
            season = "Winter";
        }

        System.out.print(season);
    }
}
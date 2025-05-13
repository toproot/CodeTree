import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] cList = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        char charA = sc.next().charAt(0);
        String result = "None";

        for(int i =0; i < cList.length; i++) {
            if(charA == cList[i]) {
                result = Integer.toString(i);
            }
        }

        System.out.print(result);
    }
}
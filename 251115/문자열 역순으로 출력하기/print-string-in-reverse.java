import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] sList = new String[4];

        for(int i = 0; i < 4; i++){
            sList[i] = sc.next();
        }

        for(int j = 4-1; j >= 0; j--) {
            System.out.println(sList[j]);
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char chr = 'A';
        String result = "";
        int cnt = 0;

        for(int i = 0; i < str.length(); i++) {
            char chrSub =  str.charAt(i);

            if (i==0) {
                chr = chrSub;
            }else {
                if(chrSub == chr) {
                    cnt++;
                }else {
                    cnt++;
                    result += (chr + Integer.toString(cnt));

                    chr = chrSub;
                    cnt = 0;
                }

                if(i == str.length()-1) {
                    cnt++;
                    result += (chr + Integer.toString(cnt));
                }
            }
        }
        System.out.println(result.length());
        System.out.print(result);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int M = sc.nextInt();

            if (M == 1) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;                

                char[] sList = S.toCharArray();

                char aa = sList[a];
                char bb = sList[b];

                sList[a] = bb;
                sList[b] = aa;
                
                S = String.valueOf(sList);
            }else if (M == 2){
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0); 
                
                char[] sList = S.toCharArray();

                for (int j = 0; j < sList.length; j++) {
                    if (sList[j] == a) {
                        sList[j] = b;
                    }
                }
                
                S = String.valueOf(sList);
            }

            System.out.println(S);
        }
    }
}
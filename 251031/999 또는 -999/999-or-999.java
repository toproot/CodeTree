import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try {
            st = new StringTokenizer(br.readLine());

            int minValue = Integer.MAX_VALUE;
            int maxValue = Integer.MIN_VALUE;

            while(st.hasMoreTokens()) {
                int iNum = Integer.parseInt(st.nextToken());
                if (iNum == -999 || iNum == 999) {
                    break;
                }else {
                    if (iNum < minValue) {
                        minValue = iNum;
                    }
                    if (iNum > maxValue) {
                        maxValue = iNum;
                    }
                }
            }
            System.out.print(maxValue);
            System.out.print(" ");
            System.out.print(minValue);


        }catch(Exception e) {

        }
    }
}
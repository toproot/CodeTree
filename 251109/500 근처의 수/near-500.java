import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            String sInput = br.readLine();
            String[] sList = sInput.split(" ");

            int iMinValue = Integer.MAX_VALUE;
            int iMaxValue = Integer.MIN_VALUE;

            for(int i = 0; i < 10; i++) {
                int iNum = Integer.parseInt(sList[i]);
                if(iNum > 500) {
                    if (iNum < iMinValue) {
                        iMinValue = iNum;
                    }
                }else {
                    if (iNum > iMaxValue) {
                        iMaxValue = iNum;
                    }
                }
            }

            System.out.print(iMaxValue);
            System.out.print(" ");
            System.out.print(iMinValue);

        }catch(Exception e) {

        }
    }
}
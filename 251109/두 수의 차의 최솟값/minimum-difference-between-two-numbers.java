import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int N = Integer.parseInt(br.readLine().trim());
            String sInput = br.readLine();
            String[] sInputList = sInput.split(" ");
            int iMinValue = Integer.MAX_VALUE;
            int iMaxValue = Integer.parseInt(sInputList[N-1]);

            for(int i = N-2; i >=0; i--) {
                int iNum = Integer.parseInt(sInputList[i]);
                int minusValue = iMaxValue - iNum;
                if (minusValue < iMinValue) {
                    iMinValue = minusValue;
                }
                iMaxValue = iNum;
            }

            System.out.print(iMinValue);
        }catch(Exception e) {
            
        }
    }
}
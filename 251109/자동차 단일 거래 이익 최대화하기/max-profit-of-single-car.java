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

            int iMaxValue = Integer.parseInt(sInputList[N-1]);
            int iSellResult = 0;

            for(int i = N-2; i >=0; i--) {
                int iSellResultSub = 0;
                int iNum = Integer.parseInt(sInputList[i]);

                if (iNum < iMaxValue) {
                    iSellResultSub = iMaxValue - iNum;
                    if(iSellResultSub > iSellResult) {
                        iSellResult = iSellResultSub;
                    }
                }else {
                    iMaxValue = iNum;
                }
            }
            System.out.print(iSellResult);


        }catch(Exception e) {

        }
    }
}
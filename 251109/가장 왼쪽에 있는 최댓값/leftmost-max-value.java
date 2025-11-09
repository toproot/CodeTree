import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int N = Integer.parseInt(br.readLine().trim());
            String sInput = br.readLine();
            String[] sTokens = sInput.split(" ");
            int[] iList = new int[N];
            int iMaxIndex = N;

            for(int i = 0; i < N; i++) {
                iList[i] = Integer.parseInt(sTokens[i]);
            }

            while(iMaxIndex > 0) {

                int iMaxSub = Integer.MIN_VALUE;
                int iMaxIndexSub = 0;

                for(int i = 0; i < iMaxIndex; i++) {
                    if(iList[i] > iMaxSub) {
                        iMaxSub = iList[i];
                        iMaxIndexSub = i;
                    }
                }
                iMaxIndex = iMaxIndexSub;

                System.out.print(iMaxIndex + 1 + " ");
            }

        }catch(Exception e) {

        }
    }
}
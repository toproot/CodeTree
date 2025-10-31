import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxValue = Integer.MIN_VALUE + 1;
        int secondMaxValue = Integer.MIN_VALUE;
        
        for(int i = 0; i < N; i++) {
            int iNum = Integer.parseInt(st.nextToken());

            if(i == 0) {
            	maxValue = iNum;
            	continue;
            }
            
            if(iNum > maxValue) {
                secondMaxValue = maxValue;
                maxValue = iNum;

            }else if (iNum <= maxValue && iNum >= secondMaxValue) {
                secondMaxValue = iNum;
            }
        }

        System.out.print(maxValue);
        System.out.print(" ");
        System.out.print(secondMaxValue);
    }
}
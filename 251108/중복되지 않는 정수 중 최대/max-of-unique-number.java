import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = 0;
        int[] iList = null;
        int intMax = Integer.MIN_VALUE;
        Map<Integer, Boolean> iMap = new HashMap<>(); // 숫자, 중복여부

        try{
            N = Integer.parseInt(br.readLine().trim());
            String input = br.readLine();
            String[] tokens = input.split(" ");
            iList = new int[N];
            for(int i = 0; i < N; i++) {
            	iList[i] = Integer.parseInt(tokens[i]);
            }
            for(int i = 0; i < N; i++) {
            	int M = iList[i];
                if (iMap.containsKey(M)) {
                    if (!iMap.get(M)) {
                        iMap.put(M, true);
                    }
                }else {
                    iMap.put(M, false);
                }
            }
        }catch(Exception e) {
            System.out.print("Error : " + e.getMessage());
        }

        // 중복하여 등장하지 않는 수가 있을 경우 체크 (-1)
        if (!iMap.containsValue(false)) {
            System.out.print(-1);
        }else {
        	for(Map.Entry<Integer, Boolean> entry : iMap.entrySet()) {
        		if (!entry.getValue()) {
        			if (entry.getKey() > intMax) {
        				intMax = entry.getKey();
        			}
        		}
        	}
        	
        	System.out.print(intMax);
        }
    }
}
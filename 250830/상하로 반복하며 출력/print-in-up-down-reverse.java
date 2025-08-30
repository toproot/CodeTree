import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		int[] iList = new int[N];
		
		for (int i = 0; i < iList.length; i++) {
			iList[i] = i + 1;
		}
				
		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < N+1; j++) {
				if (j % 2 == 1) { // 홀수 
					System.out.print(iList[i-1]);
				}else { // 짝수
					System.out.print(iList[N - i]);
				}
			}
			System.out.println();
		}
	}
}
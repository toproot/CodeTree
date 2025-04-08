import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String aStatus = sc.next();
        int aTemp = sc.nextInt();

        String bStatus = sc.next();
        int bTemp = sc.nextInt();
        
        String cStatus = sc.next();
        int cTemp = sc.nextInt();

        int emergency = 0;

        if (aStatus.equals("Y") && aTemp >= 37) {
            emergency++;
        }
        if (bStatus.equals("Y") && bTemp >= 37) {
            emergency++;
        }
        if (cStatus.equals("Y") && cTemp >= 37) {
            emergency++;
        }

        if (emergency >=2) {
            System.out.print("E");
        }else {
            System.out.print("N");
        }
    }
}
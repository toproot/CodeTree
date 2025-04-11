import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int space  = 0;

        for(int i = N; i>0; i--){
            for(int j = 0; j<N*2; j++){
                if(space != 0){
                    if(j >= i && j < i+space) {
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }else {
                    System.out.print("*");
                }
            }
            System.out.println("");
            space += 2;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        int[][] iList = new int[5][5];

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    iList[i][j] = 1;
                }else if (j == 0) {
                    iList[i][j] = 1;
                }else {
                    if ((((i-1) < 5 && (i-1) >=0) && ((j-1) < 5 && (j-1) >=0))) {
                        int iUp = iList[i-1][j];
                        int iLeft = iList[i][j-1];
                        iList[i][j] = iUp + iLeft;
                    }
                }
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(iList[i][j] + " ");
            }
            System.out.println();
        }
    }
}
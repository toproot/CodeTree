public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5;
        int b = 6;
        int c = 7;

        int aTemp = 0;
        int bTemp = 0;
        int cTemp = 0;

        // b -> a, c -> b, a -> c
        aTemp = a;
        bTemp = b;
        cTemp = c;

        b = aTemp;
        c = bTemp;
        a = cTemp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
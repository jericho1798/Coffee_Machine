import java.util.*;
class Main {
    public static void main(String[] args) {
       /*Scanner in = new Scanner(System.in);
        int n;
        while ((n = in.nextInt()) != 0) {
            if (n % 2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }

        }*/
        char ch = 'a';
        int num = 0;
        switch(ch) {
            case 'a':
                num = 10;
               // break;
            case 'b':
                num = 20;
               // break;
            default:
                num = 30;
        }
        System.out.println(num);
    }
}

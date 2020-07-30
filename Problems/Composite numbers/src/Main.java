import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        long i = 2;
        boolean prim = false;
        while (i <= Math.sqrt(number) && prim == false) {
            if (number % i  == 0) {
                prim = true;
            }
        i++;
        }
        return prim;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}

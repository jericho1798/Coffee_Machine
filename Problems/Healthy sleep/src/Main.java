import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(); // hrs at least
        int B = in.nextInt(); // hrs max
        int H = in.nextInt(); // hrs actually
        if (H < A) {
            System.out.println("Deficiency");
        }
        else {
            if (H > B) {
                System.out.println("Excess");
            }
            else {
                System.out.println("Normal");
            }
        }

    }
}
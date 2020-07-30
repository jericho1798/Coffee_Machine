import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] <= height) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }
            if (i == n - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int a = in.nextInt();
        int b = in.nextInt();
        boolean ot = false;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] == a && arr[i + 1] == b || arr[i] == a && arr[i - 1] == b ||
                    arr[i] == b && arr[i + 1] == a || arr[i] == b && arr[i - 1] == a) {
                ot = true;
            }
        }
        System.out.println(ot);
    }
}

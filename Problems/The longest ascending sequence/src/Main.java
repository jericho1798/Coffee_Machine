import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 1;
        int sqr = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i+1]) {
                sum++;
            }
            else {
                if (sum > sqr) {
                    sqr = sum;
                }
                sum = 1;
            }
        }
        if (sqr < sum) {
            System.out.println(sum);
        }
        else {
            System.out.println(sqr);
        }

    }
}
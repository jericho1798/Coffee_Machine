import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] % 6 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        in.close();
    }
}

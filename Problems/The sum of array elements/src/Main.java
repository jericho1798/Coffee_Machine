import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}
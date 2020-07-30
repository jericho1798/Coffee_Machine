import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nice = 0; 
        int fixed = 0; 
        int reject = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if (arr[i] == 1) {
                fixed++;
                }
            if (arr[i] == 0) {
                nice++;
            }
            if (arr[i] == -1) {
                reject++;
            }
        }
        System.out.println(nice + " " + fixed + " " + reject);
        in.close();
    }

}

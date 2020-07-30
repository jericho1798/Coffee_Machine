import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;
        boolean flag = false;
        int n;
        while ((n = in.nextInt()) != 0) {
            arr[count] = n;
            count++;
        }
        for (int i = 1; i < count - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > arr[i - 1]) {
                    flag = true;
                }
            }
            if (arr[i] < arr[i + 1]) {
                if (arr[i] < arr[i - 1]) {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("false");
         }
        else {
            System.out.println("true");
        }
    }
}

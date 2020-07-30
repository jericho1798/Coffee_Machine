import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            switch (arr[i]) {
                case 2:
                    d++;
                    break;
                case 3:
                    c++;
                    break;
                case 4:
                    b++;
                    break;
                default:
                    a++;
                    break;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
        in.close(); 
    }
}

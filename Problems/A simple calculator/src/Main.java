import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = Long.parseLong(in.next());
        String s = in.next();
        long b = Long.parseLong(in.next());
        switch (s) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
        in.close();
    }
}

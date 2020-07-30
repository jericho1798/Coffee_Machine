package machine;
import javax.imageio.plugins.tiff.ExifTIFFTagSet;
import java.util.Scanner;

public class CoffeeMachine {
    public static int wtr = 400;
    public static int mlk = 540;
    public static int cb = 120;
    public static int d_cups = 9;
    public static int money = 550;
    public static int max = 0;
    public static int e_w = 250;
    public static int e_b = 16;
    public static int e_c = 4;
    public static int l_w = 350;
    public static int l_m = 75;
    public static int l_b = 20;
    public static int l_c = 7;
    public static int c_w = 200;
    public static int c_m = 100;
    public static int c_b = 12;
    public static int c_c = 6;
    public static String condition = "choosing an action";
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while(true)
        cmach();
    }
    public static String choose_action(){
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        String action = in.nextLine();
        return action;
    }
    public static String choose_type(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
        String type = in.nextLine();
        return type;
    }
    public static void insert_v(){
        System.out.println("Write how many ml of water do you want to add:");
        int fill_w = in.nextInt();
        wtr += fill_w;
        System.out.println("Write how many ml of milk do you want to add:");
        int fill_m = in.nextInt();
        mlk += fill_m;
        System.out.println("Write how many grams of coffee do you want to add:");
        int fill_b = in.nextInt();
        cb += fill_b;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int fill_c = in.nextInt();
        d_cups += fill_c;
    }
    public static void cmach() {
        switch (condition) {
            case ("choosing an action"):
                String action = choose_action();
                switch (action){
                    case("buy"):
                        condition = "choosing a variant of coffee";
                        break;
                    case ("remaining"):
                        print_state();
                        break;
                    case ("fill"):
                        condition = "insert values";
                        break;
                    case ("exit"):
                        condition = "exit";
                        break;
                    case ("take"):
                        System.out.println("I gave you $" + money);
                        money = 0;
                        condition = "choosing an action";
                        break;
                    default: break;
                }
                break;
            case ("choosing a variant of coffee"):
                String type = choose_type();
                switch (type) {
                    case ("1"):
                        calc(e_w, 0, e_b, e_c);
                        break;
                    case ("2"):
                        calc(l_w, l_m, l_b, l_c);
                        break;
                    case ("3"):
                        calc(c_w, c_m, c_b, c_c);
                        break;
                    default:
                        break;
                }
                condition = "choosing an action";
            break;
            case ("insert values"):
                insert_v();
                condition = "choosing an action";
                break;
            case ("exit"):
                in.close();
                System.exit(0);
                break;
            default: break;
        }
    }

    public static void calc(int w, int m, int cbs, int mny) {
        if(w <= wtr && m <= mlk && cbs <= cb && d_cups > 0) {
            System.out.println("I have enough resources, making you a coffee!");
            wtr -= w;
            mlk -= m;
            cb -= cbs;
            d_cups--;
            money += mny;
        }
        else{
            if(w > wtr)
                System.out.println("Sorry, not enough water!");
            if(m > mlk)
                System.out.println("Sorry, not enough milk!");
            if(cbs > cb)
                System.out.println("Sorry, not enough coffee beans!");
            if(d_cups == 0)
                System.out.println("Sorry, not enough disposable cups!");
        }
    }
    public static void print_state(){
        System.out.println("The coffee machine has:");
        System.out.println(wtr + " of water");
        System.out.println(mlk + " of milk");
        System.out.println(cb + " of coffee beans");
        System.out.println(d_cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}

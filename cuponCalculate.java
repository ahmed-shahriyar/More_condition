import java.util.Scanner;

public class cuponCalculate {
    public static void main(String[] args) {
        System.out.print("Please enter the cost of your groceries: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float cupon = 0;
        if (a >= 10 && a <= 60) {
            cupon = (a * 8) / 100;
        } else if (a > 60 && a <= 150) {
            cupon = (a * 10) / 100;
        } else if (a > 150 && a <= 210) {
            cupon = (a * 12) / 100;
        } else if (a > 210) {
            cupon = (a * 14) / 100;
        }
        System.out.print(
                "You win a discount coupon of $ " + cupon + " (" + (int) ((cupon * 100) / a) + "% of your purchase)");

    }
}

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount:");
        int a = sc.nextInt();
        float tax = 0;
        if (a > 350000 && a <= 450000) {
            tax = (float) (a * 5) / 100;
        } else if (a > 450000 && a <= 750000) {
            tax = (float) (a * 10) / 100;
        } else if (a > 750000 && a <= 1150000) {
            tax = (float) (a * 15) / 100;
        } else if (a > 1150000 && a <= 1650000) {
            tax = (float) (a * 20) / 100;
        } else if (a > 1650000) {
            tax = (float) (a * 25) / 100;
        }
        System.out.println("Tax amount: " + tax);

    }
}

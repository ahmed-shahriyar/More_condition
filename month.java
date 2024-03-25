import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month:");
        int month = sc.nextInt();
        int day = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 10 || month == 12) {

            day = 31;

        } else if (month == 2) {
            day = 28;
        } else if (month == 4 || month == 6 || month == 8 || month == 11) {
            day = 30;
        } else {
            System.out.println("Invalid month");
        }
        System.out.print(day);
        System.out.println(" days");

    }
}
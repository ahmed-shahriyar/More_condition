import java.util.*;

public class floating_point_equallt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter three number:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat(), max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else
            max = c;
        System.out.print("The largest number is: ");
        System.out.println(max);
    }
}

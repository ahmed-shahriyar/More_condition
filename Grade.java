import java.util.Scanner;

public class Grade {
    public static float getNumericGrade(String s) {
        float ans = 0;
        if (s.charAt(0) == 'A') {
            ans += 4;
        } else if (s.charAt(0) == 'B') {
            ans += 3;
        } else if (s.charAt(0) == 'C') {
            ans += 2;
        } else if (s.charAt(0) == 'D') {
            ans += 1;
        }
        if (s.charAt(1) == '+') {
            if (s.charAt(0) != 'A') {
                ans += 0.3;
            }
        } else if (s.charAt(1) == '-') {
            ans -= 0.3;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade: ");
        String s = sc.nextLine();
        float result = getNumericGrade(s);
        System.out.println("Numeric grade: " + result);

    }
}

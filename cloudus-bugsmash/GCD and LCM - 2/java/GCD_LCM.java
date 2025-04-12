import java.util.Scanner;

public class GCDLCM {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcd_result = gcd(num1, num2);
        int lcm_result = lcm(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd_result);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm_result);

        scanner.close();
    }
}

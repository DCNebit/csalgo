package gcd;

import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, gcd;
        System.out.print("Pogi ako");
        num1 = input.nextInt();
        System.out.print("Input number 2: ");
        num2 = input.nextInt();

        System.out.println(gcd(num1, num2));
    }

    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        else return gcd(n, m%n);
        }
}

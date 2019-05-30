package a_25_05;

import java.util.Scanner;
public class MaxDigit {
    public static void main(String[] args)
    {
        int r, n, var = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        n = sc.nextInt();

        while (n > 0) {
            r = n % 10;
            if (var < r) {
                var = r;
            }
            n = n / 10;
        }

        System.out.println("\nThe Largest Digit is :" + var);

    }

}


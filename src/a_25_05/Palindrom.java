package a_25_05;

import java.util.Scanner;
public class Palindrom
{
    public static void main(String [] args) {

        int n, r, var = 0;
        int m ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        m = n;

        while (n > 0) {
            r = n % 10;
            var = var * 10 + r;
            n = n / 10;
        }
          if (var == m) {
              System.out.println("Numarul este palindrom");
          } else {
              System.out.println("Numarul nu este palindrom");
              }

    }

}



package a_25_05;

import java.util.Scanner;
public class MaxDigit {
    public static void main(String[] args)
    {
        int digit, inputNumber, max = 0; //dati nume sugestive variabilelor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        inputNumber = sc.nextInt();

        while (inputNumber > 0) {
            digit = inputNumber % 10;
            if (max < digit) {
                max = digit;
            }
            inputNumber = inputNumber / 10;
        }

        System.out.println("\nThe Largest Digit is :" + max);

    }

}


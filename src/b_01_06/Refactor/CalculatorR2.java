package b_01_06.Refactor;

import java.util.Scanner;

public class CalculatorR2 {


    static void calculate() {
        boolean loop=true;
        while (loop){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti primul numar: ");
            int n1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            int n2 = scanner.nextInt();
            System.out.println("Introduceti operatia dorita: ");
            String operation = scanner.next();

            switch (operation) {
                case "+":
                    System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                    break;
                case "-":
                    System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
                    break;
                case "*":
                    System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
                    break;
                case "/":
                    System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
                    break;
            }

        }
    }

    public static void main(String[]args){
         calculate();
    }

}

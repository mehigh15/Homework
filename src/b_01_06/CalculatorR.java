package b_01_06;
import java.util.Scanner;

public class CalculatorR {

    static void calculate(int n1, int n2, String operation) {

        if (operation.equals("+")) {
            System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
        } else {
            if (operation.equals("-")) {
                System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
            } else {
                if (operation.equals("*")) {
                    System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
                } else {
                    if (operation.equals("/")) {
                        System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));

                    }
                }
            }

        }

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int nr1 = sc.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int nr2 = sc.nextInt();
        System.out.println("Introduceti operatia dorita:");
        String op = sc.next();

        calculate(nr1,nr2,op);
    }
}

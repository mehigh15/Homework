package a_25_05;

import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){

        int n;
        int p = 1;
        int x = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        n = sc.nextInt();

        while (x<=n){
            p=p*x;
            x++;
        }System.out.println(p);

    }
}

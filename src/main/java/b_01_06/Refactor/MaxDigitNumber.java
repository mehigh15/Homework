package b_01_06.Refactor;


import java.util.Scanner;

public class MaxDigitNumber {

    static void maximum(int num){
        int max =0;
        int r ;
        while (num > 0) {
            r = num % 10;
            if (max < r) {
                max = r;
            }
            num = num / 10;
        }
        System.out.println(max);
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int nr=num;
        maximum(nr);
    }
}

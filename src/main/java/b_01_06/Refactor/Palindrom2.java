package b_01_06.Refactor;
import java.util.Scanner;

public class Palindrom2 {

    void func(int num){
        int r ;
        int var = 0;
        int nr=num;
        while(num>0){
           r = num % 10;
           var = var * 10 + r;
           num /= 10;
        }
        if(var==nr){
            System.out.println("Numarul este palindrom");
        }else{
            System.out.println("Numarul nu este palindrom");
        }
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int num = sc.nextInt();
        Palindrom2 p = new Palindrom2();
        int nr = num;
        p.func(nr);
    }
}

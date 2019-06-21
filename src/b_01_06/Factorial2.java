package b_01_06;
import java.util.Scanner;

 public class Factorial2 {
    void func(int n){
        int p =1;
        int x =1;
        while(x<=n){
            p=p*x;
            x++;
        }
        System.out.println(p);
    }
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int n = sc.nextInt();
        int num = n;
        Factorial2 f = new Factorial2();
        f.func(num);
    }
}

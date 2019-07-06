package b_01_06.Refactor;
import java.util.Scanner;
public class PrimeNumbers {
    static void prime(int m){
        int p;
        for (int i = 2; i<m ; i++){
            p = 0;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    p = 1;
                }
            }
            if (p==0){
                System.out.println(i);
            }
        }

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul:");
        int n = sc.nextInt();
        prime(n);
    }
}

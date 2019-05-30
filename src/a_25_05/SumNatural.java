package a_25_05;

public class SumNatural {
    public static void main(String[] args) {

        int n = 100, i = 1, sum = 0;

        while(i <= n)
        {
            sum += i;
            i++;
        }

        System.out.println("Suma primelor 100 de numere este = " + sum);
    }
}


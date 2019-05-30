package a_25_05;

public class exercise3 {
    public static void main(String[] args)
    {
        int a [] = { 3, 2, 5, 4, 0, 9, 1, 6, 7, 8 };
        int x = a[0];

        for (int element : a) {
            if (element < x) {
                x = element;
            }
        }

        System.out.println(x);
    }
}

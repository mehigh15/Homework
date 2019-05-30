package a_25_05;

public class exercise2 {
    public static void main(String[] args)
    {
        int a[] =  { 3, 2, 5, 4, 0, 9, 1, 6, 7, 8 };

        int min = a[0];

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println("Smallest Number in a given array is : " + min);
    }
}

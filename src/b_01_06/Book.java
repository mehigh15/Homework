package b_01_06;
import java.util.Scanner;

public class Book {

    public String name;
    public int numberOfPages;

    Scanner input = new Scanner(System.in);

    void func(){
        System.out.println("Enter Book Name:");
        this.name = input.nextLine();
        System.out.println("Enter Number of Pages:");
        this.numberOfPages = input.nextInt();
    }

    public static void main (String[]args){
        Book[] b = new Book[3];
        int x =0;
        while(x<3) {
            b[x] = new Book();
            b[x].func();
            x++;
        }
       System.out.println(b[0]);
    }


}

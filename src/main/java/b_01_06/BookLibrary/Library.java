package b_01_06.BookLibrary;

import java.util.List;
import java.util.ArrayList;
public class Library {

    List<Book> books = new ArrayList<>();
    static Library library = new Library();


    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {

           if (book.getName().equals("Dune")) {
               books.remove(book);
           }

    }

    public void listBooksFromLibrary(){

        for( Book book:books){
            System.out.println(book);
        }

    }


    public static void main(String[] args) {

        library.addBook(new Novel("Dune",450,"science-fiction"));
        library.addBook(new Albums("Nature",100, "Good"));
        library.addBook(new Novel("451 Fahrenheit", 500, "science-fiction"));
        library.addBook(new Albums("Forests",300,"Excellent"));
        library.addBook(new Albums("Africa",500,"Bad"));

        library.toString();

        library.listBooksFromLibrary();








    }
}

package b_01_06.BookLibrary;
public class Book {
    private String name;
    private int numberOfPages;

    public Book (String name, int numberOfPages){
        setName(name);
        setNumberOfPages(numberOfPages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }






}

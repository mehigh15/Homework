package b_01_06.BookLibrary;

import b_01_06.BookLibrary.Book;

public class Novel extends Book {

    private String type;

    public Novel(String name, int numberOfPages, String type){
        super(name,numberOfPages);
        setType(type);

    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return "\nName:" + getName() + "\nNumber of pages:" + getNumberOfPages() + "\nType:" + getType();
    }

}

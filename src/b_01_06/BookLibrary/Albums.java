package b_01_06.BookLibrary;

import b_01_06.BookLibrary.Book;

public class Albums extends Book {

    private String paperQuality;

    public Albums(String name, int numberOfPages, String paperQuality){
        super(name,numberOfPages);
        setPaperQuality(paperQuality);
    }

    public String getPaperQuality(){
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public String toString(){
        return "\nName:" + getName() + "\nNumber of pages:" + getNumberOfPages() + "\nPaper Quality:" + getPaperQuality();
    }
}

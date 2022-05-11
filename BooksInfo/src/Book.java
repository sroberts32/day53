package day53.BooksInfo.src;

public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    //title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //pages
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    //year 
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //print
    @Override
    public String toString() {
        return getTitle() + ", " + getPages() + ", " + getYear();
    }

}

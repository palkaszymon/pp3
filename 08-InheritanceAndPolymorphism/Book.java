public class Book {
    protected String title;
    protected String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    void display(){
        System.out.println("Author: " + author + " Title: " + title);
    }
}

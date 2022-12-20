public class Audiobook extends Book{
    private int minutes;
    private int seconds;

    Audiobook(String title, String author, int minutes, int seconds){
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    void display(){
        System.out.println("Author: " + author + " Title: " + title + " Length: " + minutes + ":" + seconds);
    }
}

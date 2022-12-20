public class Ebook extends Book{
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    Ebook(String title, String author, String fileName){
        super(title, author);
        this.fileName = fileName;
    }

    void display(){
        System.out.println("Filename: " + fileName + " Author: " + author + " Title: " + title);
    }
}

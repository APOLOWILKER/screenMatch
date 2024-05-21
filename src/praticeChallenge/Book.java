package praticeChallenge;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails(){
        System.out.println("Book Name: " + getTitle());
        System.out.println("Name Author: " + getAuthor());
    }
}

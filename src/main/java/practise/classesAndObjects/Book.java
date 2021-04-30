package practise.classesAndObjects;

public class Book {
    private String title, author;
    private int length;

    public Book(String title, String author, int length) {
        setTitle(title);
        setAuthor(author);
        setLength(length);
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLength(int length) {
        if (length >= 100) {
            this.length = length;
        } else {
            this.length = 100;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return length;
    }

    public String getAuthor() {
        return this.author;
    }


    public String getBook() {
        return "The book '"+getTitle()+"' is "+getLength() + " pages long. It was written by "+getAuthor()+".";
    }
}


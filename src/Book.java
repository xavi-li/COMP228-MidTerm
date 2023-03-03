// Abstract class: Book
public abstract class Book {
    private String title;
    private String isbn;
    private String publisher;
    protected double price;
    private int year;

    // constructor
    public Book(String title, String isbn, String publisher, double price, int year) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    // setter and getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // abstract methods
    public abstract String getGenre();

    public abstract void setPrice(double price);

    // toString() method returning the info of stored variables
    public String toString() {
        return "Title: " + this.getTitle()
                + "\nISBN: " + this.getIsbn()
                + "\nPublisher: " + this.getPublisher()
                + "\nPrice: $" + price
                + "\nYear: " + this.getYear();
    }
}
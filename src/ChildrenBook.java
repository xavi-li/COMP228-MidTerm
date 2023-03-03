// Subclass: ChildrenBook
public class ChildrenBook extends Book {
    // constructor
    public ChildrenBook(String title, String isbn, String publisher, double price, int year) {
        super(title, isbn, publisher, price, year);
        this.setPrice(price);
    }

    // override methods implementation
    @Override
    public String getGenre() {
        return "Children Book";
    }

    @Override
    public void setPrice(double price) {
        this.price = price; // ChildrenBook has a fixed price as the user input price.
    }
}

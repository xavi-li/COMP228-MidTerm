// Subclass: ScienceBook
public class ScienceBook extends Book {
    // constructor
    public ScienceBook(String title, String isbn, String publisher, double price, int year) {
        super(title, isbn, publisher, price, year);
        this.setPrice(price);
    }

    // override methods implementation
    @Override
    public String getGenre() {
        return "Science Book";
    }

    @Override
    public void setPrice(double price) {
        this.price = price * 0.9; // ScienceBook has a 10% discount of the user input price.
    }
}

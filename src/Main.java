import javax.swing.JOptionPane;

// Driver program
public class Main {
    public static void main(String[] args) {
        String isContinue = "";

        // loop for user input
        do {
            // input for all necessary info
            String title = JOptionPane.showInputDialog(null, "Enter the book title: ");
            String isbn = JOptionPane.showInputDialog(null, "Enter the ISBN: ");
            String publisher = JOptionPane.showInputDialog(null, "Enter the publisher: ");
            double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price: "));
            int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the year: "));
            String genre = JOptionPane.showInputDialog(null, "Enter the book type (ScienceBook or ChildrenBook): ");

            // init the appropriate class
            Book book;
            if (genre.equalsIgnoreCase("ScienceBook")) {
                book = new ScienceBook(title, isbn, publisher, price, year);
            } else if (genre.equalsIgnoreCase("ChildrenBook")) {
                book = new ChildrenBook(title, isbn, publisher, price, year);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid book type.");
                continue;
            }

            // display of result
            JOptionPane.showMessageDialog(null, book.toString() + "\nType: " + book.getGenre()
                                        + "\n\nRemarks: "
                                        + "\nScience Books have a 10% discount."
                                        + "\nChildren Books have a fixed price."
                                        );

            // check if user like to input again
            isContinue = JOptionPane.showInputDialog(null, "Continue ? (Y or N)");

        } while (isContinue.equalsIgnoreCase("Y"));

        System.out.println("=== COMP228 MidLabTest: Driver Program exits without error ===");
    }
}
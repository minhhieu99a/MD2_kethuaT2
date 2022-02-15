public class FictinonBook extends Book {
    private String category;

    public FictinonBook() {
    }

    public FictinonBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

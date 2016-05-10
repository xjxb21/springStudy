package transcation.bookRepository;

/**
 * Created by Administrator on 2016/5/6.
 * BOOK实体类
 */
public class Book {
    private int isbn;
    private String book_name;
    private int price;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

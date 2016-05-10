package transcation.bookRepository;

/**
 * Created by Administrator on 2016/5/6.
 * 书籍库存信息
 */
public class Book_stock {

    private int isbn;
    private int stock;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

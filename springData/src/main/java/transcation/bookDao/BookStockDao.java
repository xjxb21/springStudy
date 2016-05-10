package transcation.bookDao;

import transcation.exception.BookStockException;

/**
 * Created by Administrator on 2016/5/6.
 */
public interface BookStockDao {

    //库存减少
    public void subBookStock(int stockNum, int isbn) throws BookStockException;

    //库存增加
    public void addBookStock(int stockNum, int isbn);
}

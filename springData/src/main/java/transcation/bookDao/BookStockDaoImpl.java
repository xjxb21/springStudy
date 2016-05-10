package transcation.bookDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by x on 2016/5/8.
 */

@Repository("bookStockDao")
public class BookStockDaoImpl implements BookStockDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public void subBookStock(int stockNum, int isbn) {
        String sql = "SELECT stock FROM book_stock WHERE isbn=?";
        int stock = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
        //如果库存不足，则抛出异常
        if (stock < stockNum) {
            throw new RuntimeException("书籍编号：" + isbn + " 库存不足");
        }

        sql = "UPDATE book_stock SET stock=stock-? WHERE isbn=?";
        jdbcTemplate.update(sql, stockNum, isbn);
    }

    @Override
    public void addBookStock(int stockNum, int isbn) {
        String sql = "UPDATE book_stock SET stock=stock+? WHERE isbn=?";
        jdbcTemplate.update(sql, stockNum, isbn);
    }
}

package transcation.bookDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/5/6.
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void subBalance(String username, int isbn) {

        String sql = "SELECT price FROM book where isbn=?";
        //根据获取数据价格
        int bookPrice = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
        //获取账户余额
        sql = "SELECT balance FROM account WHERE username = ?";
        int blance = jdbcTemplate.queryForObject(sql, Integer.class, username);

        if (blance < bookPrice) {
            throw new RuntimeException("余额不足");
        }
        sql = "UPDATE account SET balance=balance-? WHERE username=?";
        jdbcTemplate.update(sql, bookPrice, username);
    }

    @Override
    public void addBalance(String username, int money) {
        String sql = "UPDATE account SET balance=balance+? WHERE username=?";
        jdbcTemplate.update(sql, money, username);
    }
}

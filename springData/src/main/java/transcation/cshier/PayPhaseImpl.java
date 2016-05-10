package transcation.cshier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import transcation.bookDao.AccountDaoImpl;
import transcation.bookDao.BookStockDaoImpl;

/**
 * Created by x on 2016/5/9.
 */

@Service
public class PayPhaseImpl implements PayPhase {

    @Autowired
    AccountDaoImpl accountDao;

    @Autowired
    BookStockDaoImpl bookStockDao;

    /**
     * 根据单个某本书价格付款,
     *
     * @param username 账户名
     * @param isbn     书籍编号
     */

    @Override
    @Transactional
    public void payBookfees(String username, int isbn) {
        System.out.println("购买书籍："+isbn);
        bookStockDao.subBookStock(1, isbn);
        accountDao.subBalance(username, isbn);
    }
}

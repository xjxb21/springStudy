package transcation.bookDao;

import transcation.exception.AccountException;

/**
 * Created by Administrator on 2016/5/6.
 */
public interface AccountDao {

    //购买书籍减少账户余额
    public void subBalance(String username, int isbn) throws AccountException;

    //增加账户余额
    public void addBalance(String username, int money);
}

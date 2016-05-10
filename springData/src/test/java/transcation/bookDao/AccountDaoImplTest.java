package transcation.bookDao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by x on 2016/5/7.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ApplicationContext.xml")
public class AccountDaoImplTest {

    @Autowired
    private AccountDao accountDao;

    /**
     * 根据购买书籍的isbn编号减少顾客账户的金额
     */
    @Test
    public void subBalance() throws Exception {
        String username = "zhangsan";
        int isbn = 6600001;
        accountDao.subBalance(username, isbn);
    }

    /**
     * 根据账户名增加账户余额
     * @throws Exception
     */
    @Test
    public void addBalance() throws Exception {
        String username = "zhangsan";
        int balance = 100;
        accountDao.addBalance(username, balance);
    }
}
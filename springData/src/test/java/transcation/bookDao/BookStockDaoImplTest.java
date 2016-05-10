package transcation.bookDao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by x on 2016/5/8.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ApplicationContext.xml")
public class BookStockDaoImplTest {

    @Autowired
    BookStockDaoImpl bookStockDao;

    @Test
    public void subBookStock() throws Exception {
        bookStockDao.subBookStock(4, 6600002);
    }

    @Test
    public void addBookStock() throws Exception {
        bookStockDao.addBookStock(10, 6600002);
    }
}
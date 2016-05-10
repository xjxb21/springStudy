package transcation.cshier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by x on 2016/5/9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ApplicationContext.xml")
public class PayPhaseImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    PayPhaseImpl payPhaseImpl;

    @Test
    public void payBookfees() throws Exception {
        payPhaseImpl.payBookfees("张三", 6600001);
    }
}
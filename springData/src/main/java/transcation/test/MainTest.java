package transcation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transcation.cshier.Cashier;

import java.util.Arrays;

/**
 * Created by x on 2016/5/9.
 */
public class MainTest {


    public static void main(String[] args) {
    /*
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        PayPhase payPhase = (PayPhase) ctx.getBean("payPhaseImpl");
        try {
            payPhase.payBookfees("张三", 6600001);
        } catch (AccountException e) {
            e.printStackTrace();
        } catch (BookStockException e) {
        }
            e.printStackTrace();
    */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Cashier cashier = (Cashier) ctx.getBean("shopCash");
        cashier.cashier("张三", Arrays.asList(6600001, 6600002));
    }
}


package transcation.cshier;

import java.util.List;

/**
 * Created by x on 2016/5/7.
 * 总体结帐
 */
public interface Cashier {

    //结帐
    void cashier(String username, List<Integer> listIsbn);
}

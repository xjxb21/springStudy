package transcation.cshier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by x on 2016/5/8.
 * 购买多本书时，结帐
 */
@Service("shopCash")
public class CashierImpl implements Cashier {

    @Autowired
    PayPhase payPhaseImple;

    @Override
    @Transactional
    public void cashier(String username, List<Integer> listIsbn) {
        for(int isbn : listIsbn){
            payPhaseImple.payBookfees(username, isbn);
        }
    }
}

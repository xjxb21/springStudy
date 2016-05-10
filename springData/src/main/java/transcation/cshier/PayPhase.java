package transcation.cshier;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by x on 2016/5/9.
 * 付款阶段
 */
@Transactional(transactionManager = "transcationManager")
public interface PayPhase {

    /**
     * 根据单个某本书价格付款,
     * @param username  购买人
     * @param isbn      书籍编号
     */
    void payBookfees(String username, int isbn);
}

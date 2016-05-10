package transcation.exception;

/**
 * Created by x on 2016/5/7.
 */
public class AccountException extends Exception {

    public AccountException(String msg) {
        super(msg);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountException(Throwable cause) {
        super(cause);
    }

    public AccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AccountException() {
    }
}

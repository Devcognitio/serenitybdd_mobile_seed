package co.com.devco.exceptions;

public class PurchaseIsNotCompleteException extends AssertionError {
    public static final String PURCHASE_FAILED_MESSAGE_EXCEPTION = "Your Purchase is not complete, Please check the assertion";

    public PurchaseIsNotCompleteException(String message, Throwable cause){
        super(message, cause);
    }
}

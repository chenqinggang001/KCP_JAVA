package exception;

import core.KCPContext;

public class KCPBufferDataNotEnoughToReceiveException extends RuntimeException {
    public KCPBufferDataNotEnoughToReceiveException(String message, KCPContext context) {
        super(message);
    }
}

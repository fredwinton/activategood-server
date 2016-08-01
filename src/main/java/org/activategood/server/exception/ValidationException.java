package org.activategood.server.exception;

/**
 * Created by frwill on 8/1/2016.
 */
public class ValidationException extends MidTierException {

    public ValidationException(String string) {
        super(string);
    }

    public ValidationException(Throwable e) {
        super(e);
    }

    public ValidationException(String string, Throwable e) {
        super(string, e);
    }
}

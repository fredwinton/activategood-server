package org.activategood.server.exception;

/**
 * Created by frwill on 8/1/2016.
 */
public class MidTierException extends Exception {
    private static final long serialVersionUID = -6455899029283259465L;
    //protected static final Logger log = Logger.getLogger(MidTierException.class.getName());

    public MidTierException(String string) {
        super(string);
        //log.error("MidTierException thrown: " + string + "\n" + ExceptionUtils.getFullStackTrace(this));
    }

    public MidTierException(Throwable e) {
        super(e);
        //log.error("MidTierException thrown: " + e.getMessage() + "\n" + ExceptionUtils.getFullStackTrace(e));
    }

    public MidTierException(String string, Throwable e) {
        super(string, e);
        //log.error("MidTierException thrown: " + string + "; message: " + e.getMessage() + "\n"
        //        + ExceptionUtils.getFullStackTrace(e));
    }

    @Override
    public String getMessage() {
        final String message = super.getMessage();
        return message;
    }
}

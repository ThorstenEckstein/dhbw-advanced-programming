package de.dhbw.course6.exceptions;

public class TrainTooLateException extends ApplicationRuntimeException {
    public TrainTooLateException(String message) {
        super(message);
    }

    public TrainTooLateException(ExceptionContext context) {
        super(context);
    }

    public TrainTooLateException(ExceptionContext context, Throwable cause) {
        super(context, cause);
    }
}

package de.dhbw.course6.exceptions;

public interface ContextAware {

    ExceptionContext getContext();
    void setContext(ExceptionContext exceptionContext);

}

package com.androsor.basic_of_oop.task5.dao;

import java.io.Serial;

public class DAOException extends Exception {
    @Serial
    private static final long serialVersionUID = 3466104130918546891L;

    public DAOException() {
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }

    public DAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

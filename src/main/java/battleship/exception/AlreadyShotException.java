package battleship.exception;

/**
 * Exception thrown when a player tries to shoot at a coordinate where
 * there was already a shot.
 */
public class AlreadyShotException extends Exception {

    public AlreadyShotException() {
    }

    public AlreadyShotException(String message) {
        super(message);
    }

    public AlreadyShotException(String message, Throwable cause) {
        super(message, cause);
    }

    public AlreadyShotException(Throwable cause) {
        super(cause);
    }

    public AlreadyShotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

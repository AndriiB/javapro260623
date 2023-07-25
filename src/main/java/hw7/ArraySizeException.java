package hw7;

import java.time.LocalDateTime;

public class ArraySizeException extends Exception {

    private final LocalDateTime localDateTime;

    public ArraySizeException(String message, LocalDateTime localDateTime) {
        super(message);
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}

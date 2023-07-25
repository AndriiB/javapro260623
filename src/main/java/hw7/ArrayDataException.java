package hw7;

import java.time.LocalDateTime;

public class ArrayDataException extends Exception {

    private final String name;
    private final LocalDateTime localDateTime;
    public ArrayDataException(String message, String name, LocalDateTime localDateTime) {
        super(message);
        this.name = name;
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}

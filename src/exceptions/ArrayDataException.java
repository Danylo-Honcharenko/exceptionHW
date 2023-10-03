package exceptions;

public class ArrayDataException extends Exception {
    private String message;
    public ArrayDataException(String messgae) {
        this.message = messgae;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

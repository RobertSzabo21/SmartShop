package ro.sda.javaremote38.smartshop.exceptions;

public class EntityNotFoundError extends RuntimeException{
    public EntityNotFoundError(String message) {
        super(message);
    }
}

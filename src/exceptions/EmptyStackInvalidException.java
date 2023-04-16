package exceptions;

public class EmptyStackInvalidException extends RuntimeException{

    public EmptyStackInvalidException(){
        super("you can't use this method if the stack is empty");
    }
}

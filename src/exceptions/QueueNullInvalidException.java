package exceptions;

public class QueueNullInvalidException extends RuntimeException{

    public QueueNullInvalidException(){
        super("The queue is empty");
    }
}

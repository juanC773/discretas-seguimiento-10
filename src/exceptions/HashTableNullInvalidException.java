package exceptions;

public class HashTableNullInvalidException extends RuntimeException{

    public HashTableNullInvalidException(){
        super("You can't use this method because the item they indicate doesn't exist");
    }
}

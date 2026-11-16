package Unit_5_Exception_Handling_and_Multithreading;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    } 
}

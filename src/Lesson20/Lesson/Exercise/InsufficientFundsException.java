package Lesson20.Lesson.Exercise;

// Hvis saldoen ikke rækker
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
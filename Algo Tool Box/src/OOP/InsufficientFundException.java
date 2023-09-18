package OOP;

public class InsufficientFundException extends Throwable {
    double amount ;
    InsufficientFundException(double amt){
        amount=amt;
    }
}

package day23;

public class UserDefineExceptionExample {

    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email address");
        }
    }


    public static void main(String[] args) {
        try {
            validateEmail("abcgmail.com");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
    
}


 class InvalidEmailException extends Exception {

    public InvalidEmailException(String message) {
        super(message);
    }
    
}
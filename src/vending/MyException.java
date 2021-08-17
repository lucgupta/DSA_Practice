package vending;

public class MyException extends RuntimeException {
    private String message;

    public MyException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage(){
        return message;
    }
}

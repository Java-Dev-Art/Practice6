public class MyException extends Exception{
    private String massage;

    public MyException(String massage) {
        super(massage);
        this.massage = massage;
    }
}

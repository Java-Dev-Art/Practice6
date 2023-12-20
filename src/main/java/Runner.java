public class Runner {
    public static void main(String[] args) {
        try {

            System.out.println(MyString.counter(";qw;4;52;27;\n" +
                    "15;;;k;5\n" +
                    "1;-314;fgh;5\n" +
                    "0;;e1;2;3\n" +
                    "-23;a;b;c\n" +
                    "b;d;e"));
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }
}

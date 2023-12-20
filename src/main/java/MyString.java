

public class MyString {
    public static int counter(String source) throws MyException {
        if (source.isEmpty()){
            throw new MyException("String cannot be an empty");
        }
        if (source.equals(null)){
            throw new MyException("String cannot be a null");
        }
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String[] elements = source.split(";");

        for (String element: elements){
            for (int i = 0; i < element.length();i++){
                char chr = element.charAt(i);
                if (Character.isDigit(chr)){
                    var el = Integer.parseInt(element);
                    sum += el;
                }
                else if (Character.isLetter(chr)){
                    stringBuilder.append(element);
                }else {
                    throw new MyException("This is not digit and not letter");
                }
            }
        }
        System.out.println(stringBuilder);
        return sum;
    }
}

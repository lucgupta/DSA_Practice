package basicConcepts;

interface Parser {
    String parse(String str);
}

class StringParser {
    public String convert(String str) {
        if(str.length() < 3)
            str = str.toUpperCase();
        else
            str = str.toLowerCase();
        return str;
    }
}

class MyPrinter {
    public void print(String str, Parser p) {
        str = p.parse(str);
        System.out.println(str);
    }
}

public class MethodReference {
    public static void main(String[] args) {
        StringParser sp = new StringParser();
        String str = "Lucky";
        MyPrinter mp = new MyPrinter();
        //using lambda function
        mp.print(str, (s) -> sp.convert(s));

        //using method reference
        String str1 = "Lovey";
        mp.print(str1, sp::convert);
    }
}

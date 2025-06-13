import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        char [] ch = {'က', 'ခ', 'ဂ', 'ဃ', 'င'};
        String s1 = new String(ch);
        String s2 = "ကခဂဃင";
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        for(int i = 0; i < ch.length; i++){
            System.out.println(ch[i]);
        }
        for(char c : ch) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(ch));
    }
}

/**
 * Create String *  Literal, new Keyword
 *
 */

class String1{
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "Welcome";
        System.out.println(s1 + " " + s2);
    }

    //JVM
}

class String2 {
    public static void main(String[] args) {
        String s1 = new String("Welcome");
        String s2 = new String("Welcome");
        System.out.println(s1 + " " + s2);
    }
}

class String3 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1 + " B K";

        int length = s2.length();
        System.out.println(s2);
        System.out.println("Length: " + length);
    }
}

class StringBuffer1{  //java 1.0
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(", B K");

        sb.insert(2, "Aung Aung");
        System.out.println(sb);
        sb.delete(2,6);
        System.out.println(sb);
    }
}

class StringBuilder1 { //java 1.5
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", B K");

        sb.insert(2, "Aung Aung");
        System.out.println(sb);
        sb.delete(2,6);
        System.out.println(sb);
    }
}

//Immutable String

class  ImmutableString1 {
    public static void main(String[] args) {
        //မူလ စာသား
        String orignalString = "Java";
        System.out.println("မူလစာသား: " + orignalString);

        String modifiedString =  orignalString.concat(" Programming");

        System.out.println("ထည့်ဖြည့်တဲ့ စာသား: " + modifiedString);

        String upperCaseString = orignalString.toUpperCase();
        System.out.println("မူလစာသားကို အကြီးဖြင့်ပြောင်းသော " + upperCaseString);
    }
}

class StringMemoryAllotment {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        System.out.println("str1 == str2: " + (str1 == str2));

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println("str3 == str4: " + (str3 == str4));

        String str5 = str3.intern();
        System.out.println("str1 == str5: " + (str1 == str5));

        String str6 = new String("Java").intern();
        System.out.println("str1 == str6: " + (str1 == str6));

    }
}

class CharArrayToString {
    public static void main(String[] args) {
        char [] charArray ={'က', 'ခ', 'ဂ', 'ဃ', 'င', 'စ', 'ဆ', 'ဈ', 'ည'};

        String resultString = new String(charArray, 0, 5);

        System.out.println(resultString);
    }
}

class String4 {
    public static void main(String[] args) {
        String s1 = "Java";
        char ch[] = {'က', 'ခ', 'ဂ', 'ဃ', 'င', 'စ', 'ဆ', 'ဈ', 'ည'};
        String s2 = new String(ch);
        String s3 = new String("က,ခ,ဂ, ဃ, င, စ,ဆ, ဈ, ည");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

/**
 * OOP
 *
 * Object
 * Class
 * Inheritance
 *  - Aggregation
 *
 *  Polymorphism
 *
 *  - Abstraction
 *
 *  - Encapsulation
 */
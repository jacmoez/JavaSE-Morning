import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Java Regular Expressions (Regex)
 *
 * 1, MatchResult interface
 * 2, Matcher class
 * 3, Pattern class
 * 4, PatternSyntaxException class
 */

public class Regx {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Regx1 {
    public static void main(String[] args) {

        //1st way
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("rs");
        Boolean b = m.matches();

        //2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        //3nd Way
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b + " " + b2 + " " + b3);
    }
}
class Regex2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches(".s", "mk"));
        System.out.println(Pattern.matches(".s", "msk"));
        System.out.println(Pattern.matches("..s", "ams"));

    }
}

class Regex3 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[ams]", "abcd"));
        System.out.println(Pattern.matches("[ams]", "a"));
        System.out.println(Pattern.matches("[ams]", "amsltd"));
    }
}

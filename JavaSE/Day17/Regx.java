import java.util.Scanner;
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

class Regx4 {
    public static void main(String[] args) {
        System.out.println("? quantifier...");
        System.out.println(Pattern.matches("[ams]?", "a"));
        System.out.println(Pattern.matches("[ams]?", "aammmss"));
        System.out.println(Pattern.matches("[ams]?", "aaa"));
        System.out.println(Pattern.matches("[ams]?", "aammd"));

        System.out.println("+ quantifier...");
        System.out.println(Pattern.matches("[ams]+", "a"));
        System.out.println(Pattern.matches("[ams]+", "aas"));
        System.out.println(Pattern.matches("[ams]+", "aaddsss"));

        System.out.println("* quantifier....");
        System.out.println(Pattern.matches("[ams]*", "ammmsa"));
    }
}

class Regx5 {
    public static void main(String[] args) {
        System.out.println("metacharacters d....");

        System.out.println(Pattern.matches("\\d", "abc"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "443"));
        System.out.println(Pattern.matches("\\d", "443abc"));

        System.out.println("metacharacters D....");
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "443"));
        System.out.println(Pattern.matches("\\D", "443abc"));
        System.out.println(Pattern.matches("\\D", "a"));
        System.out.println(Pattern.matches("\\D*", "ams"));
    }
}

class Regex6 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "ams123"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "amsltd123"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "ams!$3"));
    }
}

class Regex7 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "99552334450"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "123456123"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "6953038949"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{6}", "695789097"));
    }
}

class Regx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter regex pattern: ");
            Pattern pattern = Pattern.compile(scanner.nextLine());
            System.out.print("Enter text: ");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            boolean found = false;
            while (matcher.find()){
                System.out.println("I found the text " + matcher.group()+ " starting at index " + matcher.start() + " and ending at index " + matcher.end());
                found = true;
            } if (!found) {
                System.out.println("No match found.");
            }
        }
    }
}
/***
 * Core Java
 *
 * Spring Java
 *
 * Fontend
 *
 * Andoid, ios
 *
 * DevOp
 */
//String and Type Information
/*(9)Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression
     that checks a sentence to see that it begins with a capital letter and ends with a period.
*/
import java.util.regex.Pattern;

public class Java9 {
    public static void main(String[] args) {
        String sentence = "I am Anudeep from Zemoso.";
        String regex = "^[A-Z].*\\.$";
        if (Pattern.matches(regex, sentence)) {
            System.out.println("The sentence matches the pattern.");
        } else {
            System.out.println("The sentence does not match the pattern.");
        }
    }
}

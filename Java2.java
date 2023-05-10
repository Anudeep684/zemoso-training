/*(2)Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.*/
import java.util.HashSet;
import java.util.Set;

public class Java2 {
    public static void main(String[] args) {
        String input = "I am Anudeep from Zemoso";
        
        if (containsAllLetters(input)) {
            System.out.println("The input string contains all the letters of the alphabet.");
        } else {
            System.out.println("The input string does not contain all the letters of the alphabet.");
        }
    }
    
   
    public static boolean containsAllLetters(String input) {
        
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < cleanedInput.length(); i++) {
            letters.add(cleanedInput.charAt(i));
        }
        
      
        return letters.size() == 26;
    }
}
//time complexity: O(n)
//space complexity: O(1)

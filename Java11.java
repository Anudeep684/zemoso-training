/*I/O

(11)Using TextFile and a Map<Character,Integer>, create a program that takes the file name as a
   command line argument and counts the occurrence of all the different characters. Save the results in a text file.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Java11 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java CharacterCounter <file>");
            System.exit(1);
        }

        String filename = args[0];
        Map<Character, Integer> characterCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int c;
            while ((c = reader.read()) != -1) {
                char character = (char) c;
                characterCounts.merge(character, 1, Integer::sum);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
                char character = entry.getKey();
                int count = entry.getValue();
                writer.write(String.format("%c: %d%n", character, count));
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            System.exit(1);
        }
    }
}

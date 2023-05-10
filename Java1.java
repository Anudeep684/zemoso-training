/*(1)Create a java program to search through the home directory and look for files that match 
     a regular expression. The program should be able to take inputs repeatedly and should 
     print out the full absolute path of the matching files found.*/

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter regular expression to search for files: ");
            String regex = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);

            File homeDirectory = new File(System.getProperty("user.home"));
            File[] matchingFiles = homeDirectory.listFiles((dir, name) -> pattern.matcher(name).matches());

            if (matchingFiles.length > 0) {
                System.out.println("Matching files found:");
                for (File file : matchingFiles) {
                    System.out.println(file.getAbsolutePath());
                }
            } else {
                System.out.println("No matching files found.");
            }

            System.out.print("Search again? (y/n) ");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }
    }
}

/*Output:
Open Command Prompt
C:\Zemoso Work\Java assignments>javac Java1.java
C:\Zemoso Work\Java assignments>java Java1

Enter regular expression to search for files: ^[A-Z].*

Matching files found:
C:\Users\saian\AppData
C:\Users\saian\Application Data
C:\Users\saian\Contacts
C:\Users\saian\Cookies
C:\Users\saian\Documents
C:\Users\saian\Downloads
C:\Users\saian\Favorites
C:\Users\saian\Functional components and class componen.md
C:\Users\saian\IBA_IOAPDATA
C:\Users\saian\IntelGraphicsProfiles
C:\Users\saian\Links
C:\Users\saian\Local Settings
C:\Users\saian\Music
C:\Users\saian\My Documents
C:\Users\saian\NetHood
C:\Users\saian\NTUSER.DAT
C:\Users\saian\NTUSER.DAT{a2332f18-cdbf-11ec-8680-002248483d79}.TM.blf
C:\Users\saian\NTUSER.DAT{a2332f18-cdbf-11ec-8680-002248483d79}.TMContainer00000000000000000001.regtrans-ms
C:\Users\saian\NTUSER.DAT{a2332f18-cdbf-11ec-8680-002248483d79}.TMContainer00000000000000000002.regtrans-ms
C:\Users\saian\OneDrive
C:\Users\saian\PrintHood
C:\Users\saian\Recent
C:\Users\saian\Saved Games
C:\Users\saian\Searches
C:\Users\saian\SendTo
C:\Users\saian\Start Menu
C:\Users\saian\Storybook is an open-source tool that he.md
C:\Users\saian\Templates
C:\Users\saian\Untitled-3.md
C:\Users\saian\Videos
Search again? (y/n) n

*/

import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
/**
 *A program to search through the home directory and look for files that match given regular expression.
 *It takes inputs repeatedly based on number of times to search and prints out the full absolute path
 *of the matching files found and implemented Exception Handling to handle null pointer Exception.
 */
public class RegexClass{

    public static void checkForFiles(String regex, String filePath) {
        try {
            File file = new File(filePath);
            if (file == null)
                return;
            File[] allFiles = file.listFiles();
            if(allFiles == null)
                return;
            for (File isFile : allFiles) {
                // if we find a directory call the method with the subDirectory name and same regular expression
                if (isFile.isDirectory())
                {
                    // if(isFile.list().length>-1) {
                    checkForFiles(regex, isFile.getAbsolutePath());
                    //  }
                }
                else {
                    //If its a file we print the absolute path
                    String fileName = isFile.getName();
                    if (Pattern.matches(regex, fileName))
                        System.out.println(isFile.getAbsolutePath());
                }
            }
        }
        //handle the empty file/directory's NullPointerException
        catch (NullPointerException exception) {
            exception.printStackTrace();
            System.out.println("NullPointerException Caught!");
        }
    }
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the regular expression :");
        String regex = scanner.nextLine();
        String filepath ="/home";
        System.out.println("Enter how many times to run :");
        //This helps to take input recursively and stop after several times, in this way it avoid StackOverFlow
        int times = scanner.nextInt();
        while (times-- >0) {
            // Assignments Directory
            // findMatchingFiles(".*/*.java","/home/sunandini/JavaAssignments");

            checkForFiles(regex, filepath);

        }
    }

}

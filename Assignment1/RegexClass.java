import java.util.*;
import java.io.*;
import java.util.logging.Logger;
import java.util.regex.Pattern;
public class RegexClass{
    private static Logger logger = Logger.getLogger(RegexClass.class.getName());
    /**
     *A program to search through the home directory and look for files that match given regular expression.
     *It takes inputs repeatedly based on number of times to search and prints out the full absolute path
     *of the matching files found and handles null pointer exceptions.
     * @param regex String that holds the regular expression to match
     * @param filePath String to search for files in that filepath directory
     * @throws NullPointerException if an empty file is found
     * @param file variable to hold a file
     * @param allFiles is an array of files that are present in directory
     * @param fileName variable to hold name of the file
     */
    public static void checkForFiles(String regex, String filePath) {
        try {
            File file = new File(filePath);
            if (file == null)
                return;
            File[] allFiles = file.listFiles();
            if(allFiles == null)
                return;
            for (File isFile : allFiles) {
                if (isFile.isDirectory())
                {
                    checkForFiles(regex, isFile.getAbsolutePath());
                }
                else {
                    String fileName = isFile.getName();
                    if (Pattern.matches(regex, fileName))
                        logger.info(isFile.getAbsolutePath());
                }
            }
        }
        catch (NullPointerException exception) {
            exception.printStackTrace();
            logger.info("NullPointerException Caught!");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter the regular expression :");
        String regex = scanner.nextLine();
        String filepath ="/home";
        logger.info("Enter how many times to run :");
        int times = scanner.nextInt();
        while (times-- >0) {
            checkForFiles(regex, filepath);
        }
    }
}

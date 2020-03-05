import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class RegexClass {

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
//                    if(isFile.list().length>-1) {
                        checkForFiles(regex, isFile.getAbsolutePath());
//                    }
            }
                else {
                    String fileName = isFile.getName();
                    if (Pattern.matches(regex, fileName))
                        System.out.println(isFile.getAbsolutePath());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
            public static void main(String[] args)
            {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter how many times to run :");
                int times = scanner.nextInt();
                while (times-- >0) {
                    // Assignments Directory
                   // findMatchingFiles(".*/*.java","/home/sunandini/JavaAssignments");

                    // home directory
                   checkForFiles(".*/*.java", "/home");

                }
            }

        }




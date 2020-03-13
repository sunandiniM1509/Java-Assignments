import java.io.*;
import java.util.*;
import java.util.logging.Logger;
/**
 *Java program that accepts a text file (input.txt) as an input through command line arguments and counts the
 *occurrence of all the different characters and saves the result in a text file (output.txt).
 */
class CountOccurrences
{
    static Logger logger = Logger.getLogger(CountOccurrences.class.getName());
    public static void main(String args[]) 
    {
        try {
            File file = new File(args[0]);
            int fpointer = 0;
            HashMap<Character, Integer> CharacterCount = new HashMap<Character, Integer>();
            FileReader freader = new FileReader(file);
            while ((fpointer = freader.read()) != -1) {
                char ch = (char) fpointer;
                if (ch != ' ' && ch != '\t' && ch != '\n') {
                    if (!CharacterCount.containsKey(ch))
                        CharacterCount.put(ch, 1);
                    else
                        CharacterCount.put(ch, (int) CharacterCount.get(ch) + 1);
                }
            }
            FileWriter fwriter = new FileWriter("output.txt");
            PrintWriter pwriter = new PrintWriter(fwriter);
            pwriter.printf("Character and Occurrence Chart\n");
            for (Map.Entry<Character, Integer> entry : CharacterCount.entrySet())
                pwriter.printf("   " + (char) entry.getKey() + " occurred " + (int) entry.getValue() + " times\n");
            logger.info("Result is successfully stored in output.txt file");
            pwriter.close();
        }
        catch (FileNotFoundException exception)
        {
            logger.info("FileNotFoundException is caught!");
            exception.printStackTrace();
        }
        catch (IOException exceptionIO)
        {
            logger.info("IOException is caught!");
            exceptionIO.printStackTrace();
        }
    }
}

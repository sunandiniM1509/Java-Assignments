import java.io.*;
import java.util.*;

class CountOccurrences
{
    public static void main(String args[]) throws Exception
    {
        try {
            File file = new File(args[0]);
            int fpointer = 0;
            HashMap<Character, Integer> CharacterCount = new HashMap<Character, Integer>();
            FileReader freader = new FileReader(file);
            //file pointer == -1 --> not a valid index, end of the file
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
            //System.out.println("");
            for (Map.Entry<Character, Integer> entry : CharacterCount.entrySet())
                pwriter.printf("   " + (char) entry.getKey() + " occurred " + (int) entry.getValue() + " times\n");
            System.out.println("Result is successfully stored in output.txt file");
            pwriter.close();
        }
        catch (Exception e)
        {
            System.out.println("File not found Exception: e");
            e.printStackTrace();
        }
    }
}

import java.util.*;
import java.util.logging.Logger;

public class OptimizedParser {
    private static Logger logger = Logger.getLogger(OptimizedParser.class.getName());
    /**
     *A java function to check if the input string contains all the letters of the alphabet a-z (case-insensitive)
     *@param input String to hold user provided input
     *
     *The algorithm has the Time Complexities as :
     *            :  Best Case              - Constant Time Complexity  - O(1) {in a sequence of "abcdefghijklmnopqrstuvwxyz" O(26) ~~ O(1)}
     *            :  Worst and Average Case - Linear Time Complexity of - O(n) where n is the length of the string.
     *
     *The algorithm has constant Space Complexity as O(1) {O(26) ~~ O(1)}
     *           :a HashSet of fixed size of max length 26 is used
     */
    static boolean checkCharacter(String input)
    {
        int length = input.length();
        if(length<26)
            return false;
        HashSet<Character> storeChars = new HashSet<Character>();
        for(int i=0;i<length;i++)
        {
            char key = input.charAt(i);
            if(!storeChars.contains(key))
                storeChars.add(key);
            if(storeChars.size()>=26)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter an input string to parse");
        String input =scanner.nextLine();
        if(checkCharacter(input))
            logger.info("Yes, The given input String contain all the {a-z} characters");
        else
            logger.info("No, The given input String does not contain all the {a-z} characters");
    }
}


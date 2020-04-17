import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/**
 *Using java.util.regex.Pattern as a resource, a function is written to
 *check if a sentence begins with a capital letter and ends with a period.
 */
class RegexCaps
{
    static Logger logger = Logger.getLogger(RegexCaps.class.getName());
    public static void main(String args[])throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if(checkConstraints(input))
            logger.info("Yes, the string starts with a Capital letter and ends with a '.' ");
        else
            logger.info("No, the string does not start with a Capital letter and end with a '.' ");
    }
    public static boolean checkConstraints(String input)
    {
        String regex = "^[A-Z].*[.]";
        if(Pattern.matches(regex,input))
        {
            return true;
        }
        return false;
    }
}

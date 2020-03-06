import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
/**
*Using java.util.regex.Pattern as a resource, a function is written to 
*check if a sentence begins with a capital letter and ends with a period.
*/
class RegexCaps
{
    public static void main(String args[])throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "^[A-Z].*[.]";
        String input = reader.readLine();
        if(Pattern.matches(regex,input))
            System.out.println("Yes, the string starts with a Capital letter and ends with a '.' ");
        else
            System.out.println("No, the string does not start with a Capital letter and end with a '.' ");
    }
}

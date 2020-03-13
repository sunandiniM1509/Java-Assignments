import java.util.*;
import java.util.logging.Logger;

/**
 *A java program to print first 100 vampire numbers.
 */
class VampNumbers {
    private static Logger logger = Logger.getLogger(VampNumbers.class.getName());
    /**
     * A function used to check the length of the number passed
     * @param n long to hold the number
     * @return int value which is length of the number n
     */
    public static int digitLength(long n)
    {
        return Long.toString(n).length();
    }
    /**
     * Check if a number n having factors a,b is a vampire number or not
     * @param n long to hold the number
     * @param a first factor of n
     * @param b second factor of n
     * @return true or false based on conditions provided
     */
    public static boolean checkforVampire(long n, long a, long b)
    {
        if(Long.toString(a).endsWith("0") && Long.toString(b).endsWith("0"))
            return false;
        int length = digitLength(n);
        if(digitLength(a) != length / 2 || digitLength(b) != length / 2)
            return false;
        char[] actual = Long.toString(n).toCharArray();
        char[] real = (Long.toString(a)+Long.toString(b)).toCharArray();
        Arrays.sort(actual);
        Arrays.sort(real);
        return Arrays.equals(actual, real);
    }
    public static void main(String[] args)
    {
        List<Long> vampireNumbersList = new ArrayList<Long>();
        int j=1;
        for(long i=1260; vampireNumbersList.size()<100; i++)
        {
            if((digitLength(i) % 2) == 0)
            {
                for(long a=2; a<=Math.sqrt(i); a++){

                    if(i%a==0)
                    {
                        long b= i/a;
                        if(checkforVampire(i,a,b) && a<=b)
                        {
                            vampireNumbersList.add(i);
                            logger.info("The "+ j++ +" vampire number is " +i);
                            break;
                        }
                    }
                }
            }
        }
    }
}

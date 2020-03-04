import java.util.*;

class VampNumbers {
    public static int digitLength(long n)
    {
        return Long.toString(n).length();
    }

    public static boolean checkforVampire(long n, long a, long b)
    {
    	//check for trailing zeros
        if(Long.toString(a).endsWith("0") && Long.toString(b).endsWith("0")) 
            return false;
        // check for size = length / 2
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
            	// O( root N ) complexity to find factors
            for(long a=2; a<=Math.sqrt(i); a++){

                if(i%a==0)
                {
                    long b= i/a;
                    if(checkforVampire(i,a,b) && a<=b)
                    {
                        vampireNumbersList.add(i);
                        System.out.println(j++ +" "+i);
                        break;
                    }
                }
            }
        }
        }
    }
}

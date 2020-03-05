import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class KYC
{
    /**
     * Taking the signup date and the current date as Input in the form of dd-mm-yyyy , this program provides the allowable date range for
     * the form date in the format dd-mm-yyyy.
     */
    public static void setCalendarDate(Calendar calendar,int date,int month,int year)
    {
        calendar.set(Calendar.DATE,date);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.YEAR,year);
    }
    public static int[] getCalendarDate(String str)
    {
        StringTokenizer stokenizer = new StringTokenizer(str,"-");
        int DateStrings[]= new int[3];
        int i=0;
        while(stokenizer.hasMoreTokens())
            DateStrings[i++] = Integer.parseInt(stokenizer.nextToken());
        return DateStrings;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dformater = new SimpleDateFormat("dd-MM-yyyy");
        int t = Integer.parseInt(breader.readLine());// number of test cases
        while(t>0)
        {
            t--;
            String input[] = breader.readLine().split(" ");

            int joiningDate[] = getCalendarDate(input[0]);
            int currentDate[] = getCalendarDate(input[1]);
            
            Calendar c1 = Calendar.getInstance();
            setCalendarDate(c1, joiningDate[0], joiningDate[1]-1, joiningDate[2]);

            Calendar c2 = Calendar.getInstance();
            setCalendarDate(c2,currentDate[0],currentDate[1]-1,currentDate[2]);

            // if joining date is after current date
            if(c1.getTime().after(c2.getTime()))
            {
                System.out.println("\nEnter a valid range");
                continue;
            }
            c1.set(Calendar.YEAR, currentDate[2]);
            Date presentDate = c2.getTime();

            c1.add(Calendar.DATE,-30);
            System.out.print("\n"+dformater.format(c1.getTime()));

            c1.add(Calendar.DATE,60);

            if(c1.getTime().after(presentDate))
                System.out.println(" "+dformater.format(presentDate));
            else
                System.out.println(" "+dformater.format(c1.getTime()));
        }
    }

}

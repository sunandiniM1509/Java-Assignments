import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class KYC {
     /**
     * Taking the signup date and the current date as Input in the form of dd-mm-yyyy , this program provides the allowable date range for
     * the form date in the format dd-mm-yyyy.
     */
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static LocalDate getDate(String date)
    {
        return LocalDate.parse(date,dtf);
    }

    public static int getYear(String date)
    {
        return Integer.parseInt(date.substring(6));
    }

    public static void printDate(LocalDate d1,LocalDate d2)
    {
        System.out.println(dtf.format(d1)+" "+dtf.format(d2));
    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());

        while(times>0)
        {
            times--;
            String input[] = br.readLine().split(" ");
            LocalDate joiningDate = getDate(input[0]);
            LocalDate currentDate = getDate(input[1]);
            if(joiningDate.equals(currentDate))
                printDate(joiningDate,joiningDate.plusDays(30));
            else if(joiningDate.isAfter(currentDate))
                System.out.println("No valid range available");
            else 
            {
                int joiningYear = getYear(input[0]);
                int currentYear = getYear(input[1]);
                joiningDate = joiningDate.plusYears(currentYear-joiningYear);
                if(joiningDate.plusDays(30).isAfter(currentDate))
                    printDate(joiningDate.minusDays(30), currentDate);

                else
                    printDate(joiningDate.minusDays(30), joiningDate.plusDays(30));
            }
        }
    }
}

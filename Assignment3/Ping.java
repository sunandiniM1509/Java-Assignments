import java.util.*;
import java.io.*;
import java.util.logging.Logger;
import java.util.regex.Pattern;
public class Ping
{
    private static Logger logger = Logger.getLogger(Ping.class.getName());
    /**
     * Java function that will ping any host and computes the median of the time taken to ping.
     * The system ping utility is used.
     * @param command String to hold the utility command passed through main method
     * @throws IndexOutOfBoundsException for trying to access an invalid host
     * @throws IOException for handling readLine() and exec() methods
     */
    public static void storePingResponse (String command)  {
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            ArrayList<Float> pingtime = new ArrayList<>();
            String response = "";
            while ((response = reader.readLine()) != null) {
                if (Pattern.matches(".*time=.*", response)) {
                    String segments[] = response.split(" ");
                    String pingSeconds = segments[segments.length - 2].substring(5);
                    logger.info(response);
                    pingtime.add(Float.parseFloat(pingSeconds));
                }
            }
            Collections.sort(pingtime);
            int length = pingtime.size();
            if (length % 2 == 0)
                logger.info("Median of the time taken to ping = " + (pingtime.get(length / 2) + pingtime.get(length / 2 - 1)) / 2 + " ms");
            else
                logger.info("Median of the time take to ping = " + pingtime.get(length / 2) + " ms");
        }
        catch (IndexOutOfBoundsException exception)
        {
            exception.printStackTrace();
            logger.info("Caught IndexOutOfBounds exception");
        }
        catch (IOException exception2)
        {
            exception2.printStackTrace();
            logger.info("Caught IOException");
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        logger.info("url of the host is : ");
        String url = scanner.nextLine();
        logger.info("number of times to ping :");
        int pingCount = scanner.nextInt();
        storePingResponse("ping -c" + pingCount + " " + url);
    }
}

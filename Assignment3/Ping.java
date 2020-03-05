import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
public class Ping
{
    //function that will ping any host ( given as input ) and computes the median of the time taken to ping
    public static void storePingResponse(String command) throws IOException {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            ArrayList<Float> pingtime = new ArrayList<>();
            String response="";
            while ((response = reader.readLine()) != null)
            {
                if(Pattern.matches(".*time=.*",response))
                {
                    //  example response : "64 bytes from maa03s26-in-f14.1e100.net (172.217.167.142): icmp_seq=3 ttl=57 time=18.6 ms"
                    String segments[] = response.split(" ");
                    //[time=18.6] to 18.6
                    String pingSeconds = segments[segments.length-2].substring(5);
                    System.out.println(response);
                    pingtime.add(Float.parseFloat(pingSeconds));
                }
            }
            Collections.sort(pingtime);
                int length = pingtime.size();
                if(length % 2 == 0)
                    //Median of the pingtime ArrayList
                    System.out.println("Median of the time taken to ping = "+(pingtime.get(length/2) + pingtime.get(length/2-1))/2+" ms");
                else
                    System.out.println("Median of the time take to ping = "+pingtime.get(length/2)+" ms");
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);
        System.out.print("url of the host is : ");
        String url = scanner.nextLine();
        System.out.print("number of times to ping :");
        int pingCount = scanner.nextInt();
        storePingResponse("ping -c" + pingCount + " " + url);
    }
}

package sunandini.assignment.singleton;
public class Singelton
{
  private static Logger logger = Logger.getLogger(Singleton.class.getName());
  public String str;
/**
*Adding a static method that takes String as parameter which return object of that class. 
*/
  public static Singelton initString(String str)
  {
    Singelton sn = new Singelton();
    sn.str = str;
    return sn;
  }
/**
*Adding a non static method to print the String.
*/
  public void print()
  {
   logger.info(str);
  }
}

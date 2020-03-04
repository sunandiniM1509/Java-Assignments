package sunandini.assignment.singleton;

public class Singelton
{
  public String str;
  
  public static Singelton initString(String str)
  {
    Singelton sn = new Singelton();
    sn.str = str;
    return sn;
  }
  public void print()
  {
   System.out.println(str);
  }
}

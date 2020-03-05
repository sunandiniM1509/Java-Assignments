package sunandini.assignment.singleton;
/**Added a static method that takes String as parameter which return object of that class. 
Added a non static method to print the String.*/

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

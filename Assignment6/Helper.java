/**
*A class with two (overloaded) constructors. Calling the second constructor inside the first one.
*/
class Initializer
{
    private static Logger logger = Logger.getLogger(RegexClass.class.getName());
    String string1,string2;
    Initializer()
    {
        this("Competitive Programming ,","Software Development");
    }
    Initializer(String string1,String string2)
    {
        this.string1 = string1;
        this.string2 = string2; 
    }
}
class Helper
{
    public static void main(String args[])
    {
        Initializer initobj = new Initializer();
        System.out.println(initobj.string1+" "+initobj.string2);
    }
}

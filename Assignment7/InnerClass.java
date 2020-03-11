/**
 * A Base class with an inner class that has a non-default constructor is generated
 *Another class with an inner class that inherits from the first inner class
 */
class Base1
{
    class Inner1
    {
        Inner1(String string)
        {
            System.out.println(string);
        }
    }
}
class Base2
{
    Base2(String string)
     {
       Inner2 obj = new Inner2(string);
      }
    class Inner2 extends Base1.Inner1
    {
        Inner2(String string)
        {
            new Base1().super(string);
        }
    }
}
class InnerClass
{
    public static void main(String args[])
    {
        //  new Base2("Inner Class reference ");
    }
}

/**A Base class with an inner class that has a non-default constructor 
*Another class with an inner class that inherits from the first inner class.*/
class Base1
{
    class Inner1
    {
        Inner1(String s)
        {
            System.out.println(s);
        }
    }
}

class Base2
{
   // Base2(String s)
   // {
    //    Inner2 obj = new Inner2(s);
  //  }
    class Inner2 extends Base1.Inner1
    {
        Inner2(String s)
        {
            new Base1().super(s);
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

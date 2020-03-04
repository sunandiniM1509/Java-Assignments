class Initializer
{
    String a,b;
    Initializer()
    {
        this("Competitive Programming ,","Software Development");
    }
    //Constructor Overloading
    Initializer(String a,String b)
    {
        this.a = a;
        this.b = b; 
    }
}

class Helper
{
    public static void main(String args[])
    {
        Initializer initobj = new Initializer();
        System.out.println(initobj.a+" "+initobj.b);
    }
}

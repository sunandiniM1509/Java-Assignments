
/**
*This program creates three custom Exceptions and a Handler class to throw all three. 
*A finally block is added to verify if the clause is executed.
*/
class UserException1 extends Exception
{
    public UserException1(String string1)
    {
        System.out.println(string1);
    }
}

class UserException2 extends Exception
{
    public UserException2(String string2)
    {
        System.out.println(string2);
    }
}

class UserException3 extends Exception
{
    public UserException3(String string3)
    {
        System.out.println(string3);
    }
}
class Handler {
    public static void handlingThrown(int xvalue) {
        try {
            switch (xvalue) {
                case 1:
                    throw new UserException1("User Defined Exception 1");
                case 2:
                    throw new UserException2("User Defined Exception 2");
                case 3:
                    throw new UserException3("User Defined Exception 3");
            }
        } catch (Exception exception) {
            System.out.println("User Defined Exception caught");
        } finally {
            System.out.println("Finally block is executed");
            System.out.println();
        }
    }
}
public class HandleException {
    public static void main(String args[]) {
        Handler.handlingThrown(1);
        Handler.handlingThrown(2);
        Handler.handlingThrown(3);
    }
}




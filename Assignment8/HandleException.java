
class UserException1 extends Exception
{
    public UserException1(String s)
    {
        System.out.println(s);
    }
}

class UserException2 extends Exception
{
    public UserException2(String s)
    {
        System.out.println(s);
    }
}

class UserException3 extends Exception
{
    public UserException3(String s)
    {
        System.out.println(s);
    }
}
class Handler {
    public static void handlingThrown(int x) {
        try {
            switch (x) {
                case 1:
                    throw new UserException1("User Defined Exception 1");
                case 2:
                    throw new UserException2("User Defined Exception 2");
                case 3:
                    throw new UserException3("User Defined Exception 3");
            }
        } catch (Exception e) {
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




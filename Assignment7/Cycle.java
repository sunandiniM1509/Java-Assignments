import java.util.logging.Logger;
/**
 * A Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 *Added a balance( ) method to Unicycle and Bicycle only
 *upcasting the instances of all three types and calling Balance()
 *Downcast the instances and calling balance( )
 */
class Cycle
{
    static Logger logger = Logger.getLogger(RegexClass.class.getName());
    Cycle()
    {
        logger.info("I am a cycle class");
    }
}
class Unicycle extends Cycle
{
    Unicycle()
    {
        super();
        logger.info("I am a unicycle class\n");

    }
    public void balance()
    {
        logger.info("unicycles are balanced\n");
    }
}

class Bicycle extends Cycle
{
    Bicycle(){
        super();
        logger.info("I am a bicycle class\n");
    }
    public void balance()
    {
        logger.info("bicycles are balanced\n");
    }
}

class Tricycle extends Cycle
{
    Tricycle(){
        super();
        logger.info("I am a tricycle class\n");
    }
}
class Main
{
    public static void main(String args[])
    {
        Cycle cycleType[] = new Cycle[3];

        cycleType[0] = new Unicycle();
        cycleType[1] = new Bicycle();
        cycleType[2] = new Tricycle();

        //upcasting
        /*
         cycle[0].balance();
         cycle[1].balance();
         cycle[2].balance();
         */

        //downcasting
        ((Unicycle)cycleType[0]).balance();
        ((Bicycle)cycleType[1]).balance();
        //((TriCycle)cycles[2]).balance() { no balance method defined }
    }
}

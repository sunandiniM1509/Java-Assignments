import java.util.logging.Logger;

/**
 *A Cycl interface, with implementations Unicycl, Bicycl and Tricycl
 * factories for each type of Cycle are generated
 */
interface cycl
{
    static Logger logger = Logger.getLogger(RegexClass.class.getName());
     /**
     *Method to know how many wheels the cycl has
     */
    void getWheels();
    /**
     *Method to know if the cycl is balanced
     */
    void setBalance();
}

class Unicycl implements cycl
{
    int wheels;
    boolean balance;
    Unicycl()
    {
        logger.info("It is a unicycle");
        this.wheels = 1;
        this.balance = true;
    }
    @Override
    public void getWheels()
    {
        logger.info("A unicycle has "+wheels+" wheel");
    }
    @Override
    public void setBalance()
    {
        logger.info("It is "+balance+" that I am balanced");
    }
}

class Bicycl implements cycl {
    int wheels;
    boolean balance;

    Bicycl() {
        logger.info("It is a bicycle");
        this.wheels = 2;
        this.balance = true;
    }
    @Override
    public void getWheels()
    {
        logger.info("A bicycle has " + wheels + " wheels");
    }
    @Override
    public void setBalance()
    {
        logger.info("It is " + balance + " that I am balanced");
    }
}
class Tricycl implements cycl {
    int wheels;
    boolean balance;

    Tricycl() {
        logger.info("It is a tricycle\n");
        this.wheels = 3;
        this.balance = false;
    }
    @Override
    public void getWheels()
    {
        logger.info("A tricycle has " + wheels + " wheels");
    }
    @Override
    public void setBalance()
    {
        logger.info("It is " + balance + " that I am balanced");
    }
}
class CycleFactory
{
    public static cycl callUnicycle()
    {
        return new Unicycl();
    }
    public static cycl callBicycle()
    {
        return new Bicycl();
    }
    public static cycl callTricycle()
    {
        return new Tricycl();
    }

}
class Factory
{
    public static void main(String []args)
    {
        cycl ucycle = CycleFactory.callUnicycle();
        cycl bcycle = CycleFactory.callBicycle();
        cycl tcycle = CycleFactory.callTricycle();

        ucycle.getWheels();
        bcycle.getWheels();
        tcycle.getWheels();
    }
}

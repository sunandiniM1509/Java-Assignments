import java.util.*;
import java.io.*;
/**
*Creating an inheritance hierarchy, adding few common methods in Base class which are overriden in the derived classes
*/
abstract class Rodent
{
    int speed;
    Rodent()
    {
        System.out.println("Hi, we are rodents, we are the tiny animals ");
    }
    /**
    *Method to provide what and how much the rodent eats
    */
    abstract public void eatingCapacity();
    /**
    *Method to provide the speed of the rodent
    */
    abstract public void getSpeed();
    
}
class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("I am a Mouse");
        speed = 30;
    }
    @Override
    public void eatingCapacity()
    {
        System.out.println("I eat all.");
    }
    @Override
    public void getSpeed()
    {
        System.out.println("I'm healthy, so I run faster at a speed of "+speed+" kmph");
        System.out.println();
    }
}
class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("I am a Gerbil");
        speed = 15;
    }
    @Override
    public void eatingCapacity()
    {
        System.out.println("I only eat leaves");
    }
    @Override
    public void getSpeed()
    {
        System.out.println("I'm run slow at a speed of "+speed+" kmph");
        System.out.println();
    }

}

class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("I am a Hamster");
        speed = 3;
    }
    @Override
    public void eatingCapacity()
    {
        System.out.println("I eat and sleep");
    }
    @Override
    public void getSpeed()
    {
        System.out.println("I am very slow, I walk at a speed of "+speed+" kmph");
        System.out.println();
    }

}
public class Hierarchy
{
    public static void main(String args[])
    {
        Rodent rodentType[] = new Rodent[3];
        rodentType[0] = new Mouse();
        rodentType[0].eatingCapacity();
        rodentType[0].getSpeed();

        rodentType[1] = new Gerbil();import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
 *Creating an inheritance hierarchy, adding few common methods in Base class which are overriden in the derived classes
 */
abstract class Rodent
{
    static Logger logger = Logger.getLogger(Rodent.class.getName());
    int speed;
    Rodent()
    {
        logger.info("Hi, we are rodents, we are the tiny animals ");
    }
    /**
     *Method to provide what and how much the rodent eats
     */
    abstract public void eatingCapacity();
    /**
     *Method to provide the speed of the rodent
     */
    abstract public void getSpeed();

}
class Mouse extends Rodent
{
    Mouse()
    {
        logger.info("I am a Mouse");
        speed = 30;
    }
    @Override
    public void eatingCapacity()
    {
        logger.info("I eat all.");
    }
    @Override
    public void getSpeed()
    {
        logger.info("I'm healthy, so I run faster at a speed of "+speed+" kmph");
        logger.info("----------------------------------------------------------");
    }
}
class Gerbil extends Rodent
{
    Gerbil()
    {
        logger.info("I am a Gerbil");
        speed = 15;
    }
    @Override
    public void eatingCapacity()
    {
        logger.info("I only eat leaves");
    }
    @Override
    public void getSpeed()
    {
        logger.info("I'm run slow at a speed of "+speed+" kmph");
        logger.info("----------------------------------------------------------");
    }

}

class Hamster extends Rodent
{
    Hamster()
    {
        logger.info("I am a Hamster");
        speed = 3;
    }
    @Override
    public void eatingCapacity()
    {
        logger.info("I eat and sleep");
    }
    @Override
    public void getSpeed()
    {
        logger.info("I am very slow, I walk at a speed of "+speed+" kmph");
        logger.info("----------------------------------------------------------");
    }

}
public class Hierarchy
{
    public static void main(String args[])
    {
        Rodent rodentType[] = new Rodent[3];
        rodentType[0] = new Mouse();
        rodentType[0].eatingCapacity();
        rodentType[0].getSpeed();

        rodentType[1] = new Gerbil();
        rodentType[1].eatingCapacity();
        rodentType[1].getSpeed();

        rodentType[2] = new Hamster();
        rodentType[2].eatingCapacity();
        rodentType[2].getSpeed();

    }
}



        rodentType[1].eatingCapacity();
        rodentType[1].getSpeed();

        rodentType[2] = new Hamster();
        rodentType[2].eatingCapacity();
        rodentType[2].getSpeed();

    }
}



import java.util.*;
import java.io.*;
abstract class Rodent
{
    int speed;
    Rodent()
    {
        System.out.println("Hi, we are rodents, we are the tiny animals ");
    }
    abstract public void getSpeed();
    abstract public void eatingCapacity();
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

        rodentType[1] = new Gerbil();
        rodentType[1].eatingCapacity();
        rodentType[1].getSpeed();

        rodentType[2] = new Hamster();
        rodentType[2].eatingCapacity();
        rodentType[2].getSpeed();

    }
}



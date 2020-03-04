
class Cycle
{
    Cycle()
    {
        System.out.println("I am a cycle class");
    }
}
class Unicycle extends Cycle
{
    Unicycle()
    {
        super();
        System.out.println("I am a unicycle class\n");

    }
    public void balance()
    {
        System.out.println("unicycles are balanced\n");
    }
}

class Bicycle extends Cycle
{
    Bicycle(){
        super();
        System.out.println("I am a bicycle class\n");
    }
    public void balance()
    {
        System.out.println("bicycles are balanced\n");
    }
}

class Tricycle extends Cycle
{
    Tricycle(){
        super();
        System.out.println("I am a tricycle class\n");
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
        // cycle[0].balance();
        // cycle[1].balance();
        // cycle[2].balance();

        //downcasting
        ((Unicycle)cycleType[0]).balance();
        ((Bicycle)cycleType[1]).balance();
        //((TriCycle)cycles[2]).balance() { no balance method defined }

    }
}


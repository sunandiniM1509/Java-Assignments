
//Creating and implenting code that uses factories
interface cycl
{
    void getWheels();
    void setBalance();
}

class Unicycl implements cycl
{
    int wheels;
    boolean balance;
    Unicycl()
    {
        System.out.println("It is a unicycle");
        this.wheels = 1;
        this.balance = true;
    }
    @Override
    public void getWheels()
    {
        System.out.println("A unicycle has "+wheels+" wheel");
    }
    @Override
    public void setBalance()
    { 
    System.out.println("It is "+balance+" that I am balanced");
    }
}

class Bicycl implements cycl {
    int wheels;
    boolean balance;

    Bicycl() {
        System.out.println("It is a bicycle");
        this.wheels = 2;
        this.balance = true;
    }
    @Override
    public void getWheels() {
        System.out.println("A bicycle has " + wheels + " wheels");
    }
    @Override
    public void setBalance() {
        System.out.println("It is " + balance + " that I am balanced");
    }
}
class Tricycl implements cycl {
    int wheels;
    boolean balance;

    Tricycl() {
        System.out.println("It is a tricycle\n");
        this.wheels = 3;
        this.balance = false;
    }
    @Override
    public void getWheels() {
        System.out.println("A tricycle has " + wheels + " wheels");
    }
    @Override
    public void setBalance() {
        System.out.println("It is " + balance + " that I am balanced");
    }
}
class CycleFactory
{
    //Factory Methods
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


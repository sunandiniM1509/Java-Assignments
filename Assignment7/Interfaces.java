import java.util.logging.Logger;

/**
 *Three interfaces, each with two methods are created
 */
interface interface1
{
    void method1();
    void method2();
}
interface interface2
{
    void method3();
    void method4();
}
interface interface3
{
    void method5();
    void method6();
}

/**
 *An interface which implements all the three interfaces
 */
interface interface4 extends interface1,interface2,interface3
{
    void method7();
}

class ConcreteClass
{
    static Logger logger = Logger.getLogger(RegexClass.class.getName());
    String sname="Sunandini";
    void display()
    {
        logger.info(sname);
    }
}
/**
*class which implements the new interface and also extends from a concrete class is generated
 *and passing objects of this class and pass it to all methods
 */
class ChildOfConcrete extends ConcreteClass implements interface4
{
    @Override
    public void method1() {
        logger.info("Overriding method1 of interface1");
    }

    @Override
    public void method2() {
        logger.info("Overriding method2 of interface1");
    }

    @Override
    public void method3() {
        logger.info("Overriding method3 of interface2");
    }

    @Override
    public void method4() {
        logger.info("Overriding method4 of interface2");
    }

    @Override
    public void method5() {
        logger.info("Overriding method5 of interface3");
    }

    @Override
    public void method6() {
        logger.info("Overriding method6 of interface3");
    }

    @Override
    public void method7() {
        logger.info("Overriding method7 of interface4");
    }
}
class Interfaces
{
    public static void generateMethod1(interface1 obj){ obj.method1(); }
    public static void generateMethod2(interface2 obj){ obj.method3(); }
    public static void generateMethod3(interface3 obj){ obj.method5(); }
    public static void generateMethod4(interface4 obj){ obj.method6(); }
    public static void main(String args[])
    {
        ChildOfConcrete object = new ChildOfConcrete();
        generateMethod1(object);
        generateMethod2(object);
        generateMethod3(object);
        generateMethod4(object);
    }
}

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

interface interface4 extends interface1,interface2,interface3
{
    void method7();
}

class ConcreteClass
{
    String s="Sunandini";
    void display()
    {
        System.out.println(s);
    }
}

class ChildOfConcrete extends ConcreteClass implements interface4
{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }
}

class Interfaces
{   
    public static void m1(interface1 obj){ obj.method1(); }
    public static void m2(interface2 obj){ obj.method3(); }
    public static void m3(interface3 obj){ obj.method5(); }
    public static void m4(interface4 obj){ obj.method6(); }
    public static void main(String args[])
    {
        ChildOfConcrete object = new ChildOfConcrete();
        m1(object);
        m2(object);
        m3(object);
        m4(object);
    }
}


/**
*A class with a constructor that takes a String argument and during construction it prints the argument. 
*an array of object references to this class are created but objects are not created to assign into the array. 
*/
class Print
{
    String s;
    Print(String s)
    {
        this.s = s;
        System.out.println(s);
    }

}
class Printer
{
    public static void main(String args[])
    {
        Print printerobjects[]  = new Print[10];
        // No, the initialization messages from the constructor calls are not printed.
    }
}

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
    	// array of references to the class.
        Print printerobjects[]  = new Print[10];
        // No, the initialization messages from the constructor calls are not printed.

    }
}

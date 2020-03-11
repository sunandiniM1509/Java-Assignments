/**
*creating objects to attach to the array of references
*/
class Attach
{
    String str;
    Attach(String str)
    {
        this.str = str;
        System.out.println(str);

    }

}
class Attacher
{
    public static void main(String args[])
    {
        Attach attachobjs[]  = new Attach[11];
        // The initialization messages from the constructor calls are not printed.
        for(int i=1;i<11;i++)
            //The initialization messages are printed.
            attachobjs[i] = new Attach(String.valueOf(i));
    }
}

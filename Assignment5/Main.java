package sunandini.assignment.main;
import sunandini.assignment.data.*;
import sunandini.assignment.singleton.*;

public class Main {
/**
*Java function creating object of first class and call both the methods to print the values
*creating object of second class using static method and then call the other method to print the String
*/
	public static void main(String[] args) {

		Data data = new Data();
		data.printdata();
                //data.print() does not work as local values need to be Initialized
		Singelton singletonObj = Singelton.initString("Duke!");
		singletonObj.print();
	}
 }




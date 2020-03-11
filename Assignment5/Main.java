package sunandini.assignment.main;
import sunandini.assignment.data.*;
import sunandini.assignment.singleton.*;

public class Main {

	public static void main(String[] args) {

		Data data = new Data();
		data.printdata();
                //data.print() does not work as local values need to be Initialized
		Singelton singletonObj = Singelton.initString("Duke!");
		singletonObj.print();
	}
 }




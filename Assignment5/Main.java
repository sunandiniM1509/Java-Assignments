package sunandini.assignment.main;
import sunandini.assignment.data.*;
import sunandini.assignment.singleton.*;

public class Main {

	public static void main(String[] args) {

		Data d = new Data();
		d.printdata();
		Singelton s = Singelton.initString("Duke!");
		s.print();
	}
 }




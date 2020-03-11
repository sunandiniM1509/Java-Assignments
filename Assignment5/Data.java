package sunandini.assignment.data;
public class Data {
private static Logger logger = Logger.getLogger(RegexClass.class.getName());
private int varInt;
private char varChar;
/**
*Java class containing an int and a char member variables that are not initialized,
*Java function to print the non initialized variables of the class.
*/
public void printdata()
{
	logger.info("The value of varInt is: "+varInt);
	logger.info("The value of varChar is: "+varChar);
}
/**
*Another method in the same class with two local variables and printing their values without initializing them.
*/
/*void print()
{
	int varInt2;
	char varChar2;
	logger.info("The value of varInt2 is: "+varInt2);
	logger.info("The value of varChar2 is: "+varChar2);
}*/
//Inorder to print the values we need to initialize them	
}


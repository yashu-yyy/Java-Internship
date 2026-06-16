/*
* TASK 3- Collections & Exception Handling
* Implement try-catch blocks
* G Yashaswi
* 15/06/2026
*/

import java.util.*;

class TryCatch
{
public static void main(String args[])
{
try
{
Scanner s = new Scanner(System.in);
System.out.println("Please enter a,b values :");
int a = s.nextInt();
int b = s.nextInt();
int c = a/b;
System.out.println("Division done successfully, quotient :"+c+", remainder :"+(a%b));
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(InputMismatchException e)
{
System.out.println(e);
}
catch(Exception e) //must be written at last, if must
{
e.printStackTrace();
}
finally
{
System.out.println("Program terminated");
}
}
}

/*
* TASK 3- Collections & Exception Handling
* Custom Exception: InvalidAgeException
* G Yashaswi
* 15/06/2026 
*/

import java.util.Scanner;

class InvalidAgeException extends Exception
{
InvalidAgeException(String msg)
{
super(msg);
}
}

class UserException
{
static void determine(int age) throws InvalidAgeException
{
if(age<18)
throw new InvalidAgeException("not eligible");
else
System.out.println("eligible");
}

public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Please enter the age :");
int n=s.nextInt();
try
{
determine(n);
}
catch(InvalidAgeException e)
{
System.out.println(e);
}
}
}
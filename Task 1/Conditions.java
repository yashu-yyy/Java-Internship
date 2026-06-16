/*
* TASK 1- Java Basics & OOP Fundamentals
* Simple Java program of conditions
* G Yashaswi
* 16/06/2026 
*/

import java.util.Scanner;

public class Conditions
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter a number :");
int num = s.nextInt();

if (num>0)
{
System.out.println(num+" is positive");
if (num%2==0)
System.out.println(num+" is even");
else
System.out.println(num+" is odd");
}
else if (num==0)
System.out.println("number is zero");
else
System.out.println(num+" is negative");
}
}
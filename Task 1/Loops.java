/*
* TASK 1- Java Basics & OOP Fundamentals
* Simple Java program of loops
* G Yashaswi
* 16/06/2026 
*/

import java.util.Scanner;
class Loops
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Enter a number :");
int num = s.nextInt();

System.out.println("\nPattern with for loop:");
for(int i=1; i<=num; i++)
{
for (int j=1; j<=i; j++)
{
System.out.print(i+" ");
}
System.out.println();
}

System.out.println("\nPattern with while loop :");
int k = num;
while (k>=1)
{
int l=1;
while (l<=k)
{
System.out.print(k+" ");
l++;
}
System.out.println();
k--;
}
}
}
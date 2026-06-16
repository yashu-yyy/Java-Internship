/*
* TASK 1- Java Basics & OOP Fundamentals
* Simple Java program of array
* G Yashaswi
* 16/06/2026
*/

import java.util.Scanner;
import java.util.Arrays;

class ArraySum
{
public static void main(String args[])
{
int i,j,sum=0;
Scanner s = new Scanner(System.in);
System.out.print("Enter size of array :");
int []a = new int[s.nextInt()];

System.out.println("Enter array elements :");
for (i=0;i<a.length;i++)
a[i] = s.nextInt();

System.out.println("Array elements are :"+Arrays.toString(a));

for(i=0;i<a.length;i++)
sum +=a[i];
System.out.println("Sum of all elements in the array is :"+sum);
}
}
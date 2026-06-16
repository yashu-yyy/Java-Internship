/*
* TASK 1- Java Basics & OOP Fundamentals
* Encapsulation with getters and setters
* G Yashaswi
*16/06/2026 
*/

import java.util.Scanner;

class AgeClass
{
private int age;
void setAge(int age)
{
this.age = age;
}
int getAge()
{
return this.age;
}
}
class GetterSetter
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
System.out.print("Please enter the age :");
int a = s.nextInt();

AgeClass ac = new AgeClass();
ac.setAge(a);
System.out.println("Entered age is :"+ac.getAge());
}
}
/*
* TASK 1- Java Basics & OOP Fundamentals
* Implementing classes, objects, inheritance, and polymorphism
* G Yashaswi
* 16/06/2026 
*/

class BaseClass
{
BaseClass()
{
System.out.println("--------Base class constructor executed before Derived Class constructor--------");
System.out.println("BaseClass constructor called");
}
void display()
{
System.out.println("This is base class display() method");
}
}

class DerivedClass extends BaseClass //single inheritance
{
DerivedClass()
{
System.out.println("DerivedClass constructor called");
}
@Override
void display()
{
System.out.println("This is derived class display() method");
}
void display(String msg) //overloading
{
System.out.println("Message :"+msg);
}
public static void main(String args[])
{
//Dynamic Method Dispatch
System.out.println("\nRuntime polymorphism :");
BaseClass bobj = new DerivedClass();
bobj.display();

System.out.println("\nCompile-Time polymorphism :");
DerivedClass dobj = new DerivedClass();
dobj.display();
dobj.display("end of program");
}
}

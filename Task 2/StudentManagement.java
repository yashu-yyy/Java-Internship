/*
* TASK 2- Console-based mini project
* Student Management Program
* User input via Scanner
* Conditional logic and loops
* G Yashaswi
*15/06/2026
*/

import java.util.Scanner;

class StudentManagement
{
public static void main(String args[])
{
String[] students = new String[100];
int count=0;

while(true)
{
System.out.println("\nStudent Management System Menu");
System.out.println("1. Add Student");
System.out.println("2. View Students");
System.out.println("3. Search Student");
System.out.println("4. Exit");
Scanner s = new Scanner(System.in);
System.out.println("Enter your choice :");
int ch = s.nextInt();

if(ch==1)
{
System.out.println("Enter the student name you want to add:");
String name = s.next();
s.nextLine();
students[count] = name;
count++;
System.out.println("Student added successfully\n");
}

else if(ch==2)
{
if(count==0)
System.out.println("No students added yet\n");
else
{
System.out.println("Students list:");
for(int i=0; i<count; i++)
{
System.out.println((i+1)+" "+students[i]);
}
}
}

else if(ch==3)
{
System.out.println("Enter studdent name to search :");
String se = s.next();
s.nextLine();
boolean found = false;
for(int i=0; i<count; i++)
{
if(students[i].equalsIgnoreCase(se))
{
found = true;
break;
}
}
if (found==true)
System.out.println("Student "+se+" found in student list");
else
System.out.println("Student "+se+" not found in student list");
}

else if(ch==4)
{
System.out.println("Thank You");
break;
}
else
{
System.out.println("Invalid Choice!");
continue;
}
}
}
}



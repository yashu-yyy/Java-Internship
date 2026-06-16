/*
* TASK 3- Collections & Exception Handling
* ArrayList, HashMap, and HashSet 
* G Yashaswi
* 15/06/2026
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

class CollectionsFramework
{
public static void main(String []args)
{

//ArrayList
ArrayList<Integer> al = new ArrayList<>();
al.add(0,10); //add an element
al.add(20);
al.add(30);
al.add(40);
al.add(50);
System.out.println("ArrayList :"+al);
System.out.println("Size :"+al.size()); 
System.out.println("Element at index 1 :"+al.get(1)); 
al.set(2,60); 
System.out.println("After replacing index 2 :"+al);
al.remove(1);
System.out.println("After removing index 1 :"+al);
al.clear();
System.out.println("After clear:"+al);
System.out.println();

//HashMap
HashMap<Integer,String> hm = new HashMap<>();
hm.put(1,"Aa");
hm.put(2,"Bb");
hm.put(3,"Cc");
System.out.println("HashMap :"+hm);
System.out.println("Size :"+hm.size());
System.out.println("Retrieving value for key(1) :"+hm.get(1));
hm.remove(1);
System.out.println("After removing a pair :"+hm);
System.out.println("Check for presence of a key(2) :"+hm.containsKey(2));
System.out.println("Check for presence of a value(\"Cc\") :"+hm.containsValue("Cc"));
System.out.println();

//HashSet
HashSet<Integer> hs = new HashSet<>();
hs.add(1);
hs.add(2);
hs.add(3);
System.out.println("HashSet :"+hs);
System.out.println("Size :"+hs.size());
hs.add(1);
System.out.println("After adding 1 again(doesn't allow duplicates) :"+hs);
System.out.println("Checking if 1 is present or not :"+hs.contains(1));
hs.remove(1);
System.out.println("After removing 1, again checking :"+hs.contains(1));
System.out.println();
}
}
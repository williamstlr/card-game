/*
I used this file mostly to figure out how array lists worked.
*/

import java.util.*;
 

public class Scratch {
	
	

public static void main(String[] args)
      {
      
      //ArrayList Testing
      ArrayList list1 = new ArrayList();
      
      //Add two things
      list1.add("A");
      list1.add("B");
      
      //Loop though and add the numbers 1-10 into list1
      for (int i = 0; i <= 10; i++)
      {
         list1.add(i);
      }
      
      //print object 0
      System.out.println(list1.get(0));
      
      //Tell me how many objects are in my array list
      System.out.println("There are " + list1.size() + " objects in this ArrayList");
      
      
      //Loop through all objects in list1
      for (int i = 0; i < list1.size(); i++)
      {
         System.out.println(list1.get(i));
      }
      
      //Show me what's in spot 0, then remove it and move everything up
      System.out.println(list1.get(0));
      list1.remove(0);
      
      
      //Show me what's in spot 1, then remove it and move everything up
      System.out.println(list1.get(0));
      list1.remove(0);
      
      //Show me what's in spot 1, then remove it and move everything up
      System.out.println(list1.get(0));
      list1.remove(0);
      
      
      
      
      }//end main
}//end Scratch
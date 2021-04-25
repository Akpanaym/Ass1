import java.util.*;
  
public class ArrayListAddExample {
    public static void main(String[] args)
    {
  
        // create an empty list with an initial capacity
        List<String> list = new ArrayList<String>();

        // use add() method 
        // adding elements in the list
        list.add("Welcome");
        list.add("to");
        list.add("ADS");
        list.add("course");
  
        // Adding new element in the index 0
        list.add(0, "Hello student!");
  
        // prints all 
        for (String str : list) {
            System.out.print(str + " ");
    }
}
}
import java.util.*;
  
public class Hash_Table_Demo {
    public static void main(String[] args)
    {
  
        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = 
                           new Hashtable<>(6);
  
        // Inserting values into the table
        //hash_table.put(0, "Geeks");
        //hash_table.put(1, "4");
        //hash_table.put(2, "Geeks");
        //hash_table.put(3, "Welcomes");
        hash_table.put(7, "You");
  
        // Displaying the Hashtable
        System.out.println("Initial table is: " + hash_table);
  
        // Inserting existing key along with new value
        //String returned_value = (String)hash_table.put(5, "All");
  
        // Verifying the returned value
        //System.out.println("Returned value is: " + returned_value);
  
        // Displaying the new table
        //System.out.println("New table is: " + hash_table);
    }
}
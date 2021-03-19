/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcodes;

/**
 *
 * @author HP
 */
import java.util.*;

public class Exercise2 {

    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        for(String element: list_Strings)
        {
            System.out.println(element + " "+"Simple ");
        }
        
        Iterator<String> itr = list_Strings.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

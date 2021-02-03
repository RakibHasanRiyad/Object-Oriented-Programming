/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.map;

import java.util.*;

/**
 *
 * @author HP
 */
class MapSort {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Vijay");
        map.put(101, "Rahul");
        //Returns a Set view of the mappings contained in this map        
        map.entrySet()
                //Returns a sequential Stream with this collection as its source  
                .stream()
                //Sorted according to the provided Comparator  
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream  
                .forEach(System.out::println);
    }
}

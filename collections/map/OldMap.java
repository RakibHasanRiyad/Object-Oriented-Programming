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
public class OldMap {

    public static void main(String[] args) {
        Map map = new HashMap();
        //Adding elements to map  
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        //Traversing Map  
        Set set = map.entrySet();//Converting to Set so that we can traverse  
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately  
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

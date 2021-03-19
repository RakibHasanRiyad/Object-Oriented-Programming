/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legacycollection;

/**
 *
 * @author HP
 */
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

    public static void main(String[] args) {
        Properties pr = new Properties();
        pr.put("Joey", "Friends");
        pr.put("Rachel", " Friends ");
        pr.put("Phoebe", " Friends ");
        pr.put("Chandler", " Friends ");
        Set<?> creator = pr.keySet();
        for (Object ob : creator) {
            System.out.println(ob + " stars in " + pr.getProperty((String) ob));
        }
    }
}
